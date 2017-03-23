package task;

class InvalidRectangleSizeValue extends Exception {
	InvalidRectangleSizeValue() {
		super("A value of the side length can not be negative");
	};
}

public class Rectangle extends Figure {
	private Double lenght, height;
	
	Rectangle( double l, double h ) throws InvalidRectangleSizeValue {
		if( l <= 0 || h <= 0 )
			throw new InvalidRectangleSizeValue();	
		lenght = l;
		height = h;
		setM_figName("Rectangle");
	}
	
	public double perimeter() {
		return( 2*lenght + 2*height);
	}
}
