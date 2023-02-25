package ru.yalrb.controllers.permitAll;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/search")
public class SearchController {


    @GetMapping
    public ResponseEntity<String> sayHello() {

        HttpHeaders headers = new HttpHeaders();

        headers.set("origing", "sadfasd");

        return new ResponseEntity<>(
                "Hello from non secured search endpoint",
                headers,
                HttpStatus.OK
        );
    }

}
