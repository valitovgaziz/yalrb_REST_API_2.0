package ru.yalrb.entity.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class AgeRange {
    @Id
    @GeneratedValue
    private Byte id;

    private Integer fromAge;

    private Integer toAge;

    private String name;

    private String description;

}
