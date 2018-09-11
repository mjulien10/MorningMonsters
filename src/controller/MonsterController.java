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
		myMonster = new MarshmallowMonster();
	}
	
	//methods section
	public void start()
	{
		System.out.println(myMonster);
	}
}
