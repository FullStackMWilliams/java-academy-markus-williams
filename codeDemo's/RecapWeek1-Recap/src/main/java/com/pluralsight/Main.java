package com.pluralsight;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner myExam_Proctor = new Scanner(System.in);

        System.out.println("Enter your test score: ");
        int testersScore = myExam_Proctor.nextInt();

        if (testersScore >= 90)
            System.out.println("You Earned an 'A'.");

        if (testersScore >= 80 && testersScore <= 89)
            System.out.println("You earned a 'B'.");

        if (testersScore >= 70 && testersScore <= 79)
            System.out.println("You earned a 'C'.");

        if (testersScore >= 60 && testersScore <= 69)
            System.out.println("You earned a 'D'.");

        if (testersScore <= 59)
            System.out.println("You earned a 'F'.");
    }
}





