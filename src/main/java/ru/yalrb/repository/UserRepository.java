package ru.yalrb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yalrb.entity.models.account.Account;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Account, Long> {

    Optional<Account> findByEmail(String email);

}
