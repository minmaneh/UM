public class MinRec{
	public static void main(String[]args){

	int[] arr=new int[]{2,8,1,4,7};
	int min=findMin(arr,0,4);
	System.out.println(min);

	}





		public static int findMin(int[] numbers, int start, int last){
	    if(start == last) 
	    return numbers[0];
	    	else{
	    		int min1=Math.min(numbers[start],findMin(numbers, start+1, last));
	    		return min1;
	    	}
		}
}