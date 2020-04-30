import java.util.Scanner;
import java.lang.Math;
public class EvenOddLie{
	public static void main(String[]args){

	Scanner in=new Scanner(System.in);
	System.out.println("Type an integer number: ");
	int number= in.nextInt();
	if(Math.random()<0.9){
		if(number%2==0){
		System.out.println("The "+number+" is even");
	    }
		else{
		System.out.println("The "+number+" is odd");
	}
	}else{
		if(number%2==0){
		System.out.println("The "+number+" is odd");
		}else{
			System.out.println("The "+number+" is even");
		}
	}
}
}