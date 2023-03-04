package ru.yalrb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yalrb.entity.models.yalObject.LeisureType;

@Repository
public interface LeisureTypeRepository extends JpaRepository<LeisureType, Long> {
}
