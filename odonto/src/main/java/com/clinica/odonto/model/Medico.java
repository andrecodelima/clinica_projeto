package com.clinica.odonto.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "medico")
public class Medico {

	@Id
	@GeneratedValue
	private int id;	
	
	@Column
	private String cpf;
	
	@Column
	private String crm;
	
	@Column
	private LocalDate nascimento;
	
	@Column
	private String telefone;
	
	@Column
	private String email;
	
	@Column
	private String endereco;
	
	@Column
	private String especialidade;
	
	public Medico() {}

	public Medico(String cpf, String crm, LocalDate nascimento, String telefone, String email, String endereco,
			String especialidade) {
		super();
		this.cpf = cpf;
		this.crm = crm;
		this.nascimento = nascimento;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		this.especialidade = especialidade;
	}

	public Medico(int id, String cpf, String crm, LocalDate nascimento, String telefone, String email, String endereco,
			String especialidade) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.crm = crm;
		this.nascimento = nascimento;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		this.especialidade = especialidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
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

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

    
	
}
