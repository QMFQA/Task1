package task.classes;

public class Rectangle extends Figure
{
	protected double length, width;
	public Rectangle (double length, double width)
	{
		if(length<=0 || width<=0)
		{
			throw new IllegalArgumentException("Sides must be greater than 0");
		}
		this.length = length;
		this.width = width;
	}
	
	public double perimeter() 
	{
		return 2*(length+width);
	}
	
}
