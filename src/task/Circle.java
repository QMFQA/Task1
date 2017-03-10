package task;

public class Circle extends Figure {

	private double radius; 
	
	public Circle(double r){
		this.radius = r;
	}
	
	@Override
	public double perimeter() {
		double circle_perimetr = 2*Math.PI*radius;
		return circle_perimetr;
	}

}
