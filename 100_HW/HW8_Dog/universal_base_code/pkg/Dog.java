package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	String breed;
	int age = 0;

	public Dog() {
		this.name = "Clifford";
		this.age = 3;
		this.breed = "big red dog";
	}
	
	public Dog(String name) {
		this.name = name;
		this.age = 1;
		this.breed = "dog dog";
	}
	
	public Dog(String name, String breed) {
		this.name = name;
		this.age = 1;
		this.breed = breed;
	}
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		this.breed = "dog dog";
	}
	
	public void setName(String a) {
		name = a;
	}
	
	public void setAge(int b) {
		age = b;
	}
	
	public void setBreed(String c) {
		breed = c;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public boolean isSleeping() {
		int r = (int) (Math.random()*2);
		if (r==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void bark() {
		System.out.println(name + " barks");
	}

}
