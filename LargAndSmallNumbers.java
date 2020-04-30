import java.util.Scanner;
public class LargAndSmallNumbers{

	public static void main(String[]args){

	Scanner in=new Scanner(System.in);
	System.out.println("Please Type in integer numbers separated my space and end with letter: ");
	int max=0;
	int min=999999;
	while(in.hasNextInt()){
	int num= in.nextInt();
	if(num<min){
	min=num;
	}
	if(num>max){
	max=num;
	}

	}
	System.out.println("Maximum number in your input is: "+max);
	System.out.println("Minimum number in your input is: "+min);

	}


}