package ru.yalrb.entity.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import ru.yalrb.entity.models.account.Account;
import ru.yalrb.entity.models.yalObject.YalObject;

import java.util.Calendar;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    @ManyToOne
    @Nullable
    YalObject yalObject;

    @OneToOne
    @Nullable
    Account account;

    String linkToPhoto;

    @Column(length = 100)
    @Builder.Default
    String name = "no name";

    @Column(length = 1000)
    @Builder.Default
    String description = "no description";

    Calendar loadedDateTime;

}
