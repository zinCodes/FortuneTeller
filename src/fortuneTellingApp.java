import java.util.Scanner;

public class fortuneTellingApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		QuestionAsker ask = new QuestionAsker(input);
		System.out.println("Enter your first name");
		String firstName = input.nextLine();
		System.out.println("Enter your last name");
		String lastName = input.nextLine();
		System.out.println("Enter your age");
		boolean hasAge = false;
		int userAge = 0;
		while (hasAge == false) {
			try {
				userAge = input.nextInt();
				hasAge = true;
			}catch(Exception e) {
				input.nextLine();
				System.out.println("Sorry, please enter a valid number.");
			}
		}System.out.println("Please enter your birth month");
		
		boolean hasBirthMonth = false;
		int userBirthMonth = 0;
		do {
			try {
				userBirthMonth = input.nextInt();
//				if (userBirthMonth <=0 || userBirthMonth > 12) {
//					System.out.println()
//					//throw new RuntimeException("Birth month is out of range.");
//				} else {
				hasBirthMonth = true;
				System.out.println("Thank you for providing your birth month");
//				} 
			}catch (RuntimeException e1) {
					input.nextLine();
					System.out.println("Sorry, please enter a valid number.");
			}
		} while (hasBirthMonth == false);
	input.nextLine();
	System.out.println("Enter your favorite ROYGBIV color. If you do not know what ROYGBIV is, please enter \"Help\" to get a list of the ROYGBIV colors.");
	String favColor = "";
		try {
			favColor = input.nextLine();
			if (favColor.toLowerCase().equals("help")) {
				System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");
			}
		}catch (Exception e2) {
			input.nextInt();
			System.out.println("Please provide a ROYGBIV color or enter \"Help\" to learn more.");
		}
	
	
//  boolean hasFavColor = false;
//	String userFavColor;
//	do {
//		try {
//			if(userFavColor ==)
//		}
//	}
	System.out.println("How many siblings do you have?");
	int numUserSiblings = input.nextInt();
	
	int retirementAge = 0;
	if (userAge % 2 == 0) {
		retirementAge = 68;
		}else {
			retirementAge = 70;
		}
	
	String vacationHome; 
	if (numUserSiblings == 0) {
		vacationHome = "Honolulu, Hawaii";
	}else if (numUserSiblings == 1) {
		vacationHome = "San Diego, California";
	}else if (numUserSiblings == 2) {
		vacationHome = "Austin, Texas";
	}else if (numUserSiblings == 3) {
		vacationHome = "Flint, Michigan";
	}else if (numUserSiblings > 3) {
		vacationHome = "New Orleans, Louisiana";
	}else {
		vacationHome = "Columbus, Ohio";
	}
	
	String transportMode;
	if (favColor == "red") {
		transportMode = "Ferrari";
	}else if (favColor == "orange") {
		transportMode = "SUV";
	}else if (favColor == "yellow") {
		transportMode = "hatchback";
	}else if (favColor == "green") {
		transportMode = "bike";
	}else if (favColor == "blue") {
		transportMode = "minivan";
	}else if (favColor == "indigo") {
		transportMode = "sedan";
	}else {
		transportMode = "walking";
	}
	
	String userBalance;
	if (userBirthMonth > 0 && userBirthMonth < 5) {
		userBalance = "$450,000.25";
	}else if (userBirthMonth > 4 && userBirthMonth < 9) {
		userBalance = "$750,967.78";
	}else if (userBirthMonth > 8 && userBirthMonth < 13) {
		userBalance = "$673,974.41";
	}else {
		userBalance = "$0.00";
	}
	
  }
}
 



