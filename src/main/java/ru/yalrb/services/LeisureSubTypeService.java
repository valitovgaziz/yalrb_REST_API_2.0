package ru.yalrb.services;

import lombok.Data;
import org.springframework.stereotype.Service;
import ru.yalrb.entity.models.yalObject.LeisureSubType;
import ru.yalrb.repository.LeisureSubTypeRepository;

@Service
@Data
public class LeisureSubTypeService {

    private final LeisureSubTypeRepository leisureSubTypeRepository;

    public LeisureSubTypeService(LeisureSubTypeRepository leisureSubTypeRepository) {
        this.leisureSubTypeRepository = leisureSubTypeRepository;
    }

    public void save(LeisureSubType leisureType) {
        leisureSubTypeRepository.save(leisureType);
    }
}
