package com.chrispaika.tagwatchersvc.v1;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> sayHello() {
        ResponseEntity<String> responseString = new ResponseEntity<String>("Hello!", HttpStatus.OK);
        return responseString;
    }

}
