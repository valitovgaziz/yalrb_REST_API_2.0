package ru.yalrb.services;

import lombok.Data;
import org.springframework.stereotype.Service;
import ru.yalrb.repository.YalObjectRepository;

@Service
@Data
public class YalObjectSerivice {

    YalObjectRepository yalObjectRepository;

}
