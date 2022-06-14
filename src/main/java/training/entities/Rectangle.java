/*
	* @author bacng
	* @ Date Jun 14, 2022
*/
package training.entities;

import java.util.Scanner;

public class Rectangle extends Shape {
	private double wight;
	private double length;

	
	public Rectangle() {
		super();
	}

	public Rectangle(double wight, double length, double area, double perimeter) {
		super();
		this.wight = wight;
		this.length = length;
	}
	

	public double getWight() {
		return wight;
	}

	public void setWight(double wight) {
		this.wight = wight;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	@Override
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input side wigth of Rectangle: ");
		wight = Double.parseDouble(scanner.nextLine());
		System.out.println("Please input side length of Rectangle: ");
		length = Double.parseDouble(scanner.nextLine());
		
	}


	@Override
	public double getPerimeter() {
		return (this.length+this.wight)*2;
		
	}

	@Override
	public void printResults() {
		
		System.out.println("------Rectangle-------");
		System.out.println("Width: "+ wight +"\n"+"Length: "+length
				+"\n"+"Area: "+getArea()+"\n"+"Perimeter: "+getPerimeter());
	}

	@Override
	public double getArea() {
		
		return length*wight;
	}
	
	

}
