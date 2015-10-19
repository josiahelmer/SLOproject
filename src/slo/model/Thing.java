package slo.model;

public class Thing
{
	private String food;
	private int number;
	private double day;
	
	public Thing()
	{
		number= -99;
		day= -99;
		food = "";
	}
	
	public Thing(String food, int number, double day)
	{
		this.number= number;
		this.day= day;
		this.food= food;
	}
	public String getFood()
	{
		return food;
	}
	public int getNumber()
	{
		return number;
	}
	public double getDay()
	{
		return day;
	}
	
	public void setFood(String food)
	{
		this.food = food;
	}
	public void setNumber(int number)
	{
		this.number = number;
	}
	public void setDay(double day)
	{
		this.day = day;
	}
}

