package standard;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double area, perimeter, width, height;
		System.out.println("Enter the measures of width and height: ");
		System.out.print("Width: ");
		width = sc.nextDouble();
		System.out.print("Height: ");
		height = sc.nextDouble();
		
		area = width * height;
		perimeter = 2 * (width + height);
		
		System.out.println("The area is: " + area);
		System.out.println("The perimeter is: " + perimeter);
		
		sc.close();
	}
}
