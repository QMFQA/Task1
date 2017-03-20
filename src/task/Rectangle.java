package task;

public class Rectangle extends Figure {
	private double height; 
	private double width; 
	
	public Rectangle(double h, double w){
		height = h;
		width = w;
	}
	
	@Override
	public double perimeter() {
		return 2*(height+width);
	}

}
