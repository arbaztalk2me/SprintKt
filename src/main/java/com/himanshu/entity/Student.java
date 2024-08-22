package com.himanshu.entity;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.validator.constraints.Length;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Student Model Information")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "Name must not be null")
    @Schema(description = "Student Name Column",example = "himanshu")
    private String name;

    @Email(message="eneter a valid email",regexp = "^[a-zA-Z0-9._%+-]+@(gmail\\.com|yahoo\\.com)$")
    private String email;

    @NotEmpty(message = "address must not be empty")
    private String address;

    @Length(min = 5,max = 10,message = "length should between 5 to 10")
    private String mob;

    @NotBlank(message = "institute must not be blank")
    private String institute;

    @Pattern(regexp = ".*%himanshu$",message = "failed eneter a vaild value must end with %himanshu")
    private String shelf;

    public Student(String name, String email, String address, String mob, String institute, String shelf) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.mob = mob;
        this.institute = institute;
        this.shelf = shelf;
    }
}
