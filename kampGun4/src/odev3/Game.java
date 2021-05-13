package odev3;

import java.time.LocalDate;

public class Game implements Entity {
	private int id;
	private String name;
	private String developer;
	private LocalDate releaseDate;
	private double unitPrice;
	private int discountRate;
	
	public Game(int id, String name, String developer, 
			LocalDate releaseDate, double unitPrice, int discountRate) {
		this.id = id;
		this.name = name;
		this.developer = developer;
		this.releaseDate = releaseDate;
		this.unitPrice = unitPrice;
		this.discountRate = discountRate;
	}
	
	public Game(int id, String name, String developer, 
			LocalDate releaseDate, double unitPrice) {
		this(id, name, developer, releaseDate, unitPrice, 0);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
	public double getDiscountedPrice() {
		double discountedPrice = this.unitPrice - (this.unitPrice * this.getDiscountRate() / 100);
		return discountedPrice;
	}
}
