/*
	* @author bacng
	* @ Date Jun 14, 2022
*/
package training.entities;

import java.util.Scanner;

public class Triangle extends Shape {
	private double sideA;
	private double sideB;
	private double sideC;
	
	

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	public Triangle() {
		super();
	}

	public Triangle(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	@Override
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input side A of Triangle: ");
		sideA = Double.parseDouble(scanner.nextLine());
		System.out.println("Please input side B of Triangle: ");
		sideB = Double.parseDouble(scanner.nextLine());
		System.out.println("Please input side C of Triangle: ");
		sideC = Double.parseDouble(scanner.nextLine());
		
	}

	@Override
	public double getPerimeter() {
		
		return (sideA+sideB+sideC);
	}

	@Override
	public double getArea() {
		
		return Math.sqrt(getPerimeter()*(getPerimeter()-sideA)*(getPerimeter()-sideB)*(getPerimeter()-sideC));
	}

	@Override
	public void printResults() {
		System.out.println("------Triangle-------");
		System.out.println("Side A: "+ sideA +"\n"+"Side B: "+sideB +"\n"+"Side C:"+sideC
				+"\n"+"Area: "+getArea()+"\n"+"Perimeter: "+getPerimeter());
		
	}

}
