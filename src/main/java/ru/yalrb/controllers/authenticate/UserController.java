package ru.yalrb.controllers.authenticate;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @GetMapping
    public ResponseEntity<String> sayHello() {


        return new ResponseEntity<>(
                "Hello from secured user endpoint",
                HttpStatus.OK
        );
    }


}
