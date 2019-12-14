/*
 * @author John Allen.
 */

// * The Rental class contains data about the rental.
public class Rental 
{   
	//Fields	
	public static final int MINUTES_IN_HOUR = 60;
	public static final double HOURLY_RATE = 40.00;
	private double lessonFee = 27;
	public static final int CONTRACT_NUM_LENGTH = 4;
	protected static String contractNumber;
	int equipment;
	private int hours;
	private int extraMinutes;
	private double price;
	private String contactPhoneNumber;	   
	private static final String[] equipments = {"Personal Watercraft","Pontoon Boat","Rowboat","Canoe","Kayak","Beach Chair","Umbrella","Other"};

	//Methods	  
	public Rental(String num, int minutes) 
	  {
	       setContractNumber(num);
	       setHoursAndMinutes(minutes);
	       setContactPhoneNumber(contactPhoneNumber);
	   }
	   //String to format contract number, ?, phone number, contract length. I can't get the error to go away unless I leave it a stub.
	   public Rental(String string, int i, String string2, int j) 
	   {
	   }

	   //Set Method to set the contract number.
	   public void setContractNumber(String num) 
	   {
		   if(num.length()!=4 || !num.substring(1).matches("[0-9]+") || !num.substring(0,1).matches("[a-zA-Z]+"))
	         num = "A000";
	       if(!num.substring(0,1).matches("[A-Z]+"))
	         num = num.toUpperCase();
	       contractNumber = num;
	   }

	   //Set Method to set the contact phone number.
	   public void setContactPhoneNumber(String number)
	   {
	       number = number.replaceAll("[^0-9]", "");
	       contactPhoneNumber = number;
	       	if(number.length()!=10)
	       contactPhoneNumber = "000-000-0000";
	   }

	   //Set Method to set the hours and minutes.
	   public void setHoursAndMinutes(int minutes) 
	   {
	       hours = minutes / MINUTES_IN_HOUR;
	       extraMinutes = minutes % MINUTES_IN_HOUR;
	       	if(extraMinutes <= HOURLY_RATE)
	       price = hours * HOURLY_RATE + extraMinutes;
	       	else
	       price = hours * HOURLY_RATE + HOURLY_RATE;
	   }
	   
	   //Set method to set equipment rental.
	   public void setEquipment(int equipment) 
	   {
	       if(equipment > 7)
	           this.equipment = 7;
	       else
	           this.equipment = equipment;
	   }

	   //Get method to get the contract number.
	   public static String getContractNumber() 
	   {
	       return contractNumber;
	   }

	   //Get method to get the hours of rental.
	   public int getHours() 
	   {
	       return hours;
	   }

	   //Get method to get the extra minutes of the rental.
	   public int getExtraMinutes() 
	   {
	       return extraMinutes;
	   }

	   //Get method to get the renters phone number.
	   public String getContactPhoneNumber() 
	   {
	       StringBuilder sb = new StringBuilder(contactPhoneNumber);
	       sb.insert(0,'(');
	       sb.insert(4,')');
	       sb.insert(8,'-');
	       return sb.toString();
	   }
	 
	   //Get method to get the rental price.
	   public double getPrice() 
	   {
	       return price + lessonFee;
	   }
	   
	   //Get method to get the equipment rented.
	   public String getEquipment() 
	   {
	       return equipments[equipment];
	   }
}