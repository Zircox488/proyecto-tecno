package com.farukgenc.boilerplate.springboot.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Reservations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long talentId;

    private long expertId;

    private Date dateTimeStart;

    private Date endDateTime;

    private String reservationStatus;

    private Date creationDate;

    private Date lastModifiedDate;

}
