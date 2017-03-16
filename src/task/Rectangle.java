package task;


public class Rectangle extends Figure {

	double side1;
	double side2;
	
	Rectangle(double side1, double side2) {
		
		this.side1 = side1;
		this.side2 = side2;
		super.NAME = "Rectangle";
		
	}

	@Override
	double perimeter() {
			
		return 2*(side1+side2);
	}

}
