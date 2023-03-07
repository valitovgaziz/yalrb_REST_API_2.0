package ru.yalrb.services;

import org.springframework.stereotype.Service;
import ru.yalrb.entity.models.appeal.Appeal;
import ru.yalrb.repository.AppealRepository;

@Service
public class AppealService {

    private final AppealRepository appealRepository;

    public AppealService(AppealRepository appealRepository) {
        this.appealRepository = appealRepository;
    }

    public void save(Appeal appeal) {
        appealRepository.save(appeal);
    }


}
