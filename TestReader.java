import java.util.Scanner;
public class TestReader {
 public static void main(String[] args) {
 Scanner stdin = new Scanner(System.in);
 System.out.println("Enter integer value for a: ");
 int a;
 a = stdin.nextInt();
 System.out.println("You gave me :"+ a);
 }
}