package ru.yalrb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yalrb.entity.models.yalObject.YalObject;

import java.util.UUID;

@Repository
public interface YalObjectRepository extends JpaRepository<YalObject, UUID> {

}
