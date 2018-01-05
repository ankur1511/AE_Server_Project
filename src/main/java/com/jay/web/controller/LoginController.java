package com.jay.web.controller;

import com.jay.web.model.LoginEntity;
import com.jay.web.service.LoginService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
import io.swagger.annotations.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jkushwaha on 1/5/18.
 */
/*controller that handle the login api*/

@RestController
public class LoginController {

    @Autowired
    private LoginEntity loginEntity;

    @Autowired
    private LoginService loginService;

    @Autowired
    private ResponseEntity responseEntity;

    @RequestMapping(value = "/roles",
            method = RequestMethod.POST)
    public ResponseEntity postLoginData(
            @ApiParam(value = "New role info", required = true) @RequestBody LoginEntity login;
    ) {

        List<Error> errors = new ArrayList<>();
        ResponseEntity response = null;
        LoginEntity newLogin = createLogin(login); //loginService.createLogin(login);
        responseEntity = new ResponseEntity<>(newLogin, HttpStatus.CREATED);
        return responseEntity;
    }

    private void createLogin(LoginEntity loginEntity){

    }
}
