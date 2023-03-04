package ru.yalrb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.yalrb.entity.models.yalObject.LeisureType;

public interface LeisureTypeRepository extends JpaRepository<LeisureType, Long> {
}
