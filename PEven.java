public class PEven{
	public static void main(String[]args){
	int []arr=new int[]{6,2,9,11,3};
	percentEven(arr);
	System.out.println(percentEven(arr));
	}

	public static double percentEven(int [] arr){
		double evens=0;
		double arrl=(double)(arr.length);
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
			evens=evens+1;
			}
		}
		double percenteven= (evens*100)/arrl;
		return percenteven;

	}
}