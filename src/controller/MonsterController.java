package controller;

import model.MarshmallowMonster;
import javax.swing.JOptionPane;
public class MonsterController 
{
	//Data member section
	private MarshmallowMonster myMonster;
	
	//Constructor section
	public MonsterController()
	{
		
		//Job 1: initialize data members!
		myMonster = new MarshmallowMonster("biggie cheese", 1.5, 7, false, 3);
	}
	
	//methods section
	public void start()
	{
		JOptionPane.showMessageDialog(null, "Show message here  /nhere :)");
		//Use this method instead of "System.out.println("words");"
		
		System.out.println(myMonster);
		JOptionPane.showMessageDialog(null, myMonster);
		myMonster.setArmCount(25);
		//System.out.println("My monster has this many arms: " + myMonster.getArmCount());
		JOptionPane.showMessageDialog(null, "My monster has this many arms: " + myMonster.getArmCount());
		
		
		
		//Make a new monster and customize from user input!
		MarshmallowMonster userMonster = new MarshmallowMonster();
		String userMonsterName = JOptionPane.showInputDialog(null, "What is your monster's name?");
		String userNumber = JOptionPane.showInputDialog(null, "How many arms?");
		if (validInt(userNumber))
		{
			int arms = Integer.parseInt(userNumber);
			userMonster.setArmCount(arms);
		}
		
	}
	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Please type an integer value goofy head");
		}
		return isValid;
	}
	
	public boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(maybeDouble);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Please type a double value monky");
		}
		return isValid;
	}
}
