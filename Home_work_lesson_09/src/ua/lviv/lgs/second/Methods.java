package ua.lviv.lgs.second;

public class Methods {
	
	private double a, b;
	
	
	
	public Methods(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public void add() throws Throwable {
		exc();
		System.out.println(a + b);
	}
	
	void minus() throws Throwable {
		exc();
		System.out.println(a - b);
	}
	
	void multiply() throws Throwable {
		exc();
		System.out.println(a * b);
	}
	
	void devide() throws Throwable {
		exc();
		System.out.println(a / b);
	}
	
	public void exc() throws Throwable {
	if(a < 0 && b < 0) {
		throw new  IllegalArgumentException();
	}else if(a == 0 && b != 0 || a != 0 && b == 0) {
		throw new ArithmeticException();
	}else if(a == 0 && b == 0) {
		throw new IllegalAccessException();
	}else if(a > 0 && b > 0) {
		throw new MyException("Error");
	}
	}
}
