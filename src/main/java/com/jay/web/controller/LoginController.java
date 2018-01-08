package com.jay.web.controller;

import com.jay.web.model.LoginEntity;
import com.jay.web.service.LoginService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jkushwaha on 1/5/18.
 */
/*controller that handle the login api*/

@RestController
public class LoginController {

	@Autowired
    private LoginEntity loginEntity = new LoginEntity();
    
    @RequestMapping(value = "/welcome" )
    public ResponseEntity<LoginEntity> User(){
    	loginEntity.setUserId(123);
    	loginEntity.setPassword("Jay");
    	
    	ResponseEntity<LoginEntity> res = null;
    	res = new ResponseEntity<LoginEntity>(loginEntity,HttpStatus.OK);
    	
		return res;
    	
    }
}
