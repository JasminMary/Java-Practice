package com.qa.encapsulation;

public class Object {

	private String name;
	private float size;
	private double price;
	private int stock;
	private long amountinworld;

	public Object(String name, float size, double price, int stock, long amountinworld) {
		super();
		this.name = name;
		this.size = size;
		this.price = price;
		this.stock = stock;
		this.amountinworld = amountinworld;
	}

	public Object() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public long getAmountinworld() {
		return amountinworld;
	}

	public void setAmountinworld(long amountinworld) {
		this.amountinworld = amountinworld;
	}

	@Override
	public String toString() {
		return "Object, Name = " + name + ", Size = " + size + "cm, Price = £" + price + ", Stock = " + stock + ", Amount in the world = "
				+ amountinworld;
	}

}
