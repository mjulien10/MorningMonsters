package controller;

import model.MarshmallowMonster;

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
		System.out.println(myMonster);
		myMonster.setArmCount(25);
		System.out.println("My monster has this many arms: " + myMonster.getArmCount());
		
		//Make a new monster and customize from user input!
		MarshmallowMonster userMonster;
	}
}
