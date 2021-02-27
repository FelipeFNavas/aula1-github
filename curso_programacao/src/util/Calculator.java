package util;

public class Calculator {
	public static final double PI = 3.14159; // o final define o pi como constante
	
	public static double circumference(double radius) {
		return 2 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4 * PI * radius * radius * radius / 3;
	}
}
