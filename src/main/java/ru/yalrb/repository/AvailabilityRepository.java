package ru.yalrb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yalrb.entity.models.yalObject.Availability;

@Repository
public interface AvailabilityRepository extends JpaRepository<Availability, Long> {
}
