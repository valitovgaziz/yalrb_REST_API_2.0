package ru.yalrb.entity.models.yalObject;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class WorkLoadState {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    @OneToOne
    YalObject yalObject;

    @Column(length = 100)
    @Builder.Default
    String levelName = "не определено";

    @Column(length = 1000)
    @Builder.Default
    String description = "не определено";

    @Column(length = 3)
    @Builder.Default
    Integer levelScore = 0;

}