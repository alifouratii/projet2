package org.sid.web;

import java.util.List;

import org.sid.dao.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProduitRestService<Produit> {
  private ProduitRepository produitRepository;
@Autowired  
private ProduitRepository contactRepository;

 @RequestMapping(value="/produit",method=RequestMethod.GET)
  
  public List<org.sid.entities.Produit> getProduits(){
	return produitRepository.findAll();
	 }
 @RequestMapping(value="/produit/{id}",method=RequestMethod.GET)
 
 public Produit getProduit(@PathVariable long id){
	return (Produit) produitRepository.findById(id);
	  
	  
 }
@RequestMapping(value="/produit",method=RequestMethod.POST)
 
 public Produit save(@RequestBody Produit p){
	return (Produit) produitRepository.save(p);
	  
	  
 }
@RequestMapping(value="/produit/{id}",method=RequestMethod.DELETE)

public boolean supprimer(@PathVariable long id){
	
	produitRepository.delete(id);
	return true;
	  }
@RequestMapping(value="/produit/{id}",method=RequestMethod.PUT)

public Produit save(@PathVariable long id,@RequestBody Produit p){
	((org.sid.entities.Produit) p).setId(id);
	return produitRepository.save(p);
	  


}}
