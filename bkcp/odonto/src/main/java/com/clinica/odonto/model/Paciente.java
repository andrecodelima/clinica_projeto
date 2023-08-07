package com.clinica.odonto.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pacientes")
public class Paciente {

	@Id
	@GeneratedValue
	private int id;	
	
	@Column(length = 100)
	private String nome;
	
	@Column(length = 15)
	private String cpf;
	
	@Column
	private LocalDate nascimento;
	
	@Column(length = 20)
	private String telefone;
	
	@Column(length = 100)
	private String email;
	
	@Column(length = 200)
	private String endereco;
	
	
	public Paciente() {}


	public Paciente(String nome, String cpf, LocalDate nascimento, String telefone, String email, String endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
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


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public LocalDate getData() {
		return nascimento;
	}


	public void setData(LocalDate data) {
		this.nascimento = data;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public Paciente(int id, String nome, String cpf, LocalDate nascimento, String telefone, String email, String endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}

 
	
	
}
