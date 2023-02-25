package ru.yalrb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.yalrb.entity.Account;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Account, Long> {

    Optional<Account> findByEmail(String email);

}
