package com.example.restservice;

import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private static final String fullNameTemplate = "%s %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    /**
     * @TODO:
     * Request POST
     * Przyjecie dwoch stringow ktore dodajemy do siebie,
     * zwrocic do klienta jako jeden string,
     * dodac godzine jako dodatkowe pole
     *
     * send to: kamil.biernat@globallogic.com
     */
    
    @ResponseBody @PostMapping("/get-user")
    public UserInfo contact(@RequestBody User user) {
    	LocalTime time = LocalTime.now();
        return new UserInfo(String.format(fullNameTemplate, user.getFirstName(), user.getLastName()), time);
    }
}
