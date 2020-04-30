public class Equal{
	public static void main(String[]args){
	int [] c=new int[]{1,2,3,5};
	int [] d=new int[]{2,6,3};
	System.out.println(equals(c,d));
	}

	public static boolean equals(int[] a,int[] b){
	boolean AreEqual=true;
	for(int i=0;i<a.length;i++){
			if(a.length!=b.length || a[i]!=b[i]){
				AreEqual=false;	
			}
		}
		return AreEqual;
	}

}