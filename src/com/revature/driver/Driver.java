package com.revature.driver;

import java.util.Scanner;

import com.revature.beans.Cat;
import com.revature.beans.Dog;

public class Driver {

	public static void main(String[] args) {
		//Instantiate 2 objects of each type
		Dog a = new Dog();
		Dog b = new Dog();
		Cat c = new Cat();
		Cat d = new Cat();
		
		//if else statement
		c.setAge(3);
		if (c.getAge() < 2){
			System.out.println("It's a baby cat");
	    }else {
	    	System.out.println("It's a big cat");
	    }
		
		//do while statement
		a.setWeight(15);
		do {System.out.println("You need to lose weight!");}
		while(a.getWeight() > 20);
		
		//utilize a wrapper class
		Integer C = c.getAge();
		
		//Overload the same method 3 times
		b.setName("name1");
		b.setName("name2");
		b.setName("name3");
		
		//Utilize the Scanner to take in user input to instantiate objects
		Scanner s = new Scanner(System.in);
		d.setName(s.nextLine());
	}
}
