package ppj.welcome;

public class Main {

	public static void main(String[] args) {
/*		Circle circle = new Circle(1);
		double area = circle.area();
		System.out.println("Powierzchnia: " + area);
	}
	
	Circle circle1 = new Circle(4);
	Circle circle2 = new Circle(8);
	double area1 = circle1.area();
	double area2 = circle2.area();
	{

		
		System.out.println(
				"Powierzchnia (promien=4) = " + area1);
				System.out.println(
				"Powierzchnia (promien=8) = " + area2);
		
		
		
		Circle circle = new Circle(1);
		circle.setRadius(5);
		System.out.println("Powierzchnia (promien=" + circle.getRadius() + ") = " + circle.area());*/

		
		Circle circle = new Circle(3);
		circle.setRadius(14);
		Circle circle1 = new Circle(6);
		circle1.setRadius(12);
		
		System.out.println(circle.compare(circle1.getRadius()));
		
		System.out.println(MyMath.silnia(5));
	}

}