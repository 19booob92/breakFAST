package org.breakfast.hrm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/user")
public class UserController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUserName() {
        return "test user name";
    }
}
