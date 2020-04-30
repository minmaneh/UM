public class Lab6Comb {

    public static void main(String[] args) {

        int[][] arr = new int[][] {
            {
                1,
                2,
                3,
                4
            }, {
                5,
                6,
                7,
                8
            }, {
                9,
                10,
                11,
                12
            }
        };
        diagonalPrint(arr);

        int[] A = new int[] {
            0,
            2,
            0,
            2,
            0,
            2,
            2,
            1,
            1,
            0
        };
        int[] B = new int[] {
            0,
            1,
            1,
            4,
            0,
            2,
            0,
            1,
            0,
            2
        };

        int aCheck = allNumsWithin(A, 3);
        int bCheck = allNumsWithin(B, 5);

        System.out.println("");

        System.out.println(aCheck);
        System.out.println(bCheck);


    }

    //Function for the Exercise1

    public static void diagonalPrint(int[][] M) {
        int rowCount = M.length;
        int colCount = M[0].length;

        //Printing from the first row up to last row when we go down each row while row is greater than 0 and up with the column ,
        //so we print elements starting at index [0][0] up to the part when the length of diagonal is equal to the length of the column
        for(int r = 0; r < rowCount; r++) {
            for(int row = r, col = 0; row >= 0 && col < colCount; row--, col++) {
                System.out.print(M[row][col] + "-");
            }
        }

        //Printing elements from the buttom starting from the first column of last row(rowcount-1) this is the point when the length of diagonal is equal to the number of rows
        //And the elements become printed from the buttom going up with the rows and and columns
        for(int c = 1; c < colCount; c++) {
            for(int row = rowCount - 1, col = c; row >= 0 && col < colCount; row--, col++) {
                System.out.print(M[row][col] + "-");
            }
        }

    }



    //Functions for the Exercise2

    //This function checks wheather all the elements are present until k-1.
    public static boolean checkAllNums(int[] arr1, int k) {

        int len = k;
        // int[] arrayCheck= new int[len];
        boolean[] arrayTF = new boolean[k];

        for(int i = 0; i < arr1.length; i++){
            arrayTF[arr1[i]] = true;
        }

        boolean allTrue = true;

        for(int c = 0; c < arrayTF.length; c++){
            if(!arrayTF[c]){
                allTrue = false;
            }

        }
        return allTrue;
    }




    //Find all subarrays and checkAllNums for that subarray,if the length of subarray is
    //smaller than the length of previous subarray for which checkAllNums is true return the length of new array
    //Checking all the subarrays iterating from index 0 up to the end 



    public static int allNumsWithin(int[] arr2, int k) {
        int minlen = 0;
        for(int d = 0; d < arr2.length; d++){
            for(int e = arr2.length - 1; e > 0; e--){
                int[] array3 = new int[arr2.length - d];
                System.arraycopy(arr2, d, array3, 0, arr2.length - d);
                //Calling the function chaeckAllNums for checking if all the numbers are present in the array3
                if(checkAllNums(array3, k)){
                    minlen = arr2.length;
                    if(array3.length < minlen){
                        minlen = array3.length;
                    }
                }
            }
        }
        return minlen;
    }


}

