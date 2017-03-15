package task;

import static java.lang.Math.*;

abstract class Figure {

	String getName() {
		return this.getClass().getSimpleName();
	}
	
	double dimention1;
		
	Figure(double a) {
		
		this.dimention1 = a;
	}
		
	public abstract double perimeter ();

	@Override
	public String toString() {
		return this.getName();
	}
		
	
}

class Circle extends Figure{
	
	Circle(double a) {
		
		super(a);
	}
	
	public double perimeter (){
		
		return 2*PI*dimention1;
	};
}

class Square extends Figure{
	
	Square(double a) {
		
		super(a);
	}
	
	public double perimeter (){
		
		return 4*dimention1;
	};
}

class Rectangle extends Square{
	
	double dimention2;
	
	Rectangle(double a, double b) {
		
		super(a);
		this.dimention2 = b;
	}
	
	public double perimeter (){
		
		return 2*(dimention1 + dimention2);
	};
}
