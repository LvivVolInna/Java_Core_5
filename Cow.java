package ua.lviv.lgs.hw5;

public class Cow extends Pet {

	
	private String name;

	public Cow(double weight, int age, String name) {
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
		System.out.println("Я " + name + " - Myyy-Myyy");

	}

}
