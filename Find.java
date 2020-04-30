public class Find{

	public static void main(String[] args){

	int[] arr1= new int[]{1,2,3,5,7};
	int find1=findVal(arr1,0,4,5);
	System.out.println(find1);
	
	}


		public static int findVal(int[] arr, int start,int end,int x){


		if(end<1)
			return -1;
		else if(arr[start]==x)
			return start;
		else if(arr[end]==x)
			return end;
		else
			return findVal(arr,start+1,end-1,x);
		}



}