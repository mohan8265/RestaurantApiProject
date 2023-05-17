package com.geekster.RestaurantAPI.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Admin {
    @Id
    @NotBlank
    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@admin\\.com$\n")
    private String userEmail;
    @NotBlank
    private String password;
}
