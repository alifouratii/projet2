package org.sid.dao;
import org.sid.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProduitRepository extends JpaRepository<Produit,Long > {

	void delete(long id);

	Produit save(Produit p);


}
