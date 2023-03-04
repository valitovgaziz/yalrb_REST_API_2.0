package ru.yalrb.entity.models.account;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import ru.yalrb.entity.models.*;
import ru.yalrb.entity.models.appeal.Appeal;
import ru.yalrb.entity.models.yalObject.YalObject;

import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Builder
@Table(name="_user")
public class Account implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany
    private HashSet<YalObject> yalObjects;

    @OneToOne
    private Photo photo;

    @NonNull
    @Column(length = 50)
    @Builder.Default
    private String firstName = "first name (default)";
    @NonNull
    @Column(length = 50)
    @Builder.Default
    private String lastName = "last name (default)";
    @NonNull
    @Column(length = 300)
    private String password;
    @NonNull
    @Column(length = 50)
    @Builder.Default
    private String email = "email not defined (default)";

    @ManyToMany
    private HashSet<UserRole> userRoles;
    @NonNull
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private Role role = Role.NOT_DEFINED;

    @Column(length = 30)
    @Builder.Default
    private String phoneNumber = "default";

    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    @Builder.Default
    private Gender gender = Gender.NOT_DEFINED;

    @ManyToOne
    private State state;

    @Column(name = "created_date_time")
    @Temporal(TemporalType.TIMESTAMP)
    @Builder.Default
    private Calendar created = Calendar.getInstance();

    @Column(length = 3)
    @Builder.Default
    private Byte score = 0;

    @Column(length = 50)
    @Builder.Default
    private String nickName = "Ник нейм не задан";

    @OneToMany
    private HashSet<Appeal> appeals;

    @OneToMany
    HashSet<FeetBack> feetBacks;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public @NonNull String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
