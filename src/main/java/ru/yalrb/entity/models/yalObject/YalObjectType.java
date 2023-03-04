package ru.yalrb.entity.models.yalObject;

import jakarta.persistence.*;
import java.util.HashSet;

import lombok.*;

@Entity
@Data
@Setter
@Getter
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class YalObjectType {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Long id;

    @OneToMany
    private HashSet<YalObject> yalObjects;

    @NonNull
    @Builder.Default
    @Column(length = 500)
    private String name = "нет названия";

    @NonNull
    @Builder.Default
    @Column(length = 1500)
    private String description = "нет описания";

}
