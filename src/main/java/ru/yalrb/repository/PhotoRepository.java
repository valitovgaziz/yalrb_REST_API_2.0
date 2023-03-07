package ru.yalrb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yalrb.entity.models.Photo;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long> {
}
