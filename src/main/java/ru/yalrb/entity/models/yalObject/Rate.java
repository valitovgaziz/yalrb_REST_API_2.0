package ru.yalrb.entity.models.yalObject;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Rate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    @Builder.Default
    @Column(length = 3)
    Byte rate = 0;

    @OneToOne
    YalObject yal_object;

}
