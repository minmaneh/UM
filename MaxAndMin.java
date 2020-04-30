import java.util.Scanner;
import java.lang.Math;

public class MaxAndMin {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Please type in 5 integer numbers");
    	int n1 = in.nextInt();
    	int n2 = in.nextInt();
    	int n3 = in.nextInt();
        int n4 = in.nextInt();
        int n5 = in.nextInt();
    	
        int m3=maxOf3(n1,n2,n3);
        int m33=minOf3(n1,n2,n3);
    	System.out.println("Maximum: " + maxOf3(m3,n4,n5));
    	
    	System.out.println("Minimum: " + minOf3(m33,n4,n5));
    }

    public static int maxOf3(int r, int s, int t) {
        int MaxNumber1=Math.max(r,s);
        int MaxNumber=Math.max(MaxNumber1,t);
        return(MaxNumber);	
    }
    
    public static int minOf3(int r, int s, int t) {
    	int MinNumber1=Math.min(r,s);
        int MinNumber=Math.min(MinNumber1,t);
        return(MinNumber);
    }
    
}