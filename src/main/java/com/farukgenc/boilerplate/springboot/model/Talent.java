package com.farukgenc.boilerplate.springboot.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Talents")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Talent extends User {
    
    @Column(unique = true)
    private String associatedProject;
}
