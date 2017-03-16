package task;

public abstract class Figure {

	public abstract double perimeter();
	
	protected abstract String getName();
	
	@Override
	public String toString()
	{
		return getName();
	}	
}
