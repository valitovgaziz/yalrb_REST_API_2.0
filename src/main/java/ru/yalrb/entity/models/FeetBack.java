package ru.yalrb.entity.models;

import jakarta.persistence.*;
import lombok.*;
import ru.yalrb.entity.models.account.Account;
import ru.yalrb.entity.models.yalObject.YalObject;

@Entity
@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class FeetBack {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @NonNull
    private Account feetBackOwner;

    @ManyToOne
    @NonNull
    private YalObject yalObject;

    @Column(length = 1500)
    @NonNull
    private String feetBackText;

    private Byte rated;

}
