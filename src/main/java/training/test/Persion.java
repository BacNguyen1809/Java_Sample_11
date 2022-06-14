/*
	* @author bacng
	* @ Date Jun 14, 2022
*/
package training.test;

import java.util.Scanner;

class wallet {
	double moneyInWallet;
//	public void input(double value) {
//		moneyInWallet = value;
//	}
	
	
}

public class Persion {
	public static void main(String[] args) {
		Persion per = new Persion();
		System.out.println("Input number of bill: ");
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		double[] bill = new double[n];
		for (int i = 0;i  < bill.length;i ++) {
			System.out.println("input value of bill "+(i+1));
			bill[i] = Double.parseDouble(scanner.nextLine());
		}
		//input value of walet
		wallet wallet = new wallet();
		System.out.println("input values of wallet");
		wallet.moneyInWallet = Double.parseDouble(scanner.nextLine());
		double toltal = per.calTotal(bill);
		
		System.out.println("this total of bill: "+toltal);
		if(!(per.payMoney(toltal, wallet.moneyInWallet))) {
			System.out.println("you can't buy it");
		}else {
			System.out.println("u can buy it");
		}
				
		
	}
	public  double calTotal(double[] bill) {
		double sum =0;
		for (int i = 0; i < bill.length; i++) {
			sum = sum + bill[i];
		}
		return sum;
	}
	public boolean payMoney(double total, double moneyInWallet) {
		if(total > moneyInWallet) {
			return false;
		}else {
			return true;
		}
		
	}
	
	
	



}
