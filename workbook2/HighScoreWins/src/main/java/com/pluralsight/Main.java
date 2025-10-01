package com.pluralsight;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner highScore_Collector = new Scanner(System.in);

        System.out.print("Enter team name and score: ");
        String input = highScore_Collector.nextLine().trim();

        String[] gameInfo = input.split("\\|");

        if (gameInfo.length != 2) {
            System.out.println("Invalid format. (Please use Home:Visitors|21:9): ");
            highScore_Collector.close();
            return;
        }

        String[] teams = gameInfo[0].split(":");
        String[] scores = gameInfo[1].split(":");

        if (teams.length != 2 || scores.length != 2) {
            System.out.println("Invalid format. PLease use format Home:Visitors|homeScore:awayScore");
            highScore_Collector.close();
            return;
        }

        String homeTeam = teams[0].trim();
        String visitorTeam = teams[1].trim();

        int homeScore = Integer.parseInt(scores[0].trim());
        int visitorScore = Integer.parseInt(scores[1].trim());


        String winner;
        if (homeScore> visitorScore) {
            winner = homeTeam;
        }else if (visitorScore > homeScore) {
            winner = visitorTeam;
        }else {
            winner = "Its a tie";
        }

        System.out.println("Winner: " + winner);
        highScore_Collector.close();



        

    }
}