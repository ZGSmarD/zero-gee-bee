package com.example.prueba;

public class Component {
	//Class Attributes
	private String name; // name of the tool or component
	private int amount; // amount available in stock of the component
	
	// builder method
	public Component(String name, int amount){
	 this.name = name;
	 this.amount = amount;
	 }

	//get methods
	public String getName(){
	 return name;
	 }
	public int getAmount(){
	 return amount;
	 }	
}
