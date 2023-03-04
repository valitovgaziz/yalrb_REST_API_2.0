package ru.yalrb.entity.models.appeal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import ru.yalrb.entity.models.State;
import ru.yalrb.entity.models.account.Account;

import java.util.Calendar;

@Entity
@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class Appeal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(length = 50, nullable = false)
    private String email;

    @Column(length = 30, nullable = false)
    private String phoneNumber;

    @Column(length = 100, nullable = false)
    private String theme;

    @Column(length = 1500, nullable = false)
    private String appealText;

    @ManyToOne
    private State state;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    @Builder.Default
    private Calendar appealDateTime = Calendar.getInstance();

    @Column(nullable = false, length = 1000)
    private String responseText;

    @Temporal(TemporalType.TIMESTAMP)
    @Builder.Default
    private Calendar responseDateTime = null;

    @ManyToOne
    @Builder.Default
    private Account moder = null;

}
