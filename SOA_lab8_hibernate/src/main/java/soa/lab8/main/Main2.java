package soa.lab8.main;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import soa.lab8.models.*;

public class Main2 {
	


	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SOA_lab8_hibernate");
		EntityManager manager = factory.createEntityManager();
		
		Timestamp from = java.sql.Timestamp.valueOf("2017-09-13 10:10:10.0");
		Timestamp to = java.sql.Timestamp.valueOf("2017-12-24 10:10:10.0");
		String authorName  = "Sapkowski";
		String bookTitle = "Krew elfów";
		
		Query q1 = manager.createNativeQuery("SELECT DISTINCT  u.id, u.name from UserEntity u "
				+ "						NATURAL JOIN  rent r NATURAL JOIN  book b  NATURAL JOIN  author a "
				+ "						WHERE a.author_lastname = ? AND rent_date BETWEEN ? AND ?", UserEntity.class);

		Query q2 = manager.createNativeQuery("SELECT DISTINCT  u.id, u.name from UserEntity u "
				+ "						NATURAL JOIN  rent r NATURAL JOIN  book b"
				+ "						WHERE b.title = ? AND rent_date BETWEEN ? AND ?", UserEntity.class);
		
		Query q3 = manager.createNativeQuery("SELECT a.author_id, author_firstname, author_lastname from Author a "
				+ 							"NATURAL JOIN  book b NATURAL JOIN  rent r NATURAL JOIN userEntity u "
				+ 							"WHERE u.name = ?", Author.class);
		
		List<UserEntity> users1 = q1.setParameter(1, authorName).setParameter(2, from).setParameter(3, to).getResultList(); 
		List<UserEntity> users2 = q2.setParameter(1, bookTitle).setParameter(2, from).setParameter(3, to).getResultList();
		List<Author> authors1 = q3.setParameter(1, "Bartek").getResultList();
		
		System.out.println("Zadanie 1:");
		for(UserEntity user: users1) {
			System.out.println(user.getName());
		}
		
		System.out.println("Zadanie 2:");
		for(UserEntity user: users2) {
			System.out.println(user.getName());
		}
		
		System.out.println("Zadanie 3:");
		for(Author author: authors1) {
			System.out.println(author.getFirstname());
		}
		
	}

}
