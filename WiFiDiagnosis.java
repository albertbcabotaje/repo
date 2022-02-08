/*
 * Class: CMSC203 CRN 34164
 * Instructor: Ahmed Tarek
 * Description: 
 * Due: 02/07/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Albert B Cabotaje
*/

import java.util.Scanner; // for reading keyboard input

public class WiFiDiagnosis {

	public static void main(String[] args) {
	
		System.out.println("*******WiFi Diagnosis*******"); // Display application title
		// While loop
		// First instructions
		System.out.println("----------------------------");


		System.out.println("Please reboot the computer and try to connnect to the WiFi.");
		System.out.println("Was the problem fixed? Please enter 0 for NO and 1 for YES.");
		int n;
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		while(n == 1) // If user inputs 1 (YES)
		{
		System.out.println("Thank you for using WiFi Diagnosis");
		System.out.println("Programmer: Albert B Cabotaje Jr");
		System.exit(0);
		}

		// Next instructions
		System.out.println("\nPlease reboot the router and try to connect.");
		System.out.println("Was the problem fixed? Please enter 0 for NO and 1 for YES");

		n = kb.nextInt();
		while(n == 1) // If user inputs 1 (YES)
		{
		System.out.println("Thank you for using WiFi Diagnosis");
		System.out.println("Programmer: Albert B Cabotaje Jr");
		System.exit(0);
		}

		// Next instructions
		System.out.println("\nPlease check and make sure the cables connecting to the router are firmly plugged in and power is getting to the router.");
		System.out.println("Was the problem fixed? Please enter 0 for NO and 1 for YES");

		n = kb.nextInt();
		while(n == 1) // If user inputs 1 (YES)
		{
		System.out.println("Thank you for using WiFi Diagnosis");
		System.out.println("Programmer: Albert B Cabotaje Jr");
		System.exit(0);
		}

		// Next instruction
		System.out.println("\nPlease move the computer closer to the router and try to connect to the WiFi.");
		System.out.println("Was the problem fixed? Please enter 0 for NO and 1 for YES");

		n = kb.nextInt();
		while(n == 1) // If user inputs 1 (YES)
		{
		System.out.println("Thank you for using WiFi Diagnosis");
		System.out.println("Programmer: Albert B Cabotaje Jr");
		System.exit(0);
		}

		// Next instructions
		System.out.println("\nIf prior solutions stated did not work, please contact ISP.");

		System.out.println("Thank you for using WiFi Diagnosis");
		System.out.println("Programmer: Albert B Cabotaje Jr");
		System.exit(0); // Terminate program

	}

}
