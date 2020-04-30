import java.util.Scanner;

public class Switching{
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	
		System.out.println("Please type the double value of first variable");
		double one = in.nextDouble();
		System.out.println("Your value is "+one);
		System.out.println("Please type the double value of second variable");
		double two=in.nextDouble();
		System.out.println("Your value is "+two);
		double z=one;
		one=two;
		two=z;
		System.out.println("Your first value is "+one+".Your second value is "+two);

	}

}