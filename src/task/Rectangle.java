package task;

public class Rectangle extends Figure {

	public Rectangle(double i, double y) {
		this.i = i;
		this.y = y;		
	}
	public double perimeter()
    {
		per = 2*y+2*i;
		return per;
    }
	
}
