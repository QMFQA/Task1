package task;

public class Circle extends Figure {
	
	private double radius;
		
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double perimeter() {
		return 2 * Math.PI * this.radius;
	}

	@Override
	protected String getName() {
		return "Circle";
	}
}
