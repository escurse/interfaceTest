package com.escass.interfacetest.controllers;

import com.escass.interfacetest.results.greeting.WriteResult;
import com.escass.interfacetest.services.GreetingService;
import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/greeting")
@RequiredArgsConstructor
public class GreetingController {
    private final GreetingService greetingService;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
    public ModelAndView getGreeting() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(value="/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String postGreeting(@RequestParam(value = "index", required = false, defaultValue = "0") int index) {
        WriteResult result = this.greetingService.write();
        JSONObject response = new JSONObject();
        response.put("result", result.name());
        return response.toString();
    }
}
