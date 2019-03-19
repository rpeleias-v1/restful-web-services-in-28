package com.in28minutes.rest.webservices.restfulwebservices.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "All details about the user.")
public class User {

    @Id
    @GeneratedValue
    private int id;

    @Size(min = 2, message = "name should have at least 2 characters")
    @ApiModelProperty(notes = "Name should have at least 2 characters.")
    private String name;

    @Past
    @ApiModelProperty(notes = "Birth date should be in the past.")
    private Date birthDate;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;

    public User(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
}
