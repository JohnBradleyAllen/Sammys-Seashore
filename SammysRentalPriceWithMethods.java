/*
 * John Allen for Java II @ WU
 */

import java.util.Scanner;

public class SammysRentalPriceWithMethods 
{


	public static void main(String args[])
	{
		int rentalTime = RentalTimeInput();
		Motto();
		computeTime(rentalTime);
	}

	
	public static int RentalTimeInput()
	{
		int time;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the rental time (in minutes): ");
		time = scanner.nextInt();
		return time;
	}

		
	public static void Motto()
	{
		System.out.println("**********************************");
		System.out.println("*Sammy's makes it fun in the sun!*");
		System.out.println("**********************************");
	}

	public static void computeTime(int rentalTime)
	{
		int hoursRented = rentalTime/60;
		int minutesRented = rentalTime - hoursRented*60;
		final int HOURLY_RATE = 40;
		double price;
		
			if (minutesRented>=40)
			{
			price= hoursRented*HOURLY_RATE+40;
				System.out.println("Hours: " + hoursRented);
				System.out.println("Minutes: " + minutesRented);
				System.out.println("Total Price: $" + price);
			}

			else if(minutesRented<40)
			{
			price = hoursRented * HOURLY_RATE + minutesRented;
				System.out.println("Hours: " + hoursRented);
				System.out.println("Minutes: " + minutesRented);
				System.out.println("Total Price: $" + price);

			}
	}

}