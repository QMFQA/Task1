package task;

public class Rectangle extends Figure {
	private Double lenght, height;
	
	Rectangle( double l, double h )
	{
		lenght = l;
		height = h;
	}
	
	public double perimeter()
	{
		return( 2*lenght + 2*height);
	}
}
