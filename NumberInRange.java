import java.util.Random;
public class NumberInRange{
	public static void main(String[] args){
	Random rnd=new Random();
	int n1=rnd.nextInt();
	
	//doesn't include 21,its from 0 to 20
	int n2=rnd.nextInt(21);
	//include numbers from 5 to 35; 
	int n3=rnd.nextInt(31) +5; 
	int n4=rnd.nextInt(90000)+1000;
	System.out.println("The number in range is "+rndRange(30,50));

	}
	public static int rndRange(int start,int finish){
	Random rnd=new Random();
	int rndInt=rnd.nextInt(finish+1-start)+start;
	return rndInt;
	}
}