import java.util.Scanner;

public class FarLight {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// Tell the user what you want 
		System.out.println("Please type the Ghz of your computer");
		
		// Collect the input
		double MyGhz = in.nextDouble();
		double ClockCycle=(1/MyGhz*10000000)*299792.458;
		
		System.out.println("The ligh travels "+ClockCycle+"during 1 clock cycle of your computer.");
		
	}

}