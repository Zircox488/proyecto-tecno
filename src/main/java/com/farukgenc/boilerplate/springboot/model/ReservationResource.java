package com.farukgenc.boilerplate.springboot.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "ReservationsResources")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReservationResource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long reservationId;

    private long resourceId;

}
