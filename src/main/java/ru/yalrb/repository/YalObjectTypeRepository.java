package ru.yalrb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yalrb.entity.models.yalObject.YalObjectType;

@Repository
public interface YalObjectTypeRepository extends JpaRepository<YalObjectType, Long> {
}
