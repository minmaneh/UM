import java.util.*;
public class FarenheitCelsius {
	
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	 System.out.println("Enter tempreture in  Farenheit"); 
	 double Farenheit; 
	 Farenheit = in.nextDouble();
	 System.out.println(CTF(Farenheit));	
	}
		public static double CTF(double Farenheit){
		double Celsius= (Farenheit-32)/1.8;
		return (Celsius);
		}
}