package com.nibado.example.springmongo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "/whoami", method = RequestMethod.GET)
    public String whoami() {
        return "Niels";
    }
}
