import java.nio.file.*;
import java.io.*;
import java.util.Scanner;

public class RentalDemoAndCreateFile 
{
		public static void main(String[] args, OpenOption CREATE)
		{
			Scanner input = new Scanner(System.in);
			Path file = Paths.get("C:\\Document\\Eclipse-Workspace\\Sammys.txt");
			String s = "";
			String delimiter = ",";
			int id;
			String name;
			Double payRate;
			final int QUIT = 999;
			try
			{
				OutputStream output = new
						BufferedOutputStream(Files.newOutputStream(file, CREATE));
				BufferedWriter writer = new
						BufferedWriter(new OutputStreamWriter(output));
				System.out.print("Enter Contract Number: ");
				id = input.nextInt();
				while(id != QUIT);
				{
					System.out.print("Enter Contract Number " + id + ": ");
					input.hasNextLine();
					name = input.nextLine();
					System.out.print("Enter Rental Time: ");
					payRate = input.nextDouble();
					s = id + delimiter + name + delimiter + payRate;
					writer.write(s, id, s.codePointAt(length()));
					writer.newLine();
					System.out.print("Enter Next Contract Number or " + QUIT + " to quit");
					id = input.nextInt();
				}
				writer.close();
				}
				catch(Exception e)
				{
					System.out.println("Message: " + e);
				}
		}

		private static int length() {
			// TODO Auto-generated method stub
			return 0;
		}
	}
