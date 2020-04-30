public class Longest{

	public static void main(String[]args){
	int[] array1=new int[]{1,3,2,5,6,8,2};
	int[] arr2=longestSortedSequence(array1);
	System.out.println(arr2.length);
	}




	public static int[] longestSortedSequence(int[] array){
		int[] arr=new int[array.length+1];
		for(int i=0;i<array.length-1;i++){
			int count=0;
			while(array[i]<array[i+1]){
				count=count+1;
				System.arraycopy(array,0,arr,0,count);
			}
		}
		return arr;
	}


}