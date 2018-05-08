import java.util.Scanner;

public class fortuneTellingApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		QuestionAsker ask = new QuestionAsker(input);
		System.out.println("Enter your first name");
		String firstName = input.nextLine();
		if (firstName.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		System.out.println("Enter your last name");
		String lastName = input.nextLine();
		if (lastName.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		System.out.println("Enter your age");
		boolean hasAge = false;
		int userAge = 0;
		while (hasAge == false) {
			try {
				userAge = input.nextInt();
				hasAge = true;
			}catch(Exception e) {
				String strAge = input.nextLine();
				//if (Integer.parseInt(strAge)) {
					if (strAge.equalsIgnoreCase("quit")) {
						System.out.println("Nobody likes a quitter...");
						System.exit(0);
					
				}else {
				System.out.println("Sorry, please enter a valid number.");
			}
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
				break;
				//System.out.println("Thank you for providing your birth month");
//				} 
			}catch (RuntimeException e1) {
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
	System.out.println("Enter your favorite ROYGBIV color. If you do not know what ROYGBIV is, please enter \"Help\" to get a list of the ROYGBIV colors.");
	boolean hasFavColor = false;
	String favColor = "";
	while  (hasFavColor == false) {	
			favColor = input.nextLine();
//			if (favColor.toLowerCase().equals("help")) {
//				System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");
//			}
		try {	
			int favcol = Integer.parseInt(favColor);
			//hasFavColor = true;
			System.out.println("This does not make sense. Please enter a ROYGBIV color or enter \"Help\".");
		continue;
		} catch (Exception e2) {		
		//	hasFavColor = true;
			if (favColor.toLowerCase().equals("help")) {
				System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");
				continue;
			} 
			else if (favColor.equalsIgnoreCase("quit")) {
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			}hasFavColor = true;
		}
		 // break;
	 // input.nextLine();
	 // System.out.println("Please provide a ROYGBIV color or enter \"Help\" to learn more.");
	}
	 
	
//  boolean hasFavColor = false;
//	String userFavColor;
//	do {
//		try {
//			if(userFavColor ==)
//		}
//	}
	System.out.println("How many siblings do you have?");
	String strUserSiblings = "";
	int numUserSiblings = 0;
//	if (strUserSiblings.equalsIgnoreCase("quit")) {
//		System.out.println("Nobody likes a quitter...");
//		System.exit(0);
//	}
	boolean hasSiblings = false;
	while (hasSiblings == false)
	{ 
	  strUserSiblings = input.nextLine();
		try {
			
			numUserSiblings = Integer.parseInt(strUserSiblings);
			hasSiblings = true;
		}
	catch (NumberFormatException ex) {
	//		System.out.println("Please check and type in again.");
			if (strUserSiblings.equalsIgnoreCase("quit")) {
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			}
				System.out.println("Please check and type in again.");
			continue;
		} 		
	}
//		else  {
//		System.out.println("Please check and type in again.");
//		input.next();
//			}
		
	
	
		
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
	System.out.println(firstName.toUpperCase().substring(0,1) + firstName.substring(1) + " " 
			+ lastName.toUpperCase().substring(0,1) + lastName.substring(1) + 
			" will retire in " + retirementAge + " years with " + userBalance +
			" in the bank, a vacation home in " + vacationHome + ", and travel by " + transportMode + ".");

  
	}
}
 



