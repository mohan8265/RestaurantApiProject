package com.geekster.RestaurantAPI.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
public class AuthenticationToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String token;

    @OneToOne
    private User user;
    public AuthenticationToken(User user) {
        this.user = user;
        this.token = UUID.randomUUID().toString();
    }
}
