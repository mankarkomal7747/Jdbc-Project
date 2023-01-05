package com.qsp.dto;

public class Pen {
	private int id;
	private String Brand;
	private String Name;
	private Long Price;
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getPrice() {
		return Price;
	}
	public void setPrice(long i) {
		Price = i;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}

}
