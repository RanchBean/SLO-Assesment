package slo.model;

public class SLOThing
{

	private String name;
	private int age;
	private double weight;

	public SLOThing()
	{
		age = -1;
		weight = -.23;
		name = "";
	}
	
	public SLOThing(String name, int age, double weight)
	
	{
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public double getWeight()
	{
		return weight;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	public String toString()
	{
		String thingInfo =  ("name" + name + "age" + age + "weight" + weight);
		return thingInfo;
	}
	
	
}
