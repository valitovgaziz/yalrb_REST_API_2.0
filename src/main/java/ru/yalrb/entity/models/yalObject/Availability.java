package ru.yalrb.entity.models.yalObject;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Availability {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    @JdbcTypeCode(SqlTypes.INTEGER)
    private Long id;

    @OneToOne
    YalObject yalObject;

    Boolean isForNoSeeing;

    Boolean isForMentalDisorder;

    Boolean isForWheelchairUser;

    Boolean isForNoHear;

    Boolean isForDisordersMuscSkelSys;

}