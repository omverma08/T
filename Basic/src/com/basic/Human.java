package com.basic;

public class Human {
	
	int id;
	String name;
	String gender;
	
	
	
	public Human(int id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	

	
	public void sleep() {
		
		System.out.println("Sleeping method ");
	
	
	}
	
 public void eat() {
		
		System.out.println("eating  method");
	}
	
    
	
	
	
	public static void main(String[] args) {
		
		
		Human human= new Human(1,"tanisha","female");
		
		human.sleep();

		Human human2= new Human(2,"Ketki","female");
		
		human2.sleep();
		
       Human human3= new Human(2,"Harsh","male");
		
       human3.sleep();
	
		System.out.println("Welcome Tanisha");
	}

	

}
