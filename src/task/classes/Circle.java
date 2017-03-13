package task.classes; 

public class Circle extends Figure 
{
	private double radius;
	public Circle (double radius)
	{
		if (radius<=0)
		{
			throw new IllegalArgumentException("Radius must be greater than 0");
		}
		this.radius = radius;
	}
	public double perimeter ()
	{
		return 2*Math.PI*radius;
	}

}
