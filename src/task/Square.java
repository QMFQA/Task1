package task;

public class Square extends Figure {

	private double side;
	Square(double side) {
		this.side = side;
	}

	@Override
	double perimeter() {
		
		return 4*side;
	}

}
