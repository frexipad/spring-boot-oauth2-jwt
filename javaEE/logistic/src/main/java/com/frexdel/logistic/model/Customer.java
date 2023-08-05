package com.frexdel.logistic.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;



}
