package ua.lviv.lgs.hw5;

public class Dog extends Pet {

	
	private String name;

	public Dog(double weight, int age, String name) {
		super(weight, age);
		this.name = name;
	}


//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	@Override
	void voice() {
		System.out.println("Я " + name + " - Гаyyy-Гаyyy");

	}

}
