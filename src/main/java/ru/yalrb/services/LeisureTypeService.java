package ru.yalrb.services;

import org.springframework.stereotype.Service;
import ru.yalrb.entity.models.yalObject.LeisureType;
import ru.yalrb.repository.LeisureTypeRepository;

@Service
public class LeisureTypeService {

    private final LeisureTypeRepository repository;

    public LeisureTypeService(LeisureTypeRepository repository) {
        this.repository = repository;
    }


    public void save(LeisureType leisureType) {
        repository.save(leisureType);
    }
}
