package ru.yalrb.services;

import org.springframework.stereotype.Service;
import ru.yalrb.entity.models.yalObject.Availability;
import ru.yalrb.repository.AvailabilityRepository;

@Service
public class AvailabilityService {

    private final AvailabilityRepository availabilityRepository;


    public AvailabilityService(AvailabilityRepository availabilityRepository) {
        this.availabilityRepository = availabilityRepository;
    }

    public void saveAvailability(Availability availability) {
        availabilityRepository.save(availability);
    }

}
