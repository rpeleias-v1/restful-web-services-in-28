package com.in28minutes.rest.webservices.restfulwebservices.entity;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer id;
    private String name;
    private Date birthDate;


    public User(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
}
