package ua.lviv.lgs.hw5;

public class Amphibia {

	private double weight;
	private int age;

	public Amphibia(double weight, int age) {
		this.weight = weight;
		this.age = age;
	}

	public void eat() {
		System.out.println("Frog eats");
	}

	public void sleep() {
		System.out.println("Frog is sleeping");
	}

	public void swim() {
		System.out.println("Frog swims");
	}

	public void walk() {
		System.out.println("Frog walks");
	};


}
