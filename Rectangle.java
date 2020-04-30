public class Rectangle{

	double width;
	double length;


	//Default Constructor,if parapeters not given it sets the parapeters of Rectangle
	public Rectangle(){
		width=5.0;
		length=10.0;
	}

	//Constructor for creating the new instance of the class
	public Rectangle(double myWidth, double myLength){
		width=myWidth;
		length=myLength;
	}

	//Method for calculating the Area of Rectangle with given parameters
	public double calculateArea(){
		double area=width*length;
		return area;
	}


    //Testing-Calculating the Area of Rectangles with different parameters

	public static void main(String[] args){
		
		Rectangle rec1= new Rectangle(2.0,3.0);
		Rectangle rec2= new Rectangle(12.0,7.0);
		Rectangle rec3= new Rectangle();		
		System.out.println("The Area of Rectangle1 is: "+rec1.calculateArea());
		System.out.println("The Area of Rectangle2 is: "+rec2.calculateArea());
		System.out.println("The Area of Rectangle3 is: "+rec3.calculateArea());
	}
}