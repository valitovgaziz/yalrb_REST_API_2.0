package ru.yalrb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yalrb.entity.models.yalObject.WorkLoadState;

@Repository
public interface WorkLoadStateRepository extends JpaRepository<WorkLoadState, Long> {
}
