package com.example.prueba;

public class DataSheet {
	//Class Attributes
	private String name; // name of the data sheet
	private String autor; // name of the autor
	private String image; // path of the image In the future implementation can be get from the backEnd
	
	// builder method
	public DataSheet(String name, String autor, String image){
	 this.name = name;
	 this.autor = autor;
	 this.image = image;
	 }

	//get methods
	public String getName(){
	 return name;
	 }
	public String getAutor(){
	 return autor;
	 }
	public String getImage(){
		 return image;
		 }	
}
