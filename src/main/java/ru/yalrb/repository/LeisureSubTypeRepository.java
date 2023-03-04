package ru.yalrb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.yalrb.entity.models.yalObject.LeisureSubType;

public interface LeisureSubTypeRepository extends JpaRepository<LeisureSubType, Long> {
}
