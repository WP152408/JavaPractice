/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    l_ Car
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 * 
 * @author : pengfox
 * @version : 1.0
 */
public class Car2 {
	private String company, model, color;
	private int maxSpeed, price;
	
	public Car2() {
		return;
	}
	public Car2(String company, String model, String color, int maxSpeed, int price) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}
	
	public String getCompany() {
		return company;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public int getPrice() {
		return price;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
