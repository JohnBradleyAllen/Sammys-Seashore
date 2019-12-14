/*
 * @author John B. Allen 
 * 
 */

//Class to hold details about equipment that require a lesson.
public abstract class EquipmentWithoutLesson extends Equipment
{
	//Determines if a piece of equipment needs a lesson.
	public EquipmentWithoutLesson(int equipmentType) 
	{
		super(equipmentType);
		System.out.println("The Rented Equipment Is A " 
							+ (equipmentType + 1) 
							+ " , " + equipmentName[equipmentType]);
		System.out.println(lessonPolicy());
	}
	
	//Message to display if no lesson is required.
	public String lessonPolicy()
	{
		return "This Piece Of Equipment Does Not Require A Lesson! ";
	}
}
