const $form = document.getElementById('form');
const $div = document.createElement('div');

$form.onsubmit = (e) => {
    e.preventDefault();
    const xhr = new XMLHttpRequest();
    const formData = new FormData();
    formData.append('writer', $form['writer'].value);
    formData.append('content', $form['content'].value);
    xhr.onreadystatechange = () => {
        if (xhr.readyState !== XMLHttpRequest.DONE) {
            return;
        }
        if (xhr.status < 200 || xhr.status >= 300) {
            alert('오류 발생');
            return;
        }
        const response = JSON.parse(xhr.responseText);
        const result = response["result"];
        if (result === "success") {
            $div.innerText = "메모를 성공적으로 작성하였습니다."
            $div.style.color = "green";
        } else {
            $div.innerText = "메모를 작성하지 못하였습니다."
            $div.style.color = "red";
        }
        $form.append($div);
        $form['writer'].value = "";
        $form['content'].value = "";
    };
    xhr.open('POST', location.href);
    xhr.send(formData);
}