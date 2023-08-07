package com.clinica.odonto.services;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.clinica.odonto.model.Paciente;

public class PacienteServices {
	
	public static boolean insert(Paciente paciente) {
		
		Connection conn = Db.conect();
		
		try {
			
			String sql = "INSERT INTO pacientes(nome, cpf) VALUES (?, ?)";
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setString(1, paciente.getNome());
			st.setString(2, paciente.getCpf());
			
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
