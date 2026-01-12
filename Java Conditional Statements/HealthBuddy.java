import java.util.*;

public class HealthBuddy {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String name;
    String again = "yes";

    // daily tips 
    String[] tips = {
        "Drink more water today.",
        "Try to walk a little after meals.",
        "Avoid mobile before sleeping.",
        "Eat fruits and vegetables.",
        "Smile more, it helps!"
    };

    System.out.println("=================================");
    System.out.println("      WELCOME TO HEALTH BUDDY     ");
    System.out.println("=================================");

    // showing random tip 
    int tipIndex = (int)(Math.random() * tips.length);
    System.out.println("Health Tip: " + tips[tipIndex]);

    System.out.print("Enter your name: ");
    name = sc.nextLine();

    while (again.equals("yes")) {

        System.out.println("\nHi " + name + ", how is your health?");
        System.out.println("1. Very Good");
        System.out.println("2. Fine");
        System.out.println("3. Seasonal Problems");
        System.out.println("4. Major Health Issue");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();
        sc.nextLine(); // clearing input

        if (choice == 1) {

            System.out.println("Great! Keep doing what you are doing.");
            System.out.println("Fun Fact: Laughing is good for health.");

        } else if (choice == 2) {

            System.out.println("Good to hear that.");
            System.out.print("How are you feeling (one word): ");
            String mood = sc.nextLine();

            if (mood.equals("tired")) {
                System.out.println("You should take rest.");
            } else if (mood.equals("happy")) {
                System.out.println("Nice! Stay positive.");
            } else {
                System.out.println("Okay, take care of yourself.");
            }

            System.out.print("Do you want to check BMI? (yes/no): ");
            String bmiChoice = sc.nextLine();

            if (bmiChoice.equals("yes")) {

                System.out.print("Enter weight in kg: ");
                double w = sc.nextDouble();

                System.out.print("Enter height in meters: ");
                double h = sc.nextDouble();
                sc.nextLine();

                double bmi = w / (h * h);
                System.out.println("Your BMI is: " + bmi);

                if (bmi < 18.5) {
                    System.out.println("You are underweight.");
                } else if (bmi < 25) {
                    System.out.println("You are healthy.");
                } else {
                    System.out.println("You are overweight.");
                }

            } else {
                System.out.println("Okay, no BMI check.");
            }

        } else if (choice == 3) {

            System.out.println("Seasonal problems selected.");
            System.out.println("1. Cold");
            System.out.println("2. Fever");
            System.out.println("3. Cough");
            System.out.print("Enter problem: ");

            int prob = sc.nextInt();
            sc.nextLine();

            System.out.println("Choose solution:");
            System.out.println("1. Medicine");
            System.out.println("2. Home Remedy");
            System.out.print("Enter choice: ");

            int sol = sc.nextInt();
            sc.nextLine();

            if (sol == 1) {
                if (prob == 1) {
                    System.out.println("Take Cetirizine.");
                } else if (prob == 2) {
                    System.out.println("Take Paracetamol.");
                } else {
                    System.out.println("Use cough syrup.");
                }
            } else {
                System.out.println("Use home remedies and take rest.");
            }

        } else if (choice == 4) {

            System.out.println("This sounds serious.");
            System.out.println("Please visit a doctor soon.");
            System.out.println("Emergency number: 108");

        } else {

            System.out.println("Wrong choice entered.");
        }

        System.out.print("\nDo you want to continue? (yes/no): ");
        again = sc.nextLine();
    }

    System.out.println("\nThank you " + name + ". Stay healthy!");
    sc.close();
}
}
