package ru.yalrb.services;

import org.springframework.stereotype.Service;
import ru.yalrb.entity.models.State;
import ru.yalrb.repository.StateRepository;

@Service
public class StateService {

    private final StateRepository stateRepository;


    public StateService(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }

    public void saveState(State state) {
        stateRepository.save(state);
    }

}
