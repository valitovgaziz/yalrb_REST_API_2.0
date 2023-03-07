package ru.yalrb.services;

import org.springframework.stereotype.Service;
import ru.yalrb.entity.models.account.Account;
import ru.yalrb.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void updateUser(Account account, List<String> fields) {
        userRepository.updateUser(account, fields);
    }

}
