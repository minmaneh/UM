import java.util.Arrays;
import java.util.Scanner;

public class Sort{
	public static void main(String[]args){


		Scanner in=new Scanner(System.in);
		System.out.println("Please type integer numbers separated by space and end with a letter");

		int[] arr=new int [0];

	
		while(in.hasNextInt()){
			arr=insert(in.nextInt(),arr);
		}

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}



	

	// public static int[] insert(int newVal,int[]arr){

	// 	int[] newArr= new int[arr.length+1];
	// 	System.arraycopy(arr,0,newArr,0,arr.length);
	// 	newArr[newArr.length-1]=newVal;
	// 	Arrays.sort(newArr);
	// 	return newArr;	
	// }



	public static int[] insert(int newVal,int[]arr){

		int[] newArr=new int[arr.length+1];

		for(int i=0;i<arr.length;i++){
			if(arr[i]>newVal){
				System.arraycopy(arr,0,newArr,0,i);
				newArr[i]=newVal;
				System.arraycopy(arr,i,newArr,i+1,arr.length-i);
				return newArr;
			}
		}

		System.arraycopy(arr,0,newArr,0,arr.length);
		newArr[newArr.length-1]=newVal;
		return newArr;
	}




} 