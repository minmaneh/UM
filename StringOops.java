import java.util.Scanner;


public class StringOops {

public static void main(String[] args) {

Scanner in = new Scanner(System.in);

System.out.print("Type your name: ");

String name = in.nextLine();
String name1="Jerry";
if(name.equals(name1)){
	System.out.println("You must be really awesome.");
}else{
	String name2=name.replace("a", "e");
	String name3=name2.toUpperCase();
	String name4=name3.substring(0, 3);
	System.out.println(name4+ " has " + name4.length() + " letters");
}
}
}
