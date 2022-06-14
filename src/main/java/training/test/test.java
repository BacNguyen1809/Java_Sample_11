/*
	* @author bacng
	* @ Date Jun 14, 2022
*/
package training.test;

import training.entities.Circle;
import training.entities.Rectangle;
import training.entities.Triangle;

public class test {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		Circle cir = new Circle();
		Triangle tri = new Triangle();
		rec.input();
		cir.input();
		tri.input();
		rec.printResults();
		cir.printResults();
		tri.printResults();
	}

}
