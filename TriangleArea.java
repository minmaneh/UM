import java.util.Scanner;

public class TriangleArea{
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		 
		System.out.println("Please type the Heigh of the Triangle");

		double heigh = in.nextDouble();
		

		System.out.println("Please type the Width of the Triangle");
		double width = in.nextDouble();
		
		System.out.println(TArea(heigh,width));
		
	}
		public static double TArea(double heigh,double width){
		double Area= (heigh*width)/2;
		return (Area);
		}
	
}