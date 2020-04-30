import java.util.Scanner;
public class order{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Please type the words ");
		String words=in.nextLine();
		String [] AllWords = words.split(" ");
		String word1=AllWords[0];
		String word2=AllWords[1];
		String word3=AllWords[2];
		int a1=word1.compareTo(word2);
		int a2=word1.compareTo(word3);
		int a3=word2.compareTo(word3);

		if(a1>0 && a2>0 && a3>0){
			System.out.println("The right order is: "+ word3+" "+word2+" "+word1);
		}else if(a1>0 && a2>0 && a3<0){
			System.out.println("The right order is: "+word2+" "+word1+" "+word3);
		}else if(a1<0 && a2>0 && a3>0){
			System.out.println("The right order is: "+word3+" "+word1+" "+word2);	
		}else if(a1<0 && a2<0 && a3>0){
			System.out.println("The right order is: "+word1+" "+word3+" "+word2);
		}else if(a1<0 && a2<0 && a3<0){
			System.out.println("The right order is: "+word1+" "+word2+" "+word3);	
		}else if(a1>0 && a2<0 && a3<0){
			System.out.println("The right order is: "+word2+" "+word3+" "+word1);
		}else if(a1==0 && a2==0 && a3==0){
			System.out.println("The words were in the right ordering "+word1+" "+word2+" "+word3);
		}else if(a1==0 && a3>0 ){
			System.out.println("The right order is: "+word3+" "+word1+" "+word2);
		}else if(a1==0 && a3<0){
			System.out.println("The right order is: "+word1+" "+word2+" "+word3);	
		}else if(a2==0 && a3>0){
			System.out.println("The right order is: "+word1+" "+word3+" "+word2);	
		}else if(a2==0 && a3<0){
			System.out.println("The right order is: "+word2+" "+word1+" "+word3);		
		}else if(a3==0 && a1>0){
			System.out.println("The right order is: "+word2+" "+word3+" "+word1);	
		}else if(a3==0 && a1<0){
			System.out.println("The right order is: "+word1+" "+word2+" "+word3);	
		}else{
			System.out.println("Please,Type in 3 words");
		}
		
	}
}