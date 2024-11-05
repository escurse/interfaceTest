const $form = document.getElementById('form');

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
        const response = xhr.responseText;
        console.log(response);
    };
    xhr.open('POST', location.href);
    xhr.send(formData);
}