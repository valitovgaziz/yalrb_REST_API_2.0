package ru.yalrb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yalrb.entity.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
