import java.util.*;
public class Interest {
    int principal,rate,time,no_of_years;
    void calculate()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.format("%s","Enter the value of principal balance :");
    	principal = sc.nextInt();
    	System.out.format("%s","Enter the value of annual interest rate :");
    	rate=sc.nextInt();
    	System.out.format("%s","Enter the value of time in years :");
    	time=sc.nextInt();
    	System.out.format("%s","Enter the value of time period :");
    	no_of_years=sc.nextInt();
    	float SI=simpleInterest(principal,rate,time);
    	float CI=compundInterest(principal,rate,time,no_of_years);
    	System.out.format("%s","SI :"+SI);
    	System.out.format("%s","CI :"+CI);
    	sc.close();
    	
    }
    float simpleInterest(int principal,int rate,int time)
    {
    	int simple_interest= principal*(1+rate*time);
    	return (float)simple_interest;
    }
    float compundInterest(int principal,int rate,int time,int no_of_years)
    {
    	int compound_interest = principal*(1+rate/no_of_years)*no_of_years*time;
    	return (float)compound_interest;
    }
    
}