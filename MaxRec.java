public class MaxRec{
	public static void main(String[] args){

	int[] arr=new int[]{2,8,1,4,7};
	int max=findMax(arr,0,4);
	System.out.println(max);

	}



	public static int findMax(int[] numbers,int start,int last){
		if(start==last)
			return numbers[0];
		else{
			int max1=Math.max(numbers[start],findMax(numbers,start+1,last));
			return max1;
		}
	}
}