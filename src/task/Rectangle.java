package task;


public class Rectangle extends Figure {

	private double side1;
	private int side2;
	Rectangle(double side1, int side2) {
		
		this.side1 = side1;
		this.side2 = side2;
		
	}

	@Override
	double perimeter() {
			
		return 2*(side1+side2);
	}

}
