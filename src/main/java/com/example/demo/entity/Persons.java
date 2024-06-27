package com.example.demo.entity;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Persons {
    @Column(nullable = false)
    private  String name;

    @Column(nullable = false)
    private String surname;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String phone_number;

    @Column(nullable = false)
    private String city_of_living;

}
