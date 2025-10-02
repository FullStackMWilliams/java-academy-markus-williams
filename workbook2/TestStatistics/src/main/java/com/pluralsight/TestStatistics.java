package com.pluralsight;
import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {

        int[] testScores = {85,92,78,94,88,76,89,64,74,71};

        int sum = 0;
        int highScore = testScores[0];
        int lowestScore = testScores[0];

        for (int score : testScores) {
            sum += score;
            if (score > highScore) {
                highScore = score;
            }
            if (score < lowestScore) {
                lowestScore = score;
            }
        }

        double average = (double) sum / testScores.length;
        Arrays.sort(testScores);
        double median;
        int middle = testScores.length/ 2;
        if (testScores.length % 2 == 0 ) {

            median = (testScores[middle - 1] + testScores[middle]) / 2.0;
        }else{
            median = testScores[middle];
        }

        System.out.println(" Test Statistics");
        System.out.println("=====================");
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highScore);
        System.out.println("Lowest Score: " + lowestScore);
        System.out.println("Median Score: " + median);
    }
}