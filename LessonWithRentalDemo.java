/*
 * @author John B. Allen
 */
import java.util.Scanner;

public class LessonWithRentalDemo 
{
	public static void main(String[] args) 
	{
		//The array to return 8 rentals.
		Rental rentals[] = new Rental[8];
			for (int i = 0; i < 8; i++) 
			{
				System.out.println("\nRental " + (i + 1));
				rentals[i] = new Rental(getContractNumber(), getMinutes(), getContactPhoneNumber(), getEquipment());
			}

		int choice = 0;
			Scanner scan = new Scanner(System.in);
		while(choice != 4) 
		{
			showMenu();
		choice = Integer.parseInt(scan.next());
		Rental temp = null;
			switch(choice) 
			{
				case 1:
				for (int i = 0; i < 8; i++)
			{
				for (int j = i + 1; j < 8; j++)
				{
					if (rentals[i].getContractNumber().compareTo(rentals[j].getContractNumber()) > 0)
					{
						temp = rentals[i];
						rentals[i] = rentals[j];
						rentals[j] = temp;
					}
				}
			}	

		//Sorts  by Contract Number.
		System.out.println("Rentals Sorted In Ascending Order By Contract Number: ");
		System.out.println();
			for (int i = 0; i < 8; i++) 
			{
				System.out.println("\nRental " + (i + 1));
				displayDetails(rentals[i]);
			}

		System.out.println();
		case 2:
		for (int i = 0; i < 8; i++)
		{
			for (int j = i + 1; j < 8; j++)
			{
				if (rentals[i].getPrice() > rentals[j].getPrice())
				{
					temp = rentals[i];
					rentals[i] = rentals[j];
					rentals[j] = temp;
				}
			}
		}

		//Sorts by Price.
		System.out.println();
		System.out.println("Rentals Sorted In Ascending Order By Price: ");
			for (int i = 0; i < 8; i++) 
			{
				System.out.println("\nRental " + (i + 1));
				displayDetails(rentals[i]);
			}

		System.out.println();
		case 3:
		for (int i = 0; i < 8; i++)
		{
			for (int j = i + 1; j < 8; j++)
			{
				if (rentals[i].getEquipment().compareTo(rentals[j].getEquipment()) > 0)
				{
					temp = rentals[i];
					rentals[i] = rentals[j];
					rentals[j] = temp;
				}
			}
		}

		//Sorts by Equipment Type.
		System.out.println();
		System.out.println("Rentals Sorted In Ascending Order By Equipment Type: ");
			for (int i = 0; i < 8; i++)
			{
				System.out.println("\nRental " + (i + 1));
				displayDetails(rentals[i]);
			}
		
		System.out.println();
			case 4:
		System.out.println("Goodbye!!");
		System.exit(0);
			default:
		System.out.println("Select The Correct Choice!");
			}
			}
			}

		//Menu Method.
		public static void showMenu() 
		{
			System.out.println("Please Select The Option: ");
			System.out.println("1. Sort By Contact number.");
			System.out.println("2. Sort By Price.");
			System.out.println("3. Sort By Equipment Type.");
			System.out.println("4. Exit");
		}

		//Get Method.
		public static String getContractNumber() 
		{
			String num;
			Scanner input = new Scanner(System.in);
			System.out.print("Enter Contract Number: ");
			num = input.nextLine();
			return num;
		}

		//Get Method.
		public static String getContactPhoneNumber() 
		{
			String phoneNumber;
			Scanner input = new Scanner(System.in);
			System.out.print("Enter Contact Phone Number: ");
			phoneNumber = input.nextLine();
			return phoneNumber;
		}

		//Get Method.
		public static int getMinutes() 
		{
			int minutes;
			Scanner input = new Scanner(System.in);
			System.out.print("Enter minutes: ");
			minutes = input.nextInt();
			return minutes;
		}

		//Get Method.
		public static int getEquipment()
		{
			int equipment;
			Scanner input = new Scanner(System.in);
			System.out.print("Enter Equipment Type: ");
			equipment = input.nextInt();
			return equipment;
		}

		//Method to display details.
		public static void displayDetails(Rental r) 
		{
			System.out.println("\nThe Contract Number Is: " + r.getContractNumber());
			System.out.print("For a rental time of " + r.getHours() + " hours & " + r.getExtraMinutes());
			System.out.printf(" minutes, at a rate of $%.2f,", r.HOURLY_RATE);			
			System.out.printf(" the total price is $%.2f\n", r.getPrice());
			System.out.println("Contact Phone Number: " + r.getContactPhoneNumber());
			System.out.println("The equipment Type Rented Is: " + r.getEquipment());
		}
}
