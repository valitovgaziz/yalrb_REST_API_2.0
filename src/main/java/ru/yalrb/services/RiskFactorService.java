package ru.yalrb.services;

import org.springframework.stereotype.Service;
import ru.yalrb.entity.models.RiskFactor;
import ru.yalrb.repository.RiskFactorRepository;

@Service
public class RiskFactorService {


    private final RiskFactorRepository riskFactorRepository;

    public RiskFactorService(RiskFactorRepository riskFactorRepository) {
        this.riskFactorRepository = riskFactorRepository;
    }


    public void save(RiskFactor riskFactor) {
        riskFactorRepository.save(riskFactor);
    }
}
