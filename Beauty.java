import java.util.Scanner;
class Beauty{
	public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	System.out.println("Input the scores of 1st Contestant:  ");
	double[]arr1=new double[3];
	double sum1=0;
	for(int i = 0; i < 3; i++)
        {
            arr1[i] = in.nextDouble();
            sum1=sum1+arr1[i];
        }
        double avg1=sum1/3;
    System.out.println("Input the scores of 2st Contestant:  ");
	double[]arr2=new double[3];
	double sum2=0;
	for(int i = 0; i < 3; i++)
        {
            arr2[i] = in.nextDouble();
            sum2=sum2+arr2[i];
        }
        double avg2=sum2/3;
    System.out.println("Input the scores of 3st Contestant:  ");
	double[]arr3=new double[3];
	double sum3=0;
	for(int i = 0; i < 3; i++)
        {
            arr3[i] = in.nextDouble();
            sum3=sum3+arr3[i];
        }
        double avg3=sum3/3;
    System.out.println("Input the scores of 4st Contestant:  ");
	double[]arr4=new double[3];
	double sum4=0;
	for(int i = 0; i < 3; i++)
        {
            arr4[i] = in.nextDouble();
            sum4=sum4+arr4[i];
        }
        double avg4=sum4/3;
    System.out.println("Input the scores of 5st Contestant:  ");
	double[]arr5=new double[3];
	double sum5=0;
	for(int i = 0; i < 3; i++)
        {
            arr5[i] = in.nextDouble();
            sum5=sum5+arr5[i];
        }
        double avg5=sum5/3;
    double average=(avg1+avg2+avg3+avg4+avg5)/5;


    System.out.println("The total score of 1st Contestant is: "+sum1);
    System.out.println("The total score of 2st Contestant is: "+sum2);
    System.out.println("The total score of 3st Contestant is: "+sum3);
    System.out.println("The total score of 4st Contestant is: "+sum4);
    System.out.println("The total score of 5st Contestant is: "+sum5);
    System.out.println("The average score of All Contestant is: "+average);
	}
}