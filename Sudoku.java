public class Sudoku{
	public static void main(String[]args){

	int [][]board={{1,2,3,4,5,6,7,8,9},
					{2,3,4,5,6,7,8,9,1},
					{2,3,4,5,6,7,8,9,1},
					{2,3,4,5,6,7,8,9,1},
					{2,3,4,5,6,7,8,9,1},
					{2,3,4,5,6,7,8,9,1},
					{2,3,4,5,6,7,8,9,1},
					{2,3,4,5,6,7,8,9,1},
					{2,3,4,5,6,7,8,9,1}};
					
	boolean [] checker=new boolean[18];
	boolean newCheck=true;
	for(int k=0;k<checker.length;k++){
	for(int i=0;i<board.length;i++)
		for(int j=0;j<board[i].length;j++){
			checker[k]=rowcolCheck(board[i]);
			
			if(checker[k]==false){
				newCheck=false;
			}
		}
	}

	System.out.println(newCheck);
}




	public static boolean rowcolCheck(int [] rowCol){
		int[] digits= new int[]{1,2,3,4,5,6,7,8,9};
		boolean check=true;
		for(int i=0;i<digits.length;i++){
			for(int j=0;j<rowCol.length;j++){
				if(digits[i]==rowCol[j]){
					check=false;
				}
			}
		}
		return check;
	}


	public static boolean blockCheck(int[][]block)
	int[] digits= new int[]{1,2,3,4,5,6,7,8,9};
	for(int row=0;row<3;row++){
		for(int col=0;col<3;col++){
			for(int i=0;i<digits.;length)

		}
	}


	
 



}