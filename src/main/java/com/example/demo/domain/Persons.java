package com.example.demo.domain;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(PrKey.class)
public class Persons {

    @Id
    private String name;

    @Id
    private String lastName;

    @Id
    private int age;
    @Column
    private String phoneNumber;
    @Column
    private String cityOfLiving;
}

