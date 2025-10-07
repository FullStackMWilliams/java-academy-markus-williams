package com.pluralsight;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] quotes = {
                "'You miss 100% of the shot you don't take'. - Wayne Gretzky",
                "'The only way to do great work is to love what you do'. - Steve Jobs",
                "'I am the way, the truth, and the life'. - Jesus Christ",
                "'No man is free who cannot control himself'. - Pythagoras",
                "'Knowing is not enough, we must apply. Willing is not enough, we must do'. - Bruce Lee",
                "'Imagination is more important than knowledge. Knowledge is limited. Imagination encircles the world'. - Albert Einstein",
                "'The secret of happiness, you see, is not found in seeking more, but in developing the capacity to enjoy less'. - Socrates",
                "'We are what we repeatedly do. Excellence, then, is not an act, but a habit'. - Aristotle",
                "'The future belongs to those who prepare for it today'. - Malcom X",
                "'Without a struggle there can be no progress'. - Fredrick Douglass"

        };

        boolean continueLoop = true;

        while (continueLoop) {
            System.out.println("\nFAMOUS QUOTES LIBRARY");
            System.out.println("1-10: Select a quote by number");
            System.out.println("Pressing 0 displays a random quote");
            System.out.print("Enter your quote number: ");

            try {
                int choice = scanner.nextInt();

                if (choice == 0) {
                    int randomQuote_generator = (int) (Math.random()* quotes.length);
                    System.out.println("\nRandom Quote:");
                    System.out.println(quotes[randomQuote_generator]);
                } else if (choice >= 1 && choice <= 10) {
                    System.out.println("\n Quote #" + choice + ":");
                    System.out.println(quotes[choice - 1]);

                }else {
                    System.out.println("Invalid entry. Please enter 0-10.");
                }

            }catch (Exception e) {
                System.out.println("Invalid entry. Please reenter quote number.");
                scanner.nextLine();
            }
            System.out.println("\nWould you like to see another quote? (yes/no): ");
            scanner.nextLine();
            String reEntry = scanner.nextLine().trim().toLowerCase();

            if (!reEntry.equals("yes") && !reEntry.equals("y")) {
                continueLoop = false;
                System.out.println("Thanks for checking out my favorite quotes!");
            }

        }
    }
}