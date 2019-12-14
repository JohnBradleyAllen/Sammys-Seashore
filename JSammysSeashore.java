/*
 * @author John B. Allen
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JSammysSeashore extends JFrame implements ItemListener, ActionListener
{
	//Main holds data for the GUI to display.
	public static void main(String[] args)
	   {
	        JSammysSeashore frame = new JSammysSeashore();
	        frame.setSize(1000, 200);
	        frame.setVisible(true);
	   }
	//Check boxes for user to select
	FlowLayout flow = new FlowLayout();
	JTextField hoursField = new JTextField(9);
	Font font = new Font("Times New Roman",Font.BOLD, 22);
	JLabel total = new JLabel("Total Equipment");
	JLabel label = new JLabel("Lesson Required?");
	JLabel totalPrice = new JLabel();
	JLabel hoursRented = new JLabel("Rental Hours: ");
	JCheckBox personalWatercraft = new JCheckBox("Personal Watercraft", false);
	JCheckBox pontoonBoat = new JCheckBox("Pontoon Boat", false);
	JCheckBox rowBoat = new JCheckBox("Rowboat", false);
	JCheckBox canoe = new JCheckBox("Canoe", false);
	JCheckBox kayak = new JCheckBox("Kayak", false);
	JCheckBox beachChair = new JCheckBox("Beach Chair", false);
	JCheckBox umbrella = new JCheckBox("Umbrella", false);
	JCheckBox lesson = new JCheckBox("Lesson", false);
	JCheckBox noLesson = new JCheckBox("No Lesson Rental", true);

	//Displays prices
	int housePrice = 0;
	int lessonPrice = 0;
	int equipPrice = 0;
	int price = 0;
	int hours;
   
	String output = "";
	String equipment = "";
	String time = "";

	//GUI info
	public JSammysSeashore()
	{
		super("Sammy's Equipment - Makin' It Fun In The Sun");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(flow);
      
		ButtonGroup equipmentGroup = new ButtonGroup();
      		equipmentGroup.add(personalWatercraft);
      		equipmentGroup.add(pontoonBoat);
      		equipmentGroup.add(rowBoat);
      		equipmentGroup.add(canoe);
      		equipmentGroup.add(kayak);
      		equipmentGroup.add(beachChair);
      		equipmentGroup.add(umbrella);
      	ButtonGroup lessonGroup = new ButtonGroup();
      		lessonGroup.add(lesson);
      		lessonGroup.add(noLesson);
      		add(hours);
      		add(hoursField);
      		add(label);
      		add(personalWatercraft);
      		add(pontoonBoat);
		    add(rowBoat);
		    add(canoe);
		    add(kayak);
		    add(beachChair);
		    add(umbrella);
		    add(label);
		    add(lesson);
		    add(noLesson);
		    add(totalPrice);
		    totalPrice.setText("$0");
		    hoursField.addActionListener(this);
		    personalWatercraft.addItemListener(this);
		    pontoonBoat.addItemListener(this);
	      	rowBoat.addItemListener(this);
	      	kayak.addItemListener(this);
	      	canoe.addItemListener(this);
	      	beachChair.addItemListener(this);
	      	umbrella.addItemListener(this);
	      	lesson.addItemListener(this);
	      	noLesson.addItemListener(this);
	}

	//Automatically placed by Eclipse.
	private void add(int hours) 
	{
	
	}

	//Computes prices based on user input.
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		if(source == hoursField)
		{

		try
        {
           hours = Integer.parseInt(hoursField.getText());
        }

        catch(Exception exc12)
        {
           hours = 0;
           hoursField.setText("invalid!");
        }

        housePrice = hours * equipPrice;
        price = housePrice + lessonPrice;
        time = "For " + hours + "Hours ";
        output = "$" + price;
        totalPrice.setText(output);
        output = "Rental Details: " + equipment + time + lesson;
		}
   }

	//Gives prices depending on a lesson is involved.
	public void itemStateChanged(ItemEvent check)
	{
		Object source = getState();
		int select = getState();
		final int HIGH_PRICE = 40;
		final int MED_PRICE = 20;
		final int LOW_PRICE = 7;
		final int LESSON_PRICE = 5;
		if(select == ItemEvent.SELECTED)
		{
		
		if(source == personalWatercraft)
        {
        equipment = "Personal Watercraft for $" + HIGH_PRICE + " Per Hour. " ;
        equipPrice = HIGH_PRICE;
        }
        
        else
        if(source == pontoonBoat)
        {
       	 	equipment = "Pontoon Boat For $" + HIGH_PRICE + " Per Hour. " ;
       	 	equipPrice = HIGH_PRICE;
        }
       
        else
        if(source == rowBoat)               
        {
        	equipment = "Row Boat For $" + MED_PRICE + " Per Hour. " ;
        	equipPrice = MED_PRICE;
        }
        
        else
        if(source == canoe)
        {
        	equipment = "Row Boat for $" + MED_PRICE + " Per Hour. " ;
        	equipPrice = MED_PRICE;
        }
        
        else
        if(source == kayak)
        {
        	equipment = "Kayak for $" + MED_PRICE + " Per Hour. " ;
        	equipPrice = MED_PRICE;
        }

        else
        if(source == beachChair)
        {
        	equipment = "Beach Chair For $" + LOW_PRICE + " Per Hour. " ;
        	equipPrice = LOW_PRICE;
        }

        else
        if(source == umbrella)
        {
        	equipment = "Umbrella For $" + LOW_PRICE + " Per Hour. " ;
        	equipPrice = LOW_PRICE;
        }
            housePrice = hours * equipPrice;
            price = housePrice + lessonPrice;
            output = "$" + price;
            totalPrice.setText(output);
            output = "Rental Dettails : " + equipment + time + lesson;
        }
     }
}
