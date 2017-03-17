package task;

public class Circle extends Figure {
	double radius;
	
	Circle (double r) {
		if (r>0) radius=r;
		else System.out.println("Building was not successful");
	}

	@Override
	double perimeter() {
		return (2*radius*Math.PI);
	}

}
