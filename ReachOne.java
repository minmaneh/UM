public class ReachOne{
	public static void main(String[]args){

	int a=go(4);
	System.out.println("The number of steps to reach one: "+a);


	}



	public static int go(int x){
		int count=0;
		if(x==1){
			System.out.println(x+" ");
			return count;
		}
		else if(x%2==0){
			System.out.println(x+" ");
			return count+1+go(x/2);
		}else {
			count=count++;
			System.out.println(x+" ");
			 return count+1+go(x*3+1);
		}
		
}
}
