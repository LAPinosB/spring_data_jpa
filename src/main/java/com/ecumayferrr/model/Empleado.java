package com.ecumayferrr.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleados")
public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre", unique = true)
	private String fullName;
	
	private LocalDate birthDate;
	
	private Boolean married;
	
	public Empleado() {}

	public Empleado(Long id, String nombre, LocalDate birthDate, Boolean married) {
		super();
		this.id = id;
		this.fullName = nombre;
		this.birthDate = birthDate;
		this.married = married;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String nombre) {
		this.fullName = nombre;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birtDate) {
		this.birthDate = birtDate;
	}

	public Boolean getMarried() {
		return married;
	}

	public void setMarried(Boolean married) {
		this.married = married;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", fullName=" + fullName + ", birthDate=" + birthDate + ", married=" + married
				+ "]";
	}
	
	
	
}
