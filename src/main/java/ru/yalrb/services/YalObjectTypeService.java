package ru.yalrb.services;

import lombok.Data;
import org.springframework.stereotype.Service;
import ru.yalrb.entity.models.yalObject.YalObjectType;
import ru.yalrb.repository.YalObjectTypeRepository;

@Service
@Data
public class YalObjectTypeService {

    private YalObjectTypeRepository yalObjectTypeRepository;

    public void save(YalObjectType yalObjectType) {
        yalObjectTypeRepository.save(yalObjectType);
    }
}
