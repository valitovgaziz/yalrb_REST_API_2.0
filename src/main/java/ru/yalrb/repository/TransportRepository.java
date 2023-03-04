package ru.yalrb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.yalrb.entity.models.Transport;

public interface TransportRepository extends JpaRepository<Transport, Short> {
}
