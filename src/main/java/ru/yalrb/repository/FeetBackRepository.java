package ru.yalrb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yalrb.entity.models.FeetBack;

@Repository
public interface FeetBackRepository extends JpaRepository<FeetBack, Long> {
}
