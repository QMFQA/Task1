package task;

public class SquareOld extends Figure {
	
	private double side;

	public SquareOld(double side) {
		this.side = side;
	}

	@Override
	public double perimeter() {
		return side * 4;
	}

}
