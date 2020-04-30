public class Swap{
	public static void main(String[]args){

	int[] a1 = {11, 42, -5, 27, 0, 89};

	int[] a2 = {10, 20, 30, 40, 50, 60};

	swapAll(a1, a2);

	System.out.println("a1: ");
	for(int i=0;i<a1.length;i++){
		System.out.print(a1[i]+" ");
	}
	System.out.println("");
	System.out.println("a2: ");
	for(int i=0;i<a2.length;i++){
		System.out.print(a2[i]+" ");
	}

	}

	public static void swapAll(int[]a1,int[]a2){
	int ArrayList a3 = new ArrayList<>();
	for(int i=0;i<a1.length;i++){
		a3[i]=a1[i];
	}
	for(int j=0;j<a2.length;j++){
		a1[j]=a2[j];
	}
	for(int k=0;k<a2.length;k++){
		a2[k]=a3[k];
	}

	}
}