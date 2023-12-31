package ru.netology.sqldao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Persons")
@Entity
public class Person {
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @Column(nullable = false)
    private int age;

    @Column(columnDefinition = "varchar(16)")
    private String phoneNumber;

    @Column(nullable = false)
    private String city;

}
