public class Foo{
	public static void main(String[] args){
	String a=liftOff(7);
	System.out.println(a);
	}



		public static String liftOff(int num) {
 		if (num==1) 
 		return "liftOff";
 		else 
 		return "time"+" left"+" " +liftOff(num-1);
		}
}