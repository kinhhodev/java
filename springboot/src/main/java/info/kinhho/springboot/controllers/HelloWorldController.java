package info.kinhho.springboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/" )
public class HelloWorldController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello World";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String helloAbout() {
        return "About us!";
    }
}
