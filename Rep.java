import java.util.Scanner;
public class Rep{
	public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	System.out.println("Type in a word");
	String word=in.nextLine();
	System.out.println("Type in an integer number of repitations");
	int number=in.nextInt();
	System.out.println(repl(word,number));

	}
	public static String repl(String a,int x){
	if(x<=0){
	return(" ");
	}else{
	for(int i=1;i<=x;i++){
	System.out.print(a);
	}
	}return(" ");

	}
}