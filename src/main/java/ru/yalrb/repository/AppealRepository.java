package ru.yalrb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yalrb.entity.models.appeal.Appeal;

@Repository
public interface AppealRepository extends JpaRepository<Appeal, Long> {
}
