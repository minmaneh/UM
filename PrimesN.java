public class PrimesN{
	public static void main(String[]args){

	int NumofPrime=0;
	int maxN=1000;
	for(int i=0;i<=10000;i++){
		if(i!=0 && i!=1&& IfPrime(i)){
		NumofPrime=NumofPrime+1;
		}
	}System.out.println("The number of Prime numbers between 0 and 10000 are: "+NumofPrime);
	}



	public static boolean IfPrime(int x){
		int rem;
		for(int i=2;i<x;i++){
			rem=x%i;
			if(rem==0){
			return false;
			}
		}return true;
	}
}