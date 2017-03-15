package task;

public class Rectangle extends Figure {
	
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double perimeter() {		
		return 2 * (width + height);
	}

	@Override
	protected String getName() {		
		return "Rectangle";
	}
}
