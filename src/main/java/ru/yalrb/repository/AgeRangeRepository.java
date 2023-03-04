package ru.yalrb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yalrb.entity.models.AgeRange;

@Repository
public interface AgeRangeRepository extends JpaRepository<AgeRange, Long> {
}
