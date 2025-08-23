package com.farukgenc.boilerplate.springboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "resources")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255)
    private String name;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String serialNumber;

    @Column(nullable = false)
    private String internalId;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private Boolean availableForBooking;

    @Column(nullable = false)
    private Long servicelineId;
}
