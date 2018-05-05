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
		int userAge = input.nextInt();
	}

}
