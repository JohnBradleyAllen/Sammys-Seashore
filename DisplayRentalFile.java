	import java.io.*;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.Paths;
public class DisplayRentalFile 
{
	{
		public abstract void main;
		{
			Path file = Paths.get("C:\\Document\\Eclipse-Workspace\\Sammys.txt");
			String s = "";
			try
			{
				InputStream input = new
						BufferedInputStream(Files.newInputStream(file));
				BufferedReader reader = new
						BufferedReader(new InputStreamReader(input));
				s = reader.readLine();
				while(s != null)
				{
					System.out.println(s);
					s = reader.readLine();
				}
				reader.close();
			}
			catch(Exception e)
			{
				System.out.println("Message: " + e);
			}
		}
	}
}
