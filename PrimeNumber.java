import java.util.Scanner;
public class PrimeNumber{
	public static void main(String[]args){

	Scanner in=new Scanner(System.in);

	System.out.println("Type an integer smaller than 20: ");
	
	int number= in.nextInt();
	if(number<0 || number>20){
		System.out.println("The number you have typed is negative or larger than 20");
	}
	else if(number>0 && number<=2){
		System.out.println("The "+number+" is prime");
	}
	else if(number%2==0 || number%3==0 || number%5==0 || number%7==0){
		System.out.println("The "+number+" is not prime");
	}else{
		System.out.println("The "+ number+ " is prime");
	}
}
}
