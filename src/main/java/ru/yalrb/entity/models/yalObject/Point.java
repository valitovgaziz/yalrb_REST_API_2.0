package ru.yalrb.entity.models.yalObject;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "level")
public class Point {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    @OneToOne
    YalObject yalObject;

    @Builder.Default
    @Column(length = 6)
    float longitude = 0.0f;

    @Builder.Default
    @Column(length = 6)
    float latitude = 0.0f;

}
