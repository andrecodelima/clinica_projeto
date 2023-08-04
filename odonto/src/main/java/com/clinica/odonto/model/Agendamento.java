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
@Table(name = "agendamentos")
public class Agendamento {

	@Id
	@GeneratedValue
	private int id;	
	
	@Column
	private LocalDate dataHora;
	

	@ManyToOne
	@JoinColumn(name="idpaciente")
	private Paciente paciente;
	
	@ManyToOne
	@JoinColumn(name="idmedico")
	private Medico medico;
	
	
	@ManyToOne
	@JoinColumn(name="idexame")
	private Exame exame;
	


	public Agendamento() {
		super();
	}


	public Agendamento(LocalDate dataHora, Exame exame) {
		super();
		this.dataHora = dataHora;
		this.exame = exame;
	}


	public Agendamento(int id, LocalDate dataHora, Exame exame) {
		super();
		this.id = id;
		this.dataHora = dataHora;
		this.exame = exame;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public LocalDate getDataHora() {
		return dataHora;
	}


	public void setDataHora(LocalDate dataHora) {
		this.dataHora = dataHora;
	}


	public Exame getExame() {
		return exame;
	}


	public void setExame(Exame exame) {
		this.exame = exame;
	}

 
	
	
}
