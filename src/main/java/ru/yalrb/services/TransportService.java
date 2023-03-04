package ru.yalrb.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.yalrb.entity.models.Transport;
import ru.yalrb.repository.TransportRepository;

@Service
@RequiredArgsConstructor
public class TransportService {

    private TransportRepository transportRepository;

    @Autowired
    public TransportService(TransportRepository transportRepository) {
        this.transportRepository = transportRepository;
    }

    public void save(Transport transport) {

        transportRepository.save(transport);

    }
}
