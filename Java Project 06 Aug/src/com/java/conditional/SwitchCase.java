package com.java.conditional;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int weekDays = 5;

		switch (weekDays) {
		case 1:
			System.out.println("SUNDAY");
			break;
		case 2:
			System.out.println("MONDAY");
			break;
		case 3:
			System.out.println("TUESDAY");
			break;
		case 4:
			System.out.println("WEDNESDAY");
			break;
		case 5:
			System.out.println("THRUSDAY");
			break;
		case 6:
			System.out.println("FRIDAY");
			break;
		case 7:
			System.out.println("SATURDAY");
			break;
		default:
			System.err.println("Not a week day");
		}
	}

}
