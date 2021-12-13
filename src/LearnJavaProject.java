import static java.lang.Math.*;
import java.io.Console;
import java.util.*; // Add this import to use Scanner class

public class Test {

	public static void main(String[] args) {
//		String message = new String();
//		message = "Hello, Mate!";
//		System.out.println(getSum(2, 1, message));
//		double answer = sqrt(4);
//		double answer2 = 1 * ++answer;
//		System.out.println(answer2);
		
//		useStringBuilder();
//		useScanner();
//		useConsole();
		usePrintF();
	}

	
	private static Integer getSum(Integer num1, Integer num2, String message) {
		Integer sum = num1 + num2;
		Constants.Size s = Constants.Size.LARGE;
		System.out.println(s);
		if(message != Constants.HELLO_MESSAGE) {
			return 0;
		}
		return sum;
	}
	
	
	//---------------------------IMPLEMENTATION OF ENUM---------------------------//
	private class Constants {
		public static final String HELLO_MESSAGE = "Hello";
		enum Size { SMALL, MEDIUM, LARGE }
	}
	
	//------------------------IMPLEMENTATION OF STRINGBUILDER----------------------//
	// Note: Using Stringbuilder saves you time and memory (good for string concatenation)
	private static void useStringBuilder() {
		StringBuilder messageBuilder = new StringBuilder();
		Scanner in = new Scanner(System.in);
		Boolean isUserDone = false;
		
		while(!isUserDone) {
			System.out.println("Enter your word");
			messageBuilder.append(in.next());
			System.out.println("Are you finished (Y/N)? ");
			String answer = in.next();
			if (answer.equalsIgnoreCase("Y")) isUserDone = true;
		}
		
		System.out.println(messageBuilder.toString());
	}
	
	//-------------------------- IMPLEMENTATION OF I/O-----------------------------//
	// Note: Scanner isn't suitable for reading passwords since it is visible
	// to anyone. Use Console instead (see below).
	private static void useScanner() {
		Scanner in = new Scanner(System.in);
		System.out.println("ENTER YOUR NUMBER: ");
		int userInput = in.nextInt();
		System.out.println("ENTER YOUR SECOND NUMBER: ");
		int sum = userInput + in.nextInt();
		System.out.println("THIS IS THE SUM OF YOUR INPUT: " + sum);
		System.out.println("Do you have any comment (Y/N)? ");
		String answer = in.next();
		
		if (answer.equalsIgnoreCase("Y")) System.out.println("We aren't interested in your comment.");
		else if (answer.equalsIgnoreCase("N")) System.out.println("Whew! No comment!");
		else System.out.println("Invalid input, dude!");
	}
	
	//------------------------IMPLEMENTATION OF CONSOLE---------------------------//
	// Note: Console is suitable for password -- it doesn't show on console as you type.
	// Running this won't work (will say "console" is null) on Eclipse. Use an actual console window.
	private static void useConsole() {
		Console console = System.console();
		String username = console.readLine("User name: ");
		char[] passwordChar = console.readPassword("Password: ");
		String password = String.valueOf(passwordChar);
		
		if (username.equals("ryoma") && password.equals("admin")) System.out.print("Logged in successfully!");
		else System.out.print("Incorrect password.");
	}
	
	//----------------------IMPLEMENTATION OF FORMATTED OUTPUT----------------------//
	// "%n": platform-dependent line separator (e.g.: ----)
	// "%b": boolean (e.g.: false)
	// "%c": character (e.g.: H)
	// "%d": decimal integer (e.g.: 159)
	// "%f": fixed-point floating point (e.g.: 15.9)
	// "%s": string (e.g.: Hello)
	private static void usePrintF() {
		double x = 1000.0 / 3;
		System.out.printf("%8.2f", x); // 8 characters with precision of 2
		String fruit = "berries";
		System.out.println();
		int howMuch = 5;
		System.out.printf("I want %d %s, Mum!", howMuch, fruit); 
	}
}
