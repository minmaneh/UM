import java.util.Scanner;

public class TowersHanoi{
	public static void main(String[] args){

		//Taking the height of the tower from the user as an iput
		Scanner in= new Scanner(System.in);
		System.out.println("Give the tower height: ");

		int n = in.nextInt();
		//Calling the function with the parameters specified from the user's input
		towerHan(n,"first","third","second");

		//When the function finishes it's work print "You are done!"
		System.out.println("You are done!");

	}


		//function which completes the steps,taking as a parameter the number of disks to be transferred 
	    //the starting point the ending point and the extra available space
		public static void towerHan(int n,String from,String to, String extra){

			if(n==1){ //if you need to move only one disk 
				System.out.println("Move the top disc from the "+from +" stack to the "+to +" stack");
			}else{	//in other cases continue deviding the task 
				towerHan(n-1,from,extra,to); 
				System.out.println("Move the top disc from the "+ from+ " stack to the "+ to+" stack");
				towerHan(n-1,extra,to,from);	
			}
		}


}






