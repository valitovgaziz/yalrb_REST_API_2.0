package ru.yalrb.entity.models.yalObject;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

import ru.yalrb.entity.models.Contact;
import ru.yalrb.entity.models.FeetBack;
import ru.yalrb.entity.models.Photo;
import ru.yalrb.entity.models.State;
import ru.yalrb.entity.models.account.Account;

import java.util.Calendar;
import java.util.HashSet;
import java.util.UUID;

@Entity
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class YalObject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private UUID id;

    @ManyToOne
    private YalObjectType yalObjectType;

    @ManyToMany
    private HashSet<LeisureType> leisureTypes;

    @ManyToMany
    private HashSet<LeisureSubType> leisureSubTypes;

    @OneToOne
    private Contact contact;

    @OneToOne
    private Rate rate;

    @OneToOne
    private Point point;

    @OneToMany
    HashSet<FeetBack> feetBacks;

    @Column(length = 50)
    private String name;

    @ManyToOne
    private Account account;

    @Column(length = 100)
    @Builder.Default
    private String longName = "нет полного имени";

    @Column(length = 500)
    @NonNull
    private String shortDescription;

    @Column(length = 1500)
    @Builder.Default
    private String fullDescription = "нет полного описания";

    @ManyToOne
    private State state;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dateTimeCreated;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dateTimeStartEvent;

    @Nullable
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dateTimeEndEvent;

    @OneToOne
    private Availability availability;

    @OneToOne
    private WorkLoadState workLoadState;

    @OneToMany
    private HashSet<Photo> photos;

}
