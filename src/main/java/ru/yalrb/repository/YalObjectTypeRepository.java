package ru.yalrb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.yalrb.entity.models.yalObject.YalObjectType;

public interface YalObjectTypeRepository extends JpaRepository<YalObjectType, Long> {
}
