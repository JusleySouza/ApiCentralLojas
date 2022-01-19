package com.central.lojas.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produtos")
public class Product implements Serializable {

	private static final long serialVersionUID = 1l;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private long id;
	
	private String name;
	private String batch;
	private int amount;
	private double price;
	private String size;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLot() {
		return batch;
	}
	public void setLot(String lot) {
		this.batch = lot;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", batch=" + batch +
				", amount=" + amount + ", price=" + price + ", size=" + size + "]";
	}
}
