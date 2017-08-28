import java.util.Scanner;
import java.text.NumberFormat;

public class FortuneTeller {

	public static void main(String[] args) {
		// Input variables
		Scanner input = new Scanner(System.in);
		System.out.println("I would like to reveal your fortune,\nbut first I am going to need some information.");
		System.out.println(
				"If you don't believe in fortunes,\nor do not wish to be a part of the fun,\nat any point simply type \"Quit\".");
		System.out.println("What is your first name?");
		String firstName = input.next();
		if (firstName.toLowerCase().equals("quit")) {
			System.out.println("Nobody Like a quitter...");
			System.exit(0);
		}
		System.out.println("What is your last name?");
		String lastName = input.next();
		if (lastName.toLowerCase().equals("quit")) {
			System.out.println("Nobody Like a quitter...");
			System.exit(0);
		}
		System.out.println("How old are you? (In years plz)");
		String ageOfPerson = input.next();
		if (ageOfPerson.toLowerCase().equals("quit")) {
			System.out.println("Nobody Like a quitter...");
			System.exit(0);
		}
		int ageOfPersonConverted = Integer.parseInt(ageOfPerson);
		System.out.println("What month were you born in? (1-12)");
		String monthBorn = input.next();
		if (monthBorn.toLowerCase().equals("quit")) {
			System.out.println("Nobody Like a quitter...");
			System.exit(0);
		}
		int monthBornConverted = Integer.parseInt(monthBorn);
		System.out.println("What is your favorite ROYGBIV color? (not sure what ROYGBIV means...type HELP)");
		String favColor = input.next();

		while (favColor.equalsIgnoreCase("help")) {
			System.out.println("The ROYGBIV colors are Red, Orange, Yellow, Green, Blue, Indigo, Violet.");
			System.out.println("What is your favorite ROYGBIV color? (not sure what ROYGBIV means...type HELP)");
			favColor = input.next();
		}
		if (favColor.toLowerCase().equals("quit")) {
			System.out.println("Nobody Like a quitter...");
			System.exit(0);
		}
		System.out.println("How many siblings do you have?");
		String siblingCount = input.next();
		if (firstName.toLowerCase().equals("quit")) {
			System.out.println("Nobody Like a quitter...");
			System.exit(0);
		}
		int siblingCountConverted = Integer.parseInt(siblingCount);

		input.close();
		String firstNameLower = firstName.toLowerCase();
		String capitalFirstName = firstNameLower.substring(0, 1).toUpperCase()
				+ firstNameLower.substring(1, firstNameLower.length());
		String lastNameLower = lastName.toLowerCase();
		String capitalLastName = lastNameLower.substring(0, 1).toUpperCase()
				+ lastNameLower.substring(1, lastNameLower.length());

		// Retirement years
		int retirementYears;

		if (ageOfPersonConverted % 2 == 0) {
			retirementYears = 20;
		} else {
			retirementYears = 35;
		}

		// Vacation Location
		String vacationLocation = null;

		if (siblingCountConverted == 0) {
			vacationLocation = "Washington, DC";
		} else if (siblingCountConverted == 1) {
			vacationLocation = "Fremont, California";
		} else if (siblingCountConverted == 2) {
			vacationLocation = "Denver, Colorado";
		} else if (siblingCountConverted == 3) {
			vacationLocation = "Nashville, Tennessee";
		} else if (siblingCountConverted > 3) {
			vacationLocation = "Salt Lake City, Utah";
		} else if (siblingCountConverted < 0) {
			vacationLocation = "Downtown Detroit...in a box";
		}

		// Mode of Transportation
		String modeOfTransportation = null;
		if (favColor.toLowerCase().equals("red")) {
			modeOfTransportation = " riding a golden segway";
		} else if (favColor.toLowerCase().equals("orange")) {
			modeOfTransportation = " driving an Oscar Mayer Weinermobile";
		} else if (favColor.toLowerCase().equals("yellow")) {
			modeOfTransportation = " driving a Jeep Wrangler";
		} else if (favColor.toLowerCase().equals("green")) {
			modeOfTransportation = " driving a tank";
		} else if (favColor.toLowerCase().equals("blue")) {
			modeOfTransportation = " flying a private jet";
		} else if (favColor.toLowerCase().equals("indigo")) {
			modeOfTransportation = " riding a tamed lion named Stu";
		} else if (favColor.toLowerCase().equals("violet")) {
			modeOfTransportation = " flying a jetpack";
		}

		// Bank Balance

		double endingBankBalance = 0;
		NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
		if (monthBornConverted > 0 && monthBornConverted <= 4) {
			endingBankBalance = 125000;
		} else if (monthBornConverted >= 5 && monthBornConverted <= 8) {
			endingBankBalance = 225000;
		} else if (monthBornConverted >= 9 && monthBornConverted <= 12) {
			endingBankBalance = 5000000;
		} else {
			endingBankBalance = 0.00;
		}

		// The end result
		System.out.println(capitalFirstName + " " + capitalLastName + " will retire in " + retirementYears
				+ " years with " + moneyFormatter.format(endingBankBalance) + " in the bank,\na vacation home in "
				+ vacationLocation + ", \nand will travel by" + modeOfTransportation + "!!");

	}

}
