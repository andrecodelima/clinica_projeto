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

	private int idPaciente = paciente.getId();
	
	private String nomePaciente = paciente.getNome();
	
	public Exame() {
		super();
	}

	
	public int getIdPaciente() {
		return idPaciente;
	}



	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}



	public Exame(int id, String nome, String nomePaciente) {
		super();
		this.id = id;
		this.nome = nome;
		this.nomePaciente = nomePaciente;
	}

	public Exame(int id, String nome, int idPaciente) {
		super();
		this.id = id;
		this.nome = nome;
		this.idPaciente = idPaciente;
	}
	
	public Exame(String nome, int idPaciente) {
		super();
		this.nome = nome;
		this.nomePaciente = nomePaciente;
	}

 

	
	public String getNomePaciente() {
		return nomePaciente;
	}


	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
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

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	 
	
	
}
