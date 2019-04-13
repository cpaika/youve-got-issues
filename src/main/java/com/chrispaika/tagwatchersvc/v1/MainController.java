package com.chrispaika.tagwatchersvc.v1;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    public ResponseEntity<String> sayHello() {
        ResponseEntity<String> responseString = new ResponseEntity<String>("Hello", HttpStatus.OK);
        return responseString;
    }

}
