package ru.yalrb.services;

import org.springframework.stereotype.Service;
import ru.yalrb.entity.models.FeetBack;
import ru.yalrb.repository.FeetBackRepository;

@Service
public class FeetBackService {

    private final FeetBackRepository feetBackRepository;


    public FeetBackService(FeetBackRepository feetBackRepository) {
        this.feetBackRepository = feetBackRepository;
    }

    public void saveFeetBack(FeetBack feetBack) {
        feetBackRepository.save(feetBack);
    }

}
