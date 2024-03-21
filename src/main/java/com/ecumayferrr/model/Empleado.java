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
	private String nombre;
	
	private LocalDate birtDate;
	
	private Boolean married;
	
	public Empleado() {}

	public Empleado(Long id, String nombre, LocalDate birtDate, Boolean married) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.birtDate = birtDate;
		this.married = married;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getBirtDate() {
		return birtDate;
	}

	public void setBirtDate(LocalDate birtDate) {
		this.birtDate = birtDate;
	}

	public Boolean getMarried() {
		return married;
	}

	public void setMarried(Boolean married) {
		this.married = married;
	}
	
}
