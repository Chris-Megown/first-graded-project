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
		System.out.println("How many siblings do you have?");
		int siblingCount = input.nextInt();
		input.close();

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
			modeOfTransportation = " Golden Segway";
		} else if (favColor.toLowerCase().equals("orange")) {
			modeOfTransportation = "n Oscar Mayer Weinermobile";
		} else if (favColor.toLowerCase().equals("yellow")) {
			modeOfTransportation = " Jeep Wrangler";
		} else if (favColor.toLowerCase().equals("green")) {
			modeOfTransportation = " Tank";
		} else if (favColor.toLowerCase().equals("blue")) {
			modeOfTransportation = " Private Jet";
		} else if (favColor.toLowerCase().equals("indigo")) {
			modeOfTransportation = " Tamed Lion named Stu";
		} else if (favColor.toLowerCase().equals("violet")) {
			modeOfTransportation = " Jetpack";
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
		System.out.println(firstName + " " + lastName + " will retire in " + retirementYears + " years with $"
				+ endingBankBalance + ",\na vacation home in " + vacationLocation
				+ ", \nand will move about the earth via a" + modeOfTransportation + "!!");

	}

}
