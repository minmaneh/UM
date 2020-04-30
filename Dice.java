import java.util.Scanner;
import java.lang.Math;
public class Dice{
	public static void main(String[]args){

	Scanner in=new Scanner(System.in);
	System.out.println("Type the number(whole and positive) of dice sides you want to roll");
	int sidenum= in.nextInt();
	int result=(int) (Math.random()* sidenum+1);
	System.out.println(result);
}
}
