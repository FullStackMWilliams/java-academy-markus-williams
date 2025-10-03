package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Task[] tasks = new Task[3];

        tasks[0] = new Task("\nMarkus world");
        tasks[1] = new Task("\nMarko world");
        tasks[2] = new Task("\nJosh world");

        tasks[1].markCompleted();
        for (int i = 0; i < tasks.length; i++) {
            System.out.println(tasks[i]);


        }
    }
}