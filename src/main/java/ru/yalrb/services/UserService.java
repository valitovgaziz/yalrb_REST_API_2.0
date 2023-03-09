package ru.yalrb.services;

import org.springframework.stereotype.Service;
import ru.yalrb.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

}
