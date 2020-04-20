package com.revature.beans;

public class Dog {
	private String Name;
	private String Color;
	private int weight;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Dog [Name=" + Name + ", Color=" + Color + ", weight=" + weight + "]";
	}
	
	

}
