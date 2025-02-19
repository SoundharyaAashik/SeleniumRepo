package week3.day2;

public class CalculatorFunctionality {
	//static polymorphism - Method Overloading - CompileTime Polymorphism - Early Binding
	
	public void addnumbers(int d,int e) {
		System.out.println(d+e);
	}
	public void addnumbers(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public void addnumbers(float a,float b) {
		System.out.println(a+b);
	}
	public void addnumbers(float a,int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		CalculatorFunctionality calc = new CalculatorFunctionality();
		calc.addnumbers(1,2);
		calc.addnumbers(1,2,3);
		calc.addnumbers(1.2f, 2.46f);
		calc.addnumbers(2.34f, 5);
	}

}
