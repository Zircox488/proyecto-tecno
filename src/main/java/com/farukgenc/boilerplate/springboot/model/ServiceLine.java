package com.farukgenc.boilerplate.springboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "service_lines")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ServiceLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String serviceLineName;

    @OneToMany(mappedBy = "serviceLine", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Expert> experts;

    @OneToMany(mappedBy = "serviceLine", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Resource> resources;
}
