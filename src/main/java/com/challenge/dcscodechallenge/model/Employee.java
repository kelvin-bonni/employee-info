package com.challenge.dcscodechallenge.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;


@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
@Table
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @NotEmpty(message = "First Name must not be empty")
    private String firstName;

    @Column
    @NotEmpty(message = "Last Name must not be empty")
    private String lastName;

    @Column
    @Min(value = 1, message = "Age must be greater than or equal to 1")
    private int age;
}
