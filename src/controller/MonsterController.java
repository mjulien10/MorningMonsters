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
		System.out.println("My monster has this many arms: " + myMonster.getArmCount());
		JOptionPane.showMessageDialog(null, "My monster has this many arms: " + myMonster.getArmCount());
		
		JOptionPane.showInputDialog(null, "What is your monster's name?");
		
		//Make a new monster and customize from user input!
		MarshmallowMonster userMonster;
	}
}
