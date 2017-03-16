package task;

abstract class Figure {
	
	String NAME;
	
	abstract double perimeter();
	String getName()
	{
		return NAME;
	}
	
	@Override
	public String toString()
	
	{
		return getName();
	}

}
