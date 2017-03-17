package task;

abstract class Figure {
	
	protected String name;
	
	public abstract double perimeter();
	public String getName()
	{
		return name;
	}
	
	@Override
	public String toString()
	
	{
		return getName();
	}

}
