package com.clinica.odonto.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import com.clinica.odonto.model.Exame;
import com.clinica.odonto.model.Paciente;

public class ExameServices {

	public static boolean insert(Exame exame) {

		Connection conn = Db.conect();
		LocalDate dataExame = exame.getData();
		int idPaciente = exame.getPaciente().getId();
		
		try {

			String sql = "INSERT INTO medicos(nome, data, idpaciente) VALUES (?, ?)";
			PreparedStatement st = conn.prepareStatement(sql);

			st.setString(1, exame.getNome());
			st.setInt(2, idPaciente);
 

			st.execute();
			System.out.println("Cadastro Realizado");

			st.close();

			return true;

		} catch (Exception e) {
			System.out.println("Falha no cadastro" + e);
		}

		return false;
	}

public static ArrayList<Exame>getExames(){
		
		Connection conn = Db.conect();
		
		try {
			
			String 		sql 	= "SELECT * FROM exames";
			
			Statement 	st 		= conn.createStatement();
			ResultSet   result  = st.executeQuery(sql); 
 
			ArrayList<Exame>lista = new ArrayList<Exame>();
 
			while(result.next()) {
							lista.add(new Exame(
									 result.getInt("id"),
									 result.getString("nome"),
 									 result.getInt("idPaciente")
									  
									 )
						);
			}
			
			st.close();
			Db.Disconnect(conn);
			return lista;
			
			
		}catch (Exception e) {
			System.err.println("Erro na conexão");
			
		}
		
		return null;
	}
}
