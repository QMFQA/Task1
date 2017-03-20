package task;

public class Circle extends Figure {

	private double radius; 
	
	public Circle(double r){
		this.radius = r;
	}
	
	@Override
	public double perimeter() {
		return 2*Math.PI*radius;
	}

}
