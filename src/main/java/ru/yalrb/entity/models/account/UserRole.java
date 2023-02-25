package ru.yalrb.entity.models.account;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;

@Data
@Entity
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Builder.Default
    @Column(length = 50)
    private String name = Role.NOT_DEFINED.toString();

    @Column(length = 500)
    @Builder.Default
    private String describe = "не определено";

    @ManyToMany
    HashSet<Account> accounts;

}
