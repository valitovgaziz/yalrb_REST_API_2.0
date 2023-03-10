package ru.yalrb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yalrb.entity.models.yalObject.LeisureSubType;

@Repository
public interface LeisureSubTypeRepository extends JpaRepository<LeisureSubType, Long> {
}
