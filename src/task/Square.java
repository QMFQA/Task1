package task;

public class Square extends Figure {
	
	private double side;

	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public double perimeter() {
		return side * 4;
	}

}
