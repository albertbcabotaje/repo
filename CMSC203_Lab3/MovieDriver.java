
import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		// Driver Method - Method main()
		
		
		Scanner sc = new Scanner(System.in);
		
		// Variables
		char ch = 'y';
		
		while(ch=='y')
		{
			// Title
			Movie m = new Movie();
			System.out.println("Enter the name of the movie: ");
			String title = sc.nextLine();
			m.setTitle(title);
			
			// Rating
			System.out.println("Enter the rating of the movie: ");
			String rating = sc.next();
			m.setRating(rating);
			
			// Tickets sold
			System.out.println("Enter the number of tickets sold for this movie: ");
			int n = sc.nextInt();
			m.setSoldTickets(n);
			
			// Print title, rating, tickets sold
			System.out.println(m.toString());
			
			// Ask user if they want to enter another movie
			System.out.println("Do you want to enter another movie? (y or n)");
			ch = sc.next().charAt(0);
			sc.nextLine();
		}
		System.out.println("Goodbye!");
		System.out.println("PROGRAMMER NAME: ALBERT B CABOTAJE");
		System.out.println("ASSIGNMENT 2");
		System.out.println("DUE DATE: 02/21/2022");
		}
		
		

	}

