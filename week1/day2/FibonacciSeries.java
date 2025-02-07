package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int f1 =0, f2 =1, f3, count =8;
		
		System.out.print(f1+" "+f2);
		
		for(int i=2;i<count;++i) {
			f3 = f1+f2;
			System.out.print(" "+f3);
			f1 = f2;
			f2 = f3;
		}
		

	}

}
