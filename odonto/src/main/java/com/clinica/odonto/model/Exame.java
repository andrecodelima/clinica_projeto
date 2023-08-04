package com.clinica.odonto.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "exames")
public class Exame {

	@Id
	@GeneratedValue
	private int id;	
	
	@Column(length = 100)
	private String nome;
	
	@Column
	private LocalDate data;
	
	
	@ManyToOne
	@JoinColumn(name = "idpaciente")
	private Paciente paciente;

	public Exame() {
		super();
	}

	public Exame(String nome, LocalDate data) {
		super();
		this.nome = nome;
		this.data = data;
	}

	public Exame(int id, String nome, LocalDate data) {
		super();
		this.id = id;
		this.nome = nome;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	 
	
	
}
