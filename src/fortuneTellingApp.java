
/*This Fortune Teller program will prompt the user for their first name, last name, age, birth month, 
 * favorite ROYGBIV color, and number of siblings. Then the user is provided with a statement of their
 *  fortune consisting of their retirement age, bank balance, the location of their vacation home, and 
 *  mode of transportation.  If at any point, the user would like to quit the program, they can do so 
 *  by typing in "quit".
 */
import java.util.Scanner;

public class fortuneTellingApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		QuestionAsker ask = new QuestionAsker(input);

		/* The user is prompted to provide their first name. */

		System.out.println("Enter your first name");
		String firstName = input.nextLine();
		if (firstName.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		/* The user is prompted to provide their last name. */

		System.out.println("Enter your last name");
		String lastName = input.nextLine();
		if (lastName.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}

		/* The user is asked to enter their age. */
		System.out.println("Enter your age");
		boolean hasAge = false;
		int userAge = 0;

		while (hasAge == false) {
			try {
				userAge = input.nextInt();
				hasAge = true;
			} catch (Exception e) {
				String strAge = input.nextLine();
				// if (Integer.parseInt(strAge)) {
				if (strAge.equalsIgnoreCase("quit")) {
					System.out.println("Nobody likes a quitter...");
					System.exit(0);

				} else {
					System.out.println("Sorry, please enter a valid number.");
				}
			}
		}

		/* The user should enter a valid numerical value for their birth month. */

		System.out.println("Please enter your birth month");
		boolean hasBirthMonth = false;
		int userBirthMonth = 0;

		do {
			try {
				userBirthMonth = input.nextInt();
				hasBirthMonth = true;
				break;
				// System.out.println("Thank you for providing your birth month");
				// }
			} catch (RuntimeException e1) {
				String strBirthMonth = input.nextLine();
				if (strBirthMonth.equalsIgnoreCase("quit")) {
					System.out.println("Nobody likes a quitter...");
					System.exit(0);
				} else {
					System.out.println("Sorry, please enter a valid number.");
				}
			}
		} while (hasBirthMonth == false);

		input.nextLine();

		/*
		 * The user is asked to enter their favorite ROYGBIV color. If the user is not
		 * aware of ROYGBIV colors, they should refer to "Help".
		 */

		System.out.println("Enter your favorite ROYGBIV color. If you do not know what ROYGBIV is, please enter"
				+ " \"Help\" to get a list of the ROYGBIV colors.");
		boolean hasFavColor = false;
		String favColor = "";

		while (hasFavColor == false) {
			favColor = input.nextLine();
			try {
				int favcol = Integer.parseInt(favColor);
				// hasFavColor = true;
				System.out.println("This does not make sense. Please enter a ROYGBIV color or enter \"Help\".");
				continue;
			} catch (Exception e2) {
				// hasFavColor = true;
				if (favColor.toLowerCase().equals("help")) {
					System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");
					continue;
				} else if (favColor.equalsIgnoreCase("quit")) {
					System.out.println("Nobody likes a quitter...");
					System.exit(0);
				} else {
					hasFavColor = true;
				}
			}
		}

		/* The user is asked how many siblings they have */

		System.out.println("How many siblings do you have?");
		String strUserSiblings = "";
		int numUserSiblings = 0;
		boolean hasSiblings = false;

		while (hasSiblings == false) {
			strUserSiblings = input.nextLine();
			try {
				numUserSiblings = Integer.parseInt(strUserSiblings);
				hasSiblings = true;
			} catch (NumberFormatException ex) {
				// System.out.println("Please check and type in again.");
				if (strUserSiblings.equalsIgnoreCase("quit")) {
					System.out.println("Nobody likes a quitter...");
					System.exit(0);
				}
				System.out.println("Please check and type in again.");
				continue;
			}
		}

		int retirementAge = 0;
		if (userAge % 2 == 0) {
			retirementAge = 68;
		} else {
			retirementAge = 70;
		}

		String vacationHome;
		if (numUserSiblings == 0) {
			vacationHome = "Honolulu, Hawaii";
		} else if (numUserSiblings == 1) {
			vacationHome = "San Diego, California";
		} else if (numUserSiblings == 2) {
			vacationHome = "Austin, Texas";
		} else if (numUserSiblings == 3) {
			vacationHome = "Flint, Michigan";
		} else if (numUserSiblings > 3) {
			vacationHome = "New Orleans, Louisiana";
		} else {
			vacationHome = "Columbus, Ohio";
		}

		String transportMode = "";
		if (favColor.equalsIgnoreCase("red")) {
			transportMode = "Ferrari";
		} else if (favColor.equalsIgnoreCase("orange")) {
			transportMode = "SUV";
		} else if (favColor.equalsIgnoreCase("yellow")) {
			transportMode = "hatchback";
		} else if (favColor.equalsIgnoreCase("green")) {
			transportMode = "bike";
		} else if (favColor.equalsIgnoreCase("blue")) {
			transportMode = "minivan";
		} else if (favColor.equalsIgnoreCase("indigo")) {
			transportMode = "sedan";
		} else {
			transportMode = "walking";
		}

		String userBalance;
		if (userBirthMonth > 0 && userBirthMonth < 5) {
			userBalance = "$450,000.25";
		} else if (userBirthMonth > 4 && userBirthMonth < 9) {
			userBalance = "$750,967.78";
		} else if (userBirthMonth > 8 && userBirthMonth < 13) {
			userBalance = "$673,974.41";
		} else {
			userBalance = "$0.00";

		}
		System.out.println(firstName.toUpperCase().substring(0, 1) + firstName.substring(1) + " "
				+ lastName.toUpperCase().substring(0, 1) + lastName.substring(1) + " will retire in " + retirementAge
				+ " years with " + userBalance + " in the bank, a vacation home in " + vacationHome + ", and travel by "
				+ transportMode + ".");
	}
}
