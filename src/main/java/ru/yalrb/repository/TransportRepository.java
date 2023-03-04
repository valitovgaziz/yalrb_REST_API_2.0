package ru.yalrb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yalrb.entity.models.Transport;

@Repository
public interface TransportRepository extends JpaRepository<Transport, Short> {
}
