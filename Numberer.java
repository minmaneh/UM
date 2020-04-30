import java.util.Scanner;

public class Numberer {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);

		System.out.println("Please type in a number");

		int number = in.nextInt();
		while(number<0 || number>12){
			System.out.println("Enter a new number");
			number=in.nextInt();
		}
	}		
}