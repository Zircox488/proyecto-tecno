package com.farukgenc.boilerplate.springboot.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String lastName;

	@Column(unique = true)
	private String username;

	private String password;

	private String email;

	@Enumerated(EnumType.STRING)
	private UserRole userRole;

}
