import java.util.Scanner;
import java.util.Random;

public class SprloGame{
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your play:");
		
		String player = in.nextLine();
		String pI=player.toUpperCase();
		Random rd=new Random();
		String play="SPRLO";
		char cP1 = play.charAt(rd.nextInt(play.length()));
        String cP=Character.toString(cP1);

		System.out.println("Computer play is "+cP);
		if(pI.equals("S") && cP.equals("P")){
			System.out.println("You won!");
		}else if(pI.equals("P") && cP.equals("S")){
			System.out.println("You lose!");
		}else if(pI.equals("P") && cP.equals("R")){
			System.out.println("You won");
		}else if(pI.equals("R") && cP.equals("P")){
			System.out.println("You lose!");	
		}else if(pI.equals("R") && cP.equals("L")){
			System.out.println("You won");	
		}else if(pI.equals("L") && cP.equals("R")){
			System.out.println("You lose!");	
		}else if(pI.equals("L") && cP.equals("S")){
			System.out.println("You won");	
		}else if(pI.equals("S") && cP.equals("L")){
			System.out.println("You lose!");	
		}else if(pI.equals("O") && cP.equals("S")){
			System.out.println("You won");
		}else if(pI.equals("S") && cP.equals("O")){
			System.out.println("You lose!");	
		}else if(pI.equals("S") && cP.equals("L")){
			System.out.println("You won");	
		}else if(pI.equals("L") && cP.equals("S")){
			System.out.println("You lose!");	
		}else if(pI.equals("L") && cP.equals("P")){
			System.out.println("You won");	
		}else if(pI.equals("L") && cP.equals("P")){
			System.out.println("You lose!");	
		}else if(pI.equals("P") && cP.equals("O")){
			System.out.println("You won");	
		}else if(pI.equals("O") && cP.equals("P")){
			System.out.println("You lose!");	
		}else if(pI.equals("O") && cP.equals("R")){
			System.out.println("You won");
		}else if(pI.equals("R") && cP.equals("O")){
			System.out.println("You lose!");	
		}else if(pI.equals("R") && cP.equals("S")){
			System.out.println("You won");	
		}else if(pI.equals("S") && cP.equals("R")){
			System.out.println("You lose!");	
		}else{
			System.out.println("Tie!");
		}

}
}