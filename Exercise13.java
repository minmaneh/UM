public class Exercise13{
	public static void main(String[]args){
	System.out.println(printGrid(4,6));
	}



	public static String printGrid(int column,int row){
	int i,j;
	
		for(i=1;i<=column;i++){
			
			for(j=i;j<=column*row;j=j+column){
			System.out.print(j+" ");
						
	}
	System.out.println();
	}
	return("");
	}
}