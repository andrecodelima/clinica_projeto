package com.clinica.odonto.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;

import com.clinica.odonto.model.Paciente;

public class PacienteServices {
	
	public static boolean insert(Paciente paciente) {
		
		Connection conn = Db.conect();
		LocalDate dataNascimento = paciente.getNascimento();
		try {
			
			String sql = "INSERT INTO pacientes(nome, cpf, nascimento, genero, telefone, email, endereco) VALUES (?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setString(1, paciente.getNome());
			st.setString(2, paciente.getCpf());
			st.setObject(3, dataNascimento);
			st.setString(4, paciente.getGenero());
			st.setString(5, paciente.getTelefone());
			st.setString(6, paciente.getEmail());
			st.setString(7, paciente.getEndereco());
			
			
			st.execute();
			System.out.println("Cadastro Realizado");
			
			st.close();
			
			return true;
			
		}catch (Exception e) {
			System.out.println("Falha no cadastro" + e);
		}
		
		return false;
	}

}
