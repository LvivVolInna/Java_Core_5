package ua.lviv.lgs.hw5;

public class ClassOverload {
	
	double a;
	int b;
	double c;
	
	
	public ClassOverload(double a, int b) {
		this.a = a;
		this.b = b;
	}

	public ClassOverload(double a, int b, double c) {
		this(a, b);
		this.c = c;
	}

	@Override
	public String toString() {
		return "ClassOverload [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
