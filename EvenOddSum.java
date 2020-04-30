import java.util.Scanner;

public class EvenOddSum{
	public static void main(String[]args){


	Scanner in=new Scanner(System.in);
	System.out.println("Please type integer numbers separated by space and end with a letter");

	int count=0;
	while(in.hasNextInt()){
		count=count+1;
		int [] arr= new int [count];
		for(int i=0;i<arr.length;i++){
			arr[i]=in.nextInt();
		}
		return arr;
	}
	

	int sumOdd=oddSum(arr);
	int sumEven=evenSum(arr);
	if(sumOdd>sumEven){
		System.out.println("The sum of odd indexed elements is greater");
	}else if(sumEven>sumOdd){
		System.out.println("The sum of even indexed elements is greater");
	}else{
		System.out.println("The sum of odd indexed elements and even indexed elements are equal");
	}
	}




	public static int oddSum(int [] arr1){
		int sum1=0;
		for(int i=1;i<arr1.length;i=i+2){
			sum1=sum1+arr1[i];
		}
		return sum1;
	}

	public static int evenSum(int[] arr2){
		int sum2=0;
		for(int i=0;i<arr2.length;i=i+2){
			sum2=sum2+arr2[i];
		}
		return sum2;
	}


}