package model;

public class MarshmallowMonster 
{
	//Data member section
	//They are ALWAYS private
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	public MarshmallowMonster() 
	{
		//Default values are 0 or null BORING :(
	}
	
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNoses, int armCount)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNoses;
		this.armCount = armCount;
	}
	
	public String toString()
	{
		String description = " ";
		
		return description;
	}
}
