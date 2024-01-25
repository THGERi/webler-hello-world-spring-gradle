package hu.webler.weblerhelloworldspringgradle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/gradle/hello")
    public String hello() {
        return "Hello World from Gradle!";
    }
}
