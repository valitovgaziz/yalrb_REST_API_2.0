package ru.yalrb.services;

import org.springframework.stereotype.Service;
import ru.yalrb.entity.models.Photo;
import ru.yalrb.repository.PhotoRepository;

@Service
public class PhotoService {

    private final PhotoRepository photoRepository;

    public PhotoService(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    public void savePhoto(Photo photo) {
        photoRepository.save(photo);
    }

}
