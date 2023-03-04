package ru.yalrb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.yalrb.entity.models.AgeRange;
import ru.yalrb.repository.AgeRangeRepository;

@Service
public class AgeRangeService {

    @Autowired
    private AgeRangeRepository ageRangeRepository;

    public void save(AgeRange ageRange) {
        ageRangeRepository.save(ageRange);
    }
}
