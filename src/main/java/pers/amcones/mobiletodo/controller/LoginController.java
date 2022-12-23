package pers.amcones.mobiletodo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pers.amcones.mobiletodo.entity.LoginDTO;
import pers.amcones.mobiletodo.entity.Result;
import pers.amcones.mobiletodo.service.LoginService;

@RestController
public class LoginController {
    @Autowired
    LoginService loginService;
    @PostMapping("/checkLogin")
    @CrossOrigin
    public Result login(@RequestBody LoginDTO loginDTO){
        return loginService.login(loginDTO);
    }
}
