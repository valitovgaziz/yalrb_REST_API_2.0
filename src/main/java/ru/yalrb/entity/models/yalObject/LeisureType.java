package ru.yalrb.entity.models.yalObject;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;

@Entity
@Data
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
public class LeisureType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    @ManyToMany
    HashSet<YalObject> yalObjects;

    @Column(length = 50)
    @Builder.Default
    String name = "нет названия";

    @Column(length = 1000)
    @Builder.Default
    String description = "нет описания";

}
