package com.farukgenc.boilerplate.springboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "equipment_history")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EquipmentHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long resourceId;

    @Column(nullable = true)
    private Date maintenanceDate;

    @Column(length = 100)
    private String eventDescription;

    @Column(length = 500)
    private String incidentReported;
}
