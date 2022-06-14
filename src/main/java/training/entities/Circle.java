/*
	* @author bacng
	* @ Date Jun 14, 2022
*/
package training.entities;

import java.util.Scanner;

public class Circle extends Shape {
	
	private double radius;
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	@Override
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input side radius of Circle: ");
		radius = Double.parseDouble(scanner.nextLine());

		
	}

	@Override
	public double getPerimeter() {
		
		return 2*Math.PI*radius;
	}

	@Override
	public double getArea() {
		
		return Math.PI*radius*radius;
	}

	@Override
	public void printResults() {
		System.out.println("------Circle-------");
		System.out.println("Radius: "+ radius +"\n"+"Area: "+getArea()+"\n"
							+"Perimeter: "+getPerimeter());
		
	}

}
