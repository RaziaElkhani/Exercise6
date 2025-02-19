package day2.hw;

public class Calcuter {
	public static void main(String[] args) {
	double r1 =	calculator(10,5,'-');
	System.out.println(r1);
	
	double r2 =	calculator(0,5,'/');
	System.out.println(r2);
		
	}
	public static double   calculator (double  a, double b ,char oprator) {
		double result =0.0;
		
		if (oprator=='-') {
			result =a-b;
		}else if (oprator=='/'){
			if (b ==0 ) {
				System.out.println("You cannot divide by Zero");
			}
			
			result=a/b;
		
		} 
		
		return result;
		
	}

}
