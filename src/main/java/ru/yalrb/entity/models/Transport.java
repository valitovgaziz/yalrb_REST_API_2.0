package ru.yalrb.entity.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
public class Transport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Short id;

    private String name;

    private String description;

}
