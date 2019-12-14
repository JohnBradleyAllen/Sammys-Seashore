//LessonWithRental Class holds details regarding training for equipment rentals.
public class LessonWithRental extends Rental
{
	//Boolean field that indicates whether a lesson is required or optional for the type of equipment rented.
	private boolean lessonRequired;
	//Also include a final array that contains Strings representing the names of the instructors for each of the eight equipment types, and store names that you choose in the array.
	private final String[] instructorNames = {"Eddie Ghallagher", "Clint Lorance", "Matthew Golsteyn", "Tech Lead", "Forrest Knight", "Heath Adams", "Joshua Fluke", "Dylan Israel"};
	private int equipmentType;
	private String getEquipmentType;
	
	//Constructor that requires arguments for an event number, minutes for the rental, and an integer equipment type. 
	public LessonWithRental(String contractNumber, int hoursAndMinutes, int equipmentType) 
	{
		super(getContractNumber(), hoursAndMinutes);
		this.equipmentType = equipmentType;
		
		if((this.equipmentType == 0) || (this.equipmentType == 1))
			lessonRequired = true;
		else
			lessonRequired = false;	
	}
	
	//Method to get an instructor.
	public String getInstructor() 
	{
		return toString(equipmentType);
	}
	
	//Outputs whether an instructor is required or not and then assigns instructor as neccessary.
	public String toString(int equipmentType) 
	{
		String requirement;
		
		if(lessonRequired == true)
			requirement = "Required";
		else
			requirement = "Not Required";
		
		return ("To Rent " + getEquipmentType + ", a training lesson is " + requirement + "! "
			 + "\n The Training Instructor assigned is: " + instructorNames[equipmentType]);
	}
}


