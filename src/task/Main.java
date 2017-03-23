package task;

public class Main {
	
	public static void main(String[] args)
		{
			Figure[] figures = new Figure[3];
			try {
					figures[0] = new Circle(10);
					figures[1] = new Rectangle(12.5, 10);
					figures[2] = new Square(15.75);
				}
			catch (InvalidRadiusValue | InvalidRectangleSizeValue e) {
					System.out.println(e.toString());
					return;
				}
			
			for (Figure figure : figures)
				System.out.println(figure + " perimeter is " + figure.perimeter());
		}
}
