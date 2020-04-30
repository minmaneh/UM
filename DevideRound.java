import java.util.Scanner;
import java.lang.Math;

public class DevideRound {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Please type in 2 double numbers you want to devide");
    	
        double n1 = in.nextDouble();
    	double n2 = in.nextDouble();
    	
    	
        int dev2=Devidee(n1,n2);
    	System.out.println("The integer devision number is "+dev2);
    	
        double dev5=Roundee(n1,n2);
    	System.out.println("The rounded devision number is "+Math.round(dev5));
    }

    public static int Devidee(double r, double s) {
        int dev1=(int)(r/s);
        return (dev1);
    }
    
    public static double Roundee(double r, double s) {
        double dev3=r/s;
        return (dev3);
 	
    }
    
}