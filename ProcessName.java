import java.util.*;
public class ProcessName {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Type your name and surname: ");
String namesurname=in.nextLine();
String [] NameParts = namesurname.split(" ");
String name=NameParts[0];
String surname=NameParts[1];



System.out.println("Your name is: " + surname + ","+ name.substring(0,1)+".");
}
}