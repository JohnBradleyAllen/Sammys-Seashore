/*
 * @author John B. Allen 
 * 
 */

//Equipment class holds field about the equipment available for rental.
public abstract class Equipment 
{
	//Fields.
	private int equipmentType;
	private String equipment;
	protected double fee;
	protected final static String[] equipmentName = {"Personal Watercraft","Pontoon Boat","Rowboat","Canoe","Kayak","Beach Chair","Umbrella","Other"};
	public static final int HIGH = 0;
	protected final double[]surcharges = {50,40,15,12,10,2,1,0};
	protected abstract String equipmentName(int length);
	
	//Determines equipment.
	public Equipment(int equipmentType) 
	{
		if(equipmentType >= 0 && equipmentType < equipmentName.length)
		{
			equipment = equipmentName(equipmentType);
		}
		
		else
		{
			equipment = equipmentName(equipmentName.length);
		}
	}
	
	//Getter method to get the equipment name.
	public String[] getEquipmentName()
	{
		return equipmentName;
	}
	
	//Getter method to get charges.
	public double[] getCharges()
	{
		return surcharges;
	}	
	
	//Getter method to get equipment type.
	public int getEquipmentType() 
	{
		return equipmentType;
	}
	
	//Getter method to get equipment.
	public String getEquipment()
	{
		return equipment;
	}
	
	//Getter method to get fee.
	public double getFee()
	{
		return equipmentType;
	}
	
	//Method to get policy.
	public String lessonPolicy() 
	{	
		return null;
	}
	
	//Setter method to set equipment.
	public void setEquipment(String equipment)
	{
		this.equipment = equipment;
	}
	
	//Setter method to set fee.
	public void setFee(double fee)
	{
		this.fee = fee;
	}

	//Setter method to set equipment type.
	public void setEquipmentType(int equipmentType)
	{
		this.equipmentType = equipmentType;
	}
}
