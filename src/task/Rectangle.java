package task;

public class Rectangle extends Figure {
	
	private double width;
	private double lengh;
	
	public Rectangle(double width, double lengh) {
		this.width = width;
		this.lengh = lengh;
	}

	@Override
	public double perimeter() {
		return (this.lengh + this.width) * 2.0;
	}
	

}
