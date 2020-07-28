package CalculatorInterface;

import java.util.Scanner;

interface myCalculator{
	public int add(int i, int j);
	public int subtract(int i, int j);
	public int multiply(int i, int j);
	public int divide(int i, int j);
	public void show(int r);
}
public class Calculator implements myCalculator{
	public int add(int i,int j) {
		return i+j;
	}
	public int subtract(int i, int j) {
		return i-j;
	}
	public int multiply(int i, int j) {
		return i*j;
	}
	public int divide(int i, int j) {
		return i/j;
	}
	public void show(int r) {
		System.out.println("Your Result is "+r);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Calculator c=new Calculator();
		int result = 0;
		String test;
		do {
			System.out.print("Please Enter First Number : ");
			int num1=sc.nextInt();
			System.out.print("Please Enter Second Number : ");
			int num2=sc.nextInt();
			System.out.print("Please Enter a Operator : ");
			String op=sc.next();
			switch(op) {
			case("+"): result=c.add(num1, num2);
			break;
			case("-"): result=c.subtract(num1, num2);
			break;
			case("*"): result=c.multiply(num1, num2);
			break;
			case("/"): result=c.divide(num1, num2);
			break;
			default:System.out.println("Invalid Operator!");
			}
			c.show(result);
			System.out.print("Do you want to next operation(yes or no):");
			test=sc.next();
		}while(test.equals("yes"));
	}

}
