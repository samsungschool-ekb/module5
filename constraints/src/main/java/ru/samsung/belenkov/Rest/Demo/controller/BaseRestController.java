package ru.samsung.belenkov.Rest.Demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.samsung.belenkov.Rest.Demo.model.Greeting;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class BaseRestController {

    private AtomicInteger count = new AtomicInteger();
    private String greetingTemplate = "Hello %s!";

    @RequestMapping("/greeting")
    public Greeting greetUser(@RequestParam(value = "name", defaultValue = "Admin!") int name) {
        return new Greeting(count.incrementAndGet(), String.format(greetingTemplate, name));
    }
}
