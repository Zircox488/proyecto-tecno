package com.farukgenc.boilerplate.springboot.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "DigitalRecords")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DigitalRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long reservationId;

    private Long talentId;

    private Long expertId;

    private String recordType;

    private Date creationDate;

    private String damageControl;

    private String observations;

}
