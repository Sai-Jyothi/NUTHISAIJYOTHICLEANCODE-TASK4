import java.util.InputMismatchException;
import java.util.Scanner;
public class CostEst {
 float area;
 int standard;
 boolean automate;
 
 void findcost()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.format("%s","Enter the area of the house (in sq.ft) :");
	 area=sc.nextFloat();
	 System.out.format("%s","Choose the material quality :\n 1.Standard Material\n 2.Above Standard Material\n 3.High Standard Material");
	 standard = sc.nextInt();
	 try {
	 System.out.format("%s","Do you want a fully automated house ?(Enter true/false )");
	 automate=sc.nextBoolean();
	 }
	 catch(InputMismatchException e)
	 {
		 System.out.format("%s",e);
	 }
	 if(automate)
	 {
		 System.out.format("%s","Cost incurred is  "+area*2500);
	 }
	 else
	 {
		 if(standard == 1)
			 System.out.format("%s","Cost incurred is "+area*1200);
		 else if(standard == 2)
			 System.out.format("%s","Cost incurred is "+area*1500);
		 else if(standard == 3)
			 System.out.format("%s","Cost incurred is "+area*1800);
	 }
	 sc.close();
 }
}