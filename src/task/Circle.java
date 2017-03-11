package task;

public class Circle extends Figure {
	private double Radius;

	Circle( double R )
	{
		Radius = R;
	}
	
	public double perimeter()
	{
		return( 2 * Math.PI * Radius );
	}
	
}
