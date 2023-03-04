package ru.yalrb.entity.models.yalObject;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Data
public class LeisureSubType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    @ManyToMany
    HashSet<YalObject> yalObjects;

    @Column(length = 100)
    @Builder.Default
    String name = "нет названия";

    @Column(length = 1000)
    @Builder.Default
    String description = "нет описания";
}
