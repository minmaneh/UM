import java.util.Scanner;
public class EvenOdd{
	public static void main(String[]args){

	Scanner in=new Scanner(System.in);
	System.out.println("Type an integer number: ");
	int number= in.nextInt();
	if(number%2==0){
		System.out.println("The "+number+" is even");
	}else{
		System.out.println("The "+number+" is odd");
	}

	}
}