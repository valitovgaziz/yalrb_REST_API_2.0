package ru.yalrb.services;

import org.springframework.stereotype.Service;
import ru.yalrb.entity.models.yalObject.Point;
import ru.yalrb.repository.PointRepository;

@Service
public class PointService {

    private final PointRepository pointRepository;


    public PointService(PointRepository pointRepository) {
        this.pointRepository = pointRepository;
    }

    public void savePoint(Point point) {
        pointRepository.save(point);
    }

}
