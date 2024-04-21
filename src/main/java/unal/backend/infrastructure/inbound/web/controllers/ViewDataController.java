package unal.backend.infrastructure.inbound.web.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewDataController {

    @GetMapping("/hello")
    public String hello() {
            return "Hello, Hexagonal Architecture!";
        }

}
