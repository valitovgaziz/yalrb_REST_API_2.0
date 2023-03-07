package ru.yalrb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yalrb.entity.models.yalObject.Rate;

@Repository
public interface RateRepository extends JpaRepository<Rate, Long> {
}
