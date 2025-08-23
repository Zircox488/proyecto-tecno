package com.farukgenc.boilerplate.springboot.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Experts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Expert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long userId;

    private long lineId;

}
