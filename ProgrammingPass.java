import java.util.Scanner;

public class ProgrammingPass {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("Please type your lab grade: ");
		
	
		double LabGrade = in.nextDouble();

		System.out.println("Please type your exam grade: ");
		double ExamGrade= in.nextDouble();
		
		if(LabGrade+ExamGrade>=6.0){
			System.out.println("Congrats you have passed the Course");
		}else{
			System.out.println("Oops,You have failed");
		}
		
	}

}