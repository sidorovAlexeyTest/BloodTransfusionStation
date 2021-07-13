package org.sidorov.station.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.websocket.server.PathParam;

@RestController
public class HomeController {

    @GetMapping("/")
    public ModelAndView getHome() {
        ModelAndView view = new ModelAndView();
        view.setViewName("index.html");
        return view;
    }

    @GetMapping("/hello")
    public ModelAndView getPetrov() {
        ModelAndView view = new ModelAndView();
        view.setViewName("hello_petrov.html");
        return view;
    }
}
