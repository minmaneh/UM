import java.util.Scanner;

public class Pyramid{
	public static void main(String[]args){

	Scanner in=new Scanner(System.in);
	System.out.println("Type the height of the Pyramid: ");
	int h=in.nextInt();


	for(int i=0;i<h;i++){
	for(int j=h-i;j>1;j--){
	System.out.print("  ");
	}
	int num=(2*i)+1;
	for(int c=1;c<=num;c++){
	System.out.print("[]");
	}
	System.out.println();
	}
}
}