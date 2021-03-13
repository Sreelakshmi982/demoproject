package com.iqsmart;

public class Seasonsswitch {
	public static void main(String[] args) {

		String monthName = "APRIL";
		monthName= monthName.toLowerCase();
		System.out.println(monthName);
		switch (monthName) {
		case "may", "june", "august":
			System.out.println("Season is summer");
			break;
		case "december", "january", "february":
			System.out.println("Season is Winter");
			break;
		case "march", "april":
			System.out.println("Season is spring");
			break;
			default:
			System.out.println("give month name ");

		}

	}
}
