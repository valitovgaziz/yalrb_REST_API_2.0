package ru.yalrb.entity.models;

import jakarta.persistence.Column;
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
public class RiskFactors {
    @Id
    @GeneratedValue
    private Byte id;

    @Column(length = 50)
    private String name;

    @Column(length = 1000)
    private String description;

}
