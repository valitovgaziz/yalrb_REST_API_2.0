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
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
public class Transport {

    @Id
    @GeneratedValue
    private Byte id;

    private String name;

    private String description;

}
