package ru.yalrb.services;

import org.springframework.stereotype.Service;
import ru.yalrb.entity.models.Contact;
import ru.yalrb.repository.ContactRepository;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public void saveContact(Contact contact) {
        contactRepository.save(contact);
    }

}
