package com.clinica.odonto.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;

import com.clinica.odonto.model.Medico;

public class MedicoServices {

	public static boolean insert(Medico medico) {

		Connection conn = Db.conect();
		LocalDate dataNascimento = medico.getNascimento();
		try {

			String sql = "INSERT INTO medicos(nome, cpf, crm, nascimento, genero, especialidade, telefone, email, endereco) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement st = conn.prepareStatement(sql);

			st.setString(1, medico.getNome());
			st.setString(2, medico.getCrm());
			st.setString(3, medico.getCrm());
			st.setObject(4, dataNascimento);
			st.setString(5, medico.getGenero());
			st.setString(6, medico.getEspecialidade());
			st.setString(7, medico.getTelefone());
			st.setString(8, medico.getEmail());
			st.setString(9, medico.getEndereco());

			st.execute();
			System.out.println("Cadastro Realizado");

			st.close();

			return true;

		} catch (Exception e) {
			System.out.println("Falha no cadastro" + e);
		}

		return false;
	}

}
