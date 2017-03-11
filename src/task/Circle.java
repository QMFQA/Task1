package task;

public class Circle extends Figure {
    
	
	
	public Circle(double i) {
		this.i = i;
		}
	
	public double perimeter()
    {
		per = 2*Math.PI*i;
		return per;
    }
	
}
