import java.util.Scanner;
// Esmeralda Cruz Chapter 3 Assignment 1 2/3/23

public class JobPricing {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter job requested: ");
	String jobName = input.nextLine();
	
	System.out.println("Enter costs,hours required, and hours for time traveled all followed by a space: ");
	
	int costOfM,hourWorked,hourTravel,thW,thT,Estimate;
	costOfM = input.nextInt();
	hourWorked = input.nextInt();
	hourTravel = input.nextInt();
	thW = 35 * hourWorked;
	thT = 12 * hourTravel;
	Estimate = calculate(costOfM,hourWorked,hourTravel);
	System.out.println("You have requested " + jobName + ". The cost of materials " + costOfM + " plus $"
			+thW+ " the cost of hours required plus $"+thT +" for hours traveled leaves your estimate set to value: $"+ Estimate);
	
	}

	private static int calculate(int costOfM, int hourWorked, int hourTravel) {
		// TODO Auto-generated method stub
		int Estimate = costOfM + (35 *hourWorked)+ (12*hourTravel);
		return Estimate;
	}

	
	}


