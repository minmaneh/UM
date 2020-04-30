public class Passing{
	public static void main(String[]args){

	
	double[][] grail={
						{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15},
						{12.5,13.4,12.0,11.0,21.0,31.0,12.0,12.6,13.5,13.6,12.0,14.5,13.4,35.0,12.8}
					};
	System.out.println(checkGrades(grail));
	}
	public static boolean checkGrades(double[][]grail){
	boolean pass=true;
		for(int j=0;j<15;j++){
			if(grail[1][j]<=5.5){
				pass=false;
		}
		}
		return pass;
	}
}