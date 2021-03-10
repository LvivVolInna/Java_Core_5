package ua.lviv.lgs.hw5;

public abstract class Pet {
	
	private double weight;
	private int age;
	public Pet(double weight, int age) {
		super();
		this.weight = weight;
		this.age = age;
	}
	
	abstract void voice();
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	
	
	
	

}
