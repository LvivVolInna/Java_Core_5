package ua.lviv.lgs.hw5;

public class Main {
	public static void main(String[] args) {
// task 1
		Cat cat = new Cat(5, 2, "кіт");
		cat.voice();

		Dog dog = new Dog(7, 3, "пес");
		dog.voice();

		Cow cow = new Cow(300, 2, "корова");
		cow.voice();
		
//task 2
		System.out.println();

		ClassOverload CO = new ClassOverload(3.54, 5, 2.58);
		System.out.println(CO);

// task 3		
		System.out.println();
		
		Amphibia f = new Frog(0.05, 2, "Frog");
		f.eat();
		f.sleep();
		f.swim();
		f.walk();
	}

}
