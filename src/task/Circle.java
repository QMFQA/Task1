package task;

public class Circle extends Figure {
	
	private double radius;

	public Circle(double radius) {
		super();		
		this.radius = radius;
	}

	@Override
	public double perimeter() {		
		return this.radius * 2.0 * Math.PI;
	}	

}
