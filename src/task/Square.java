package task;

public class Square extends Figure{
	
	private double side;

	public Square(double side) {
		super("Square");
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return side * 4;
	}

}
