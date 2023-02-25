package ru.yalrb.entity.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import ru.yalrb.entity.models.account.Account;
import ru.yalrb.entity.models.appeal.Appeal;

import java.util.HashSet;

@Entity
@Data
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
public class State {
    @Id
    @GeneratedValue
    private Short id;

    @Column(length = 100)
    private String name;

    @Column(length = 1000)
    private String description;

    @OneToMany
    HashSet<Account> accounts;

    @OneToMany
    HashSet<Appeal> appeals;

}
