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

    @Builder.Default
    @Column(length = 50)
    private String name = "нет роли";

    @Column(length = 500)
    @Builder.Default
    private String describe = "не определено";

    @ManyToMany
    HashSet<Account> accounts;

}
