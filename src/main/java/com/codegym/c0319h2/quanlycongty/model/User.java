package com.codegym.c0319h2.quanlycongty.model;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( unique = true)
    @NotBlank
    @Size(min = 4,max = 50)
    private String userName;

    @Size(min = 6, max = 50)
    private String passWord;

    @Column(unique = true)
    private String email;
    private String avatar;
    private LocalDate birthDate;
    private String phoneNumber;
    private String address;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
        joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    public User(@NotBlank @Size(min = 4, max = 50) String userName, @Size(min = 6, max = 50) String passWord, String email) {
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
    }

    public User(@NotBlank @Size(min = 4, max = 50) String userName, @Size(min = 6, max = 50) String passWord, Set<Role> roles) {
        this.userName = userName;
        this.passWord = passWord;
        this.roles = roles;
    }
}
