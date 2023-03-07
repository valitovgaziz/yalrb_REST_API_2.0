package ru.yalrb.services;

import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;
import ru.yalrb.entity.models.yalObject.Rate;
import ru.yalrb.repository.RateRepository;

@Service
public class RateService {

    private final RateRepository rateRepository;


    public RateService(RateRepository rateRepository) {
        this.rateRepository = rateRepository;
    }

    public void saveRate(Rate rate) {
        rateRepository.save(rate);
    }

}
