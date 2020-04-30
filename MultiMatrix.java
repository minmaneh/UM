public class MultiMatrix{
	public static void main(String[]args){


		double[][] matrix1 = {{1.0,2.0,3.0},{4.0,5.0,6.0}};
		double[][] matrix2 = {{1.0,2.0,3.0},{4.0,5.0,6.0},{7.0,8.0,9.0}};
		double[][] matrix3={{1.0,2.0},{4.0,5.0},{7.0,8.0}};
		//double[][] matrix4={{1.0,2.0,3.0,4.0},{1.0,2.0,3.0,4.0}};

		double[][] multed1=multiMat(matrix1,matrix2);
		double[][] multed2=multiMat(matrix2,matrix3);
		double[][] multed3=multiMat(matrix1,matrix3);

		
		//double[][] multed4=multiMat(matrix2,matrix4);For these two matrixes it says that the multiplication is illegal:

		
		System.out.println("The Product of Matrix1 and Matrix 2 is: ");
		//Prints out the product of Matrix1 and Matrix 2 as matrix
		for(int i=0;i<multed1.length;i++){
			for(int j=0;j<multed1[i].length;j++){
				System.out.print(multed1[i][j]+" ");
			}
			System.out.println("");
		}

		System.out.println("The Product of Matrix2 and Matrix 3 is: ");
		//Prints out the product of Matrix2 and Matrix 3 as matrix
		for(int i=0;i<multed2.length;i++){
			for(int j=0;j<multed2[i].length;j++){
				System.out.print(multed2[i][j]+" ");
			}
			System.out.println("");
		}


		System.out.println("The Product of Matrix1 and Matrix3 is: ");
		//Prints out the Product of Matrix1 and Matrix3 as matrix
		for(int i=0;i<multed3.length;i++){
			for(int j=0;j<multed3[i].length;j++){
				System.out.print(multed3[i][j]+" ");
			}
			System.out.println("");
		}

		// System.out.println("The Product of Two Matrixes is: ");

		// for(int i=0;i<multed4.length;i++){
		// 	for(int j=0;j<multed4[i].length;j++){
		// 		System.out.print(multed4[i][j]+" ");
		// 	}
		// 	System.out.println("");
		// }

	}


	public static double[][] multiMat(double[][]mat1, double[][] mat2){

		int heigth2=mat2.length;
		int heigth1=mat1.length;
		int width1=mat1[0].length;
		int width2=mat2[0].length;
		double [][] prod12= new double[heigth1][width2];

		//For a legal Multiplication 
		if(width1!=heigth2){
			System.out.println("Illegal matrixes that can't be multiplied!");	
		}


		for(int i = 0; i < heigth1; i++) {
            for (int j = 0; j <width2 ; j++) {
                for (int k = 0; k < width1; k++) {
                    prod12[i][j]=prod12[i][j]+mat1[i][k] * mat2[k][j];
                }
            }
        }
        return prod12;
	}

}


