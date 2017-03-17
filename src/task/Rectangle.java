package task;


public class Rectangle extends Figure {

	private double side1;
	private double side2;
	
	Rectangle(double side1, double side2) {
		
		this.side1 = side1;
		this.side2 = side2;
		name = "Rectangle";
		
	}

	@Override
	public double perimeter() {
			
		return 2*(side1+side2);
	}

}
