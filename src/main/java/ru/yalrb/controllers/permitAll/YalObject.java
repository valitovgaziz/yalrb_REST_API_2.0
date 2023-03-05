package ru.yalrb.controllers.permitAll;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.yalrb.services.YalObjectSerivice;

@Service
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/yalObject")
public class YalObject {

    private YalObjectSerivice yalObjectSerivice;

    @GetMapping
    public String getYalObject() {
        return "";
    }



}
