package org.sid;

import org.sid.dao.ProduitRepository;
import org.sid.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
     private ProduitRepository produitRepository;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	produitRepository.save(new Produit ("pc-gamer",2900,"asus.jpg"));
	produitRepository.save(new Produit ("souris",120,"tuf-souris.jpg"));
	produitRepository.save(new Produit ("clavier",82,"clavier.jpg"));
	produitRepository.findAll().forEach(c->{
		
		System.out.println(c.getNomPr());
	}
	
			);
	}

}
