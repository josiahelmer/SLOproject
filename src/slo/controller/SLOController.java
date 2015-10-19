package slo.controller;

import slo.model.Thing;
import slo.view.SLODisplay;

public class SLOController
{
	private Thing myThing;
	private SLODisplay mySlo;
	
	public SLOController()
	{
		mySlo = new SLODisplay();
	}
	
	public void start()
	{
		String food = mySlo.getAnswer("What is your favorite food?");
		
		mySlo.displayResponse("Your favorite food is " + food);
		
		int number;
		String tempNumber = mySlo.getAnswer("How many times do you think you have had it?");
		
		while(!isInteger(tempNumber))
		{
			tempNumber = mySlo.getAnswer("Thats impossible");
		}
		number= Integer.parseInt(tempNumber);
		if(number > 200)
		{
			tempNumber = mySlo.getAnswer("Thats alot");
		}
		
	mySlo.displayResponse("you typed in " + number);
	}

	double day;
	{
	String tempday = mySlo.getAnswer("How many days since you had it?");
	
	while(!isDouble(tempday))
	{
		tempday = mySlo.getAnswer("Thats impossible");
		
		day = Double.parseDouble(tempday);
	}
	if(day > 200)
	{
		tempday = mySlo.getAnswer("Thats a long time");
		
		day = Double.parseDouble(tempday);
	}
	}
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int validInteger = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			mySlo.displayResponse("Thats impossible");
		}
	
		return isInt;
	}
	
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double validDouble = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			mySlo.displayResponse ("Thats impossible");
		}
		return isDouble;
	}}
