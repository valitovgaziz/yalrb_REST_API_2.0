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
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
@Data
public class Contact {
    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 100)
    private String fullName;

    @Column(length = 30)
    @Builder.Default
    private String phone = "not defined";

    @Column(length = 150)
    @Builder.Default
    private String vkLink = "not defined";

    @Column(length = 150)
    @Builder.Default
    private String odnoklassnikyLink = "not defined";

    @Column(length = 50)
    @Builder.Default
    private String email = "not defined";

    @Column(length = 300)
    @Builder.Default
    private String address = "not defined";

    @Column(length = 50)
    @Builder.Default
    private String telegramNick = "not defined";


}
