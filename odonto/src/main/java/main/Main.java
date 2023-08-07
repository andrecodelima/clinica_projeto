package main;

import com.clinica.odonto.services.Db;

public class Main {

	public static void main(String[] args) {
		
		//Teste de conexão
		try {
			Db.conect();
			System.out.println("Conectado!");
			
		}catch (Exception e) {
			System.out.println("Erro");
		}

	}

}
