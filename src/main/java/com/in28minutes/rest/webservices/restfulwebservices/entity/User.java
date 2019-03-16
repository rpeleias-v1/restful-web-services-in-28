package com.in28minutes.rest.webservices.restfulwebservices.entity;

import lombok.*;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer id;

    @Size(min = 2, message = "name should have st least 2 characters")
    private String name;

    @Past
    private Date birthDate;

    public User(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
}
