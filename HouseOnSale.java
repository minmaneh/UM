class House{

	int bedNum;
	double squared;
	String gar;

	public House(int number, double squared1,String garageHave){
	bedNum=number;
	squared=squared1;
	gar=garageHave;

	}



	public double price(){

		double price1=0;
		if(bedNum<=2){
			price1=2000*squared;
		}else if(bedNum>=3){
			price1=1500*squared;
		}
		return price1;
	}

	public Boolean garage(){

		boolean yesnoGar=false;
		if(gar=="Yes"){
			yesnoGar=true;
		}
		return yesnoGar;
	}

	public double finalPrice(){
		
		double price2=price();
		if(garage()==true){
			return 25000+price();
		}
		return price2;
	}
}






	public class HouseOnSale{


		public static void main(String[] args){

			House myHouse= new House(2,90.0,"Yes");
			myHouse.price();
			myHouse.garage();
			double fp=myHouse.finalPrice();
			System.out.println(fp);
		}
	}