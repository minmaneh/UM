public class MinGap{

	public static void main(String[]args){
	int[]array=new int[]{1, 3, 5, 7, 12};
	System.out.println(minGap(array));

	}

	public static int minGap(int[]a){
		int ming=1000000;
		if(a.length<2){
		ming=0;
		}
		else{
		for(int i=0;i<a.length-1;i++){
			int c=a[i];
			int d=a[i+1];
			int gap=d-c;
			if(gap<ming){
			ming=gap;
			}
		}
	}
	return ming;
}
}