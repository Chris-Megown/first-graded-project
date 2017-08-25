import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		// Main variables
		Scanner input = new Scanner(System.in);
		System.out.println("I would like to reveal your fortune,\nbut first I am going to need some information.");
		System.out.println("What is your first name?");
		String firstName = input.next();
		System.out.println("What is your last name?");
		String lastName = input.next();
		System.out.println("How old are you? (In years plz)");
		int ageOfPerson = input.nextInt();
		System.out.println("What month were you born in? (1-12)");
		int monthBorn = input.nextInt();
		System.out.println("What is your favorite ROYGBIV color? (not sure what ROYGBIV means...type HELP)");
		String favColor = input.next();
// hola
		while (favColor.equalsIgnoreCase("help")) {
			System.out.println(" The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");
			System.out.println("What is your favorite ROYGBIV color? (not sure what ROYGBIV means...type HELP)");
			favColor = input.next();
		}
		System.out.println("How many siblings do you have?");
		int siblingCount = input.nextInt();
		input.close();
		String firstNameLower = firstName.toLowerCase();
		String capitalFirstName = firstNameLower.substring(0, 1).toUpperCase()
				+ firstNameLower.substring(1, firstNameLower.length());
		String lastNameLower = lastName.toLowerCase();
		String capitalLastName = lastNameLower.substring(0, 1).toUpperCase()
				+ lastNameLower.substring(1, lastNameLower.length());

		// Retirement years
		int retirementYears;

		if (ageOfPerson % 2 == 0) {
			retirementYears = 20;
		} else {
			retirementYears = 35;
		}

		// Vacation Location
		String vacationLocation = null;

		if (siblingCount == 0) {
			vacationLocation = "Washington, DC";
		} else if (siblingCount == 1) {
			vacationLocation = "Fremont, California";
		} else if (siblingCount == 2) {
			vacationLocation = "Denver, Colorado";
		} else if (siblingCount == 3) {
			vacationLocation = "Nashville, Tennessee";
		} else if (siblingCount > 3) {
			vacationLocation = "Salt Lake City, Utah";
		} else if (siblingCount < 0) {
			vacationLocation = "Downtown Detroit...in a box";
		}

		// Mode of Transportation
		String modeOfTransportation = null;
		if (favColor.toLowerCase().equals("red")) {
			modeOfTransportation = " riding a golden segway";
		} else if (favColor.toLowerCase().equals("orange")) {
			modeOfTransportation = "driving an Oscar Mayer Weinermobile";
		} else if (favColor.toLowerCase().equals("yellow")) {
			modeOfTransportation = " driving a jeep wrangler";
		} else if (favColor.toLowerCase().equals("green")) {
			modeOfTransportation = " driving a tank";
		} else if (favColor.toLowerCase().equals("blue")) {
			modeOfTransportation = " flying a private jet";
		} else if (favColor.toLowerCase().equals("indigo")) {
			modeOfTransportation = " riding a tamed lion named Stu";
		} else if (favColor.toLowerCase().equals("violet")) {
			modeOfTransportation = " flying a Jetpack";
		}

		// Bank Balance

		double endingBankBalance = 0;
		if (monthBorn > 0 && monthBorn <= 4) {
			endingBankBalance = 125000;
		} else if (monthBorn >= 5 && monthBorn <= 8) {
			endingBankBalance = 225000;
		} else if (monthBorn >= 9 && monthBorn <= 12) {
			endingBankBalance = 5000000;
		} else {
			endingBankBalance = .25;
		}

		// The end result
		System.out.println(capitalFirstName + " " + capitalLastName + " will retire in " + retirementYears
				+ " years with $" + endingBankBalance + " in the bank,\na vacation home in " + vacationLocation
				+ ", \nand will travel by" + modeOfTransportation + "!!");

	}

}
