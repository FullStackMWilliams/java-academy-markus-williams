package com.pluralsight;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

/* Welcome to Cafe Java this  */
public class CafeJava {
    private static final String CSV_FILE = "cafe_java_terms.csv";
    private static List<WorkbookTerm> terms = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static Random rand = new Random();

    // ANSI colors for terminal
    private static final String RESET = "\u001B[0m";
    private static final String BLUE = "\u001B[34m";
    private static final String GREEN = "\u001B[32m";
    private static final String RED = "\u001B[31m";
    private static final String YELLOW = "\u001B[33m";
    private static final String CYAN = "\u001B[36m";

    public static void main(String[] args) {
        loadTerms();
        System.out.println(CYAN + "Welcome to Café Java — Java terminology trainer ☕" + RESET);
        mainLoop();
    }

    private static void mainLoop() {
        while (true) {
            System.out.println("\n" + BLUE + "=== Café Java Menu ===" + RESET);
            System.out.println("1. Search by term");
            System.out.println("2. Learn a random term");
            System.out.println("3. Add a new term");
            System.out.println("4. Display a workbook");
            System.out.println("5. Start Quiz (True/False, timed)");
            System.out.println("6. Quit");
            System.out.print(CYAN + "Choose an option (1-6): " + RESET);

            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1" -> searchByTerm();
                case "2" -> learnNewTerm();
                case "3" -> addNewTerm();
                case "4" -> displayWorkbook();
                case "5" -> startQuiz();
                case "6" -> {
                    saveTerms();
                    System.out.println(GREEN + "Saved. Goodbye! ☕" + RESET);
                    return;
                }
                default -> System.out.println(RED + "Invalid choice. Please pick 1-6." + RESET);
            }
        }
    }

    // ---------- CSV Management ----------
    private static void loadTerms() {
        terms.clear();
        if (!Files.exists(Paths.get(CSV_FILE))) {
            System.out.println(YELLOW + "No CSV file found at " + CSV_FILE + ". Starting with an empty set." + RESET);
            return;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] parts = line.split("\\|", 3);
                if (parts.length == 3) {
                    terms.add(new WorkbookTerm(parts[0].trim(), parts[1].trim(), parts[2].trim()));
                }
            }
            System.out.println(GREEN + "Loaded " + terms.size() + " terms from " + CSV_FILE + RESET);
        } catch (IOException e) {
            System.out.println(RED + "Error loading CSV: " + e.getMessage() + RESET);
        }
    }

    private static void saveTerms() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(CSV_FILE))) {
            for (WorkbookTerm t : terms) {
                pw.printf("%s|%s|%s%n", t.getWorkbook(), t.getTerm(), t.getDefinition());
            }
        } catch (IOException e) {
            System.out.println(RED + "Error saving CSV: " + e.getMessage() + RESET);
        }
    }

    // ---------- Core Menu Options ----------
    private static void searchByTerm() {
        System.out.print(CYAN + "Enter term to search (partial allowed): " + RESET);
        String q = scanner.nextLine().trim().toLowerCase();
        List<WorkbookTerm> results = terms.stream()
                .filter(t -> t.getTerm().toLowerCase().contains(q))
                .collect(Collectors.toList());
        if (results.isEmpty()) {
            System.out.println(RED + "No matches found for '" + q + "'." + RESET);
        } else {
            System.out.println(GREEN + "Found " + results.size() + " result(s):" + RESET);
            for (WorkbookTerm t : results) {
                System.out.println("- " + CYAN + t.getTerm() + RESET +
                        " (" + t.getWorkbook() + ") : " + t.getDefinition());
            }
        }
    }

    private static void learnNewTerm() {
        String workbook = chooseWorkbookOrAll();
        List<WorkbookTerm> pool = (workbook.equalsIgnoreCase("ALL"))
                ? new ArrayList<>(terms)
                : terms.stream().filter(t -> t.getWorkbook().equalsIgnoreCase(workbook)).collect(Collectors.toList());
        if (pool.isEmpty()) {
            System.out.println(RED + "No terms available for the selected workbook." + RESET);
            return;
        }
        WorkbookTerm pick = pool.get(rand.nextInt(pool.size()));
        System.out.println("\n" + BLUE + "Random Term from " + pick.getWorkbook() + ":" + RESET);
        System.out.println(GREEN + pick.getTerm() + RESET + " -> " + pick.getDefinition());
    }

    private static void addNewTerm() {
        System.out.print("Enter workbook name (or new workbook name): ");
        String workbook = scanner.nextLine().trim();
        System.out.print("Enter term: ");
        String term = scanner.nextLine().trim();
        System.out.print("Enter definition: ");
        String definition = scanner.nextLine().trim();

        if (workbook.isEmpty() || term.isEmpty()) {
            System.out.println(RED + "Workbook name and term cannot be empty." + RESET);
            return;
        }
        if (definition.isEmpty()) definition = "(definition not provided)";

        terms.add(new WorkbookTerm(workbook, term, definition));
        saveTerms(); // <-- Auto-save!
        System.out.println(GREEN + "Term added and saved successfully!" + RESET);
    }

    private static void displayWorkbook() {
        System.out.print("Enter workbook name to display (or 'ALL' to list all): ");
        String workbook = scanner.nextLine().trim();
        List<WorkbookTerm> list = workbook.equalsIgnoreCase("ALL")
                ? terms
                : terms.stream().filter(t -> t.getWorkbook().equalsIgnoreCase(workbook)).collect(Collectors.toList());
        if (list.isEmpty()) {
            System.out.println(RED + "No terms found for '" + workbook + "'." + RESET);
            return;
        }
        System.out.println("\n" + BLUE + "--- " +
                (workbook.equalsIgnoreCase("ALL") ? "All Workbooks" : workbook) + " ---" + RESET);
        list.stream()
                .sorted(Comparator.comparing(WorkbookTerm::getTerm, String.CASE_INSENSITIVE_ORDER))
                .forEach(t -> System.out.println(GREEN + t.getTerm() + RESET + " : " + t.getDefinition()));
    }

    private static void startQuiz() {
        try {
            System.out.print("How many questions do you want? ");
            int n = Integer.parseInt(scanner.nextLine().trim());
            if (n <= 0) return;

            String workbook = chooseWorkbookOrAll();
            List<WorkbookTerm> pool = workbook.equalsIgnoreCase("ALL")
                    ? new ArrayList<>(terms)
                    : terms.stream().filter(t -> t.getWorkbook().equalsIgnoreCase(workbook)).collect(Collectors.toList());
            if (pool.isEmpty()) {
                System.out.println(RED + "No terms available for quiz." + RESET);
                return;
            }

            int correct = 0, wrong = 0;
            for (int i = 1; i <= n; i++) {
                WorkbookTerm item = pool.get(rand.nextInt(pool.size()));
                boolean useCorrect = rand.nextBoolean();
                String definition = useCorrect ? item.getDefinition()
                        : pool.get(rand.nextInt(pool.size())).getDefinition();

                System.out.println("\n" + BLUE + "Question " + i + "/" + n + ":" + RESET);
                System.out.println("Term: " + CYAN + item.getTerm() + RESET);
                System.out.println("Definition: " + definition);
                System.out.print("True or False? ");
                long start = System.currentTimeMillis();
                String answer = scanner.nextLine().trim().toLowerCase();
                long elapsed = System.currentTimeMillis() - start;
                boolean timedOut = elapsed > Duration.ofSeconds(25).toMillis();
                boolean userTrue = answer.equals("true") || answer.equals("t");

                if (timedOut) {
                    System.out.println(YELLOW + "⏰ Time expired (25s). Marked incorrect." + RESET);
                    wrong++;
                } else if (userTrue == useCorrect) {
                    System.out.println(GREEN + "✅ Correct!" + RESET);
                    correct++;
                } else {
                    System.out.println(RED + "❌ Incorrect! Correct answer was " +
                            (useCorrect ? "True" : "False") + RESET);
                    wrong++;
                }
            }

            int total = correct + wrong;
            double percent = total == 0 ? 0 : (correct * 100.0 / total);
            System.out.println("\n" + BLUE + "--- Quiz Results ---" + RESET);
            System.out.println(GREEN + "Correct: " + correct + RESET);
            System.out.println(RED + "Wrong: " + wrong + RESET);
            System.out.printf(CYAN + "Score: %.2f%%%n" + RESET, percent);

        } catch (Exception e) {
            System.out.println(RED + "Invalid input. Please enter a number." + RESET);
        }
    }

    private static String chooseWorkbookOrAll() {
        Set<String> wbs = terms.stream().map(WorkbookTerm::getWorkbook)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("Available workbooks:");
        int i = 1;
        for (String w : wbs) System.out.println("  " + (i++) + ") " + w);
        System.out.println("  0) All Workbooks");
        System.out.print(CYAN + "Choose workbook (or 0 for ALL): " + RESET);
        String choice = scanner.nextLine().trim();
        if (choice.equals("0") || choice.equalsIgnoreCase("ALL")) return "ALL";
        try {
            int num = Integer.parseInt(choice);
            if (num > 0 && num <= wbs.size())
                return new ArrayList<>(wbs).get(num - 1);
        } catch (NumberFormatException ignored) {}
        return choice;
    }
}