package com.epam_task_cost.Clean_Code;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	
    	Scanner sc=new Scanner(System.in);
        InterestCalculator interestCalculator =new InterestCalculator();
        HouseConstructionCost houseConstructionCost;
        PrintStream myout =  new PrintStream(new FileOutputStream(FileDescriptor.out));
        myout.print("Select an option: \n 1.Simple Interest 2.Compound Interest\n");
        if(sc.nextInt()==1) {
        	myout.print("Enter principal, rate of interest and time in years : \n");
        	double principal=sc.nextDouble();
        	double rate=sc.nextDouble();
        	double timeInYears=sc.nextDouble();
        	myout.print("Amount is: "+interestCalculator.simpleInterest(principal, rate, timeInYears));
        }
        else {
        	myout.print("Enter principal, rate of interest and time in years and number of times interest is compounded in an year :\n");
        	double principal=sc.nextDouble();
        	double rate=sc.nextDouble();
        	double timeInYears=sc.nextDouble();
        	int noOfTimesInterestCompoundedInYear=sc.nextInt();
        	myout.print("Amount is: "+interestCalculator.compoundInterest(principal, rate, timeInYears,noOfTimesInterestCompoundedInYear));
        }
        myout.print("\nHouse Construction-->\nEnter material standard as-(1.standard 2.above standard 3.high standard:\n");
        
        int standard=sc.nextInt();
        myout.print("\n Also enter total area of the house:");
        double area=sc.nextDouble();
        if(standard==3){
        	myout.print("Do you want the house to be fully automated? Enter--\n 1.Yes 2.No\n");
        	int option=sc.nextInt();
        	houseConstructionCost=new HouseConstructionCost(standard,area,option==1?true:false);
        	myout.print("Total cost required: "+houseConstructionCost.cost());
        }
        else {
        	houseConstructionCost=new HouseConstructionCost(standard,area);
        	myout.print("Total cost required: "+houseConstructionCost.cost());
        }
    }
}




/*OUTPUT:
Select an option: 
 1.Simple Interest 2.Compound Interest
1
Enter principal, rate of interest and time in years : 
350
3
5
Amount is: 52.5
House Construction-->
Enter material standard as-(1.standard 2.above standard 3.high standard:
3

 Also enter total area of the house:
456
Do you want the house to be fully automated? Enter--
 1.Yes 2.No
1
Total cost required: 1140000.0
*/