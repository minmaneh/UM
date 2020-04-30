public class MatrixAdd{


	public static void main(String[]args){

	double[][] matrix1 = {{1.0,2.0,3.0},{4.0,5.0,6.0},{7.0,8.0,9.0}};
	double[][] matrix2 = {{1.0,2.0,3.0},{4.0,5.0,6.0},{7.0,8.0,9.0}};

	double[][] added=matrixAdd(matrix1,matrix2);

	System.out.println("The sum of two matrixes is: ");

	for(int i=0;i<added.length;i++){
		for(int j=0;j<added[i].length;j++){
			System.out.print(added[i][j]+" ");
		}
		System.out.println("");
	}
	

	}


	public static double[][] matrixAdd(double[][]mat1,double[][]mat2){
		int row=mat1.length;
		int column=mat1[0].length;
		double[][] addMat= new double[row][column];
		if(mat1.length!=mat2.length){
			System.out.println("Wrong matrixes that don't have the same dimensions!");
		}

		for(int i=0;i<mat1.length;i++){
			if(mat1[i].length!=mat2[i].length){
				System.out.println("Wrong matrixes that don't have the same dimensions!");
			}

		}

		for(int i=0;i<mat1.length;i++){
				for(int j=0;j<mat1[i].length;j++){
					addMat[i][j]=mat1[i][j]+mat2[i][j];
				}
			}
			
		
		return addMat;
		
	}


}