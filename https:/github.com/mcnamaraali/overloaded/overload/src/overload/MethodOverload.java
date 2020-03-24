package overload;

public class MethodOverload {

	//test overloading square methods
	public static void main(String[] args) {
		System.out.printf("Square of integer 7 is %d%n", square(7));
		System.out.printf("Square of double 7.5 is %f%n", square(7.5));
	}
	
	
	//square method with int argument
	public static int square (int intValue) {
		return intValue * intValue;
	}
	
	//square method with double argument
	public static double square (double doubleValue) {
		return doubleValue * doubleValue;
	}
	

}
