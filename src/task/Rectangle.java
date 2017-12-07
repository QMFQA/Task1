package task;

public class Rectangle extends Figure {
	
	private double width;
	private double lengh;
	
	public Rectangle(double width, double lengh) {
		super("Rectangle");
		this.width = width;
		this.lengh = lengh;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLengh() {
		return lengh;
	}

	public void setLengh(double lengh) {
		this.lengh = lengh;
	}

	@Override
	public double perimeter() {
		return (this.lengh + this.width) * 2.0;
	}
	

}
