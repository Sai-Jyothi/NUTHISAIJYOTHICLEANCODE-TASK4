import java.util.Scanner;

public class Epam_task {

	public static void main(String[] args) {
		
	
		System.out.format("%s","Select a number: \n 1: Interest calculations \n 2: Cost Estimation");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==1)
		{
			Interest  interest =new Interest();
		    interest.calculate();
		}
		else if(choice==2)
		{
			CostEst estimation= new CostEst();
			estimation.findcost();
		}
		else
		{
			System.out.format("%s","Select a choice between 1-2");
		}
sc.close();
	}

}