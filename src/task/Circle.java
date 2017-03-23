package task;

class InvalidRadiusValue extends Exception {
	InvalidRadiusValue() {
		super("A value of the circle radius can not be negative");
	};
}

public class Circle extends Figure {
	private double Radius;

	Circle( double R ) throws InvalidRadiusValue {
		if( R <= 0 ) 
			throw new InvalidRadiusValue();	
			
		this.Radius = R;
		setM_figName("Circle");
	}
	
	public double perimeter() {
		return( 2 * Math.PI * Radius );
	}
	
}
