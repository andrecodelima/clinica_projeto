package main;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.clinica.odonto.model.Paciente;

public class Main {

	public static void main(String[] args) {
		
		Paciente p = new Paciente("Ana", "124.121.121-13", LocalDate.of(2022, 12, 02), "21-2222-3333", "ana@gmail.com", "Rua Efigenia 12");
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(p);
		session.close();
		
		System.out.println("Executado com sucesso");
		

	}

}
