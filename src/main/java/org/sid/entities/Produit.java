package org.sid.entities;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;

@Entity
public class Produit implements Serializable {
	@Id @GeneratedValue 
	private long id;
	private String nomPr;
	private float price;
	private String photo;
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(String nomPr, float price, String photo) {
		super();
		this.nomPr = nomPr;
		this.price = price;
		this.photo = photo;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomPr() {
		return nomPr;
	}
	public void setNomPr(String nomPr) {
		this.nomPr = nomPr;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	

}
