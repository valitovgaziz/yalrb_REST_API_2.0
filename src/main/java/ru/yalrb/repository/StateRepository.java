package ru.yalrb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yalrb.entity.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {
}
