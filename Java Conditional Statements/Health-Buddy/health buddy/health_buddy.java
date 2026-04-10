import java.util.*;
public class health_buddy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String repeat;

        // Daily random wellness tip
        String[] tips = {
            "Tip: Drink 8 glasses of water a day consistently.",
            "Tip: 10,000 steps daily keeps your heart strong.",
            "Tip: Reduce screen time before bed for better sleep.",
            "Tip: Include green veggies in at least one meal daily.",
            "Tip: Smiling boosts your immunity and mood instantly!"
        };
        System.out.println("========================================");
        System.out.println("        WELCOME TO HEALTH ASSISTANT     ");
        System.out.println("========================================");
        System.out.println(tips[rand.nextInt(tips.length)]);
        System.out.println("----------------------------------------");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        do {
            System.out.println("\n----------------------------------------");
            System.out.println("Hey " + name + ", How's Your Health?");
            System.out.println("1) Very Good");
            System.out.println("2) Fine");
            System.out.println("3) Little Bit Seasonal Health Issues");
            System.out.println("4) Major Health Issue");
            System.out.print("Enter the number (1-4): ");
            int input = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.println("----------------------------------------");

            // Random fun facts array
            String[] funFacts = {
                "Laughing 100 times burns as many calories as 10 minutes of cycling!",
                "Drinking water before meals can reduce calorie intake by 13%!",
                "Walking barefoot on grass improves your eyesight and calms your mind.",
                "Dark chocolate can improve brain function — but moderation is key!",
                "Stretching after waking up improves blood flow and posture.",
                "Deep breathing for 5 minutes reduces stress hormones instantly."
            };

            switch (input) {
                case 1:
                    System.out.println("Great! Nice to hear that. Stay healthy as always :)");
                    System.out.println("Fun Fact: " + funFacts[rand.nextInt(funFacts.length)]);
                    break;

                case 2:
                    System.out.println("Ohh good! May God keep you healthy always.");
                    System.out.println("Fun Fact: " + funFacts[rand.nextInt(funFacts.length)]);

                    // Mood Analyzer
                    System.out.print("\nDescribe how you feel today in few words: ");
                    String mood = sc.nextLine().toLowerCase();

                    if (mood.contains("tired") || mood.contains("weak"))
                        System.out.println("You might be low on sleep or iron. Hydrate and rest properly.");
                    else if (mood.contains("stress") || mood.contains("tense"))
                        System.out.println("Try 5-minute deep breathing or short meditation.");
                    else if (mood.contains("happy") || mood.contains("energetic"))
                        System.out.println("Awesome! Keep that vibe up and spread positivity!");
                    else
                        System.out.println("Good to know. Maintain a balanced lifestyle.");

                    // BMI and diet suggestion
                    System.out.print("\nWould you like to calculate your BMI? (yes/no): ");
                    String bmiChoice = sc.nextLine().toLowerCase();

                    if (bmiChoice.equals("yes")) {
                        System.out.print("Enter your weight in kg: ");
                        double weight = sc.nextDouble();
                        System.out.print("Enter your height in meters: ");
                        double height = sc.nextDouble();
                        sc.nextLine(); // consume newline

                        double bmi = weight / (height * height);
                        System.out.printf("Your BMI is: %.2f\n", bmi);

                        if (bmi < 18.5) {
                            System.out.println("You are Underweight. Try a nutritious diet with balanced proteins.");
                            System.out.println("Diet Suggestion: Add eggs, nuts, bananas, and milk to your meals.");
                        } else if (bmi < 24.9) {
                            System.out.println("You have a Normal weight. Keep it up with regular exercise!");
                            System.out.println("Diet Suggestion: Maintain balance — fruits, proteins, and hydration.");
                        } else if (bmi < 29.9) {
                            System.out.println("You are Overweight. Try reducing junk and stay active.");
                            System.out.println("Diet Suggestion: Add green tea, salads, and reduce sugary drinks.");
                        } else {
                            System.out.println("You are Obese. Consider seeing a nutritionist and working out.");
                            System.out.println("Diet Suggestion: Focus on portion control and fiber intake.");
                        }
                    } else {
                        System.out.println("No worries! Stay active and hydrated.");
                    }
                    break;

                case 3:
                    System.out.println("Ohh :( What type of issue are you facing?");
                    System.out.println("1) Seasonal Cold");
                    System.out.println("2) Viral Fever");
                    System.out.println("3) Coughing or Runny/Blocked Nose");
                    System.out.print("Enter the number: ");
                    int issue = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.println("----------------------------------------");

                    System.out.println("How would you like to proceed?");
                    System.out.println("1) Online Medical Consultancy");
                    System.out.println("2) Chemist Medication");
                    System.out.println("3) Ancient Home Remedies");
                    System.out.print("Enter the number: ");
                    int option = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.println("----------------------------------------");

                    if (option == 1) {
                        System.out.println("Recommended Online Doctors/Apps:");
                        System.out.println("- Practo: www.practo.com");
                        System.out.println("- Apollo 24/7: www.apollo247.com");
                        System.out.println("- Tata Health: www.tatahealth.com");
                    } else if (option == 2) {
                        System.out.println("Common Medicines:");
                        switch (issue) {
                            case 1:
                                System.out.println("- Paracetamol 500mg");
                                System.out.println("- Cetirizine for cold");
                                break;
                            case 2:
                                System.out.println("- Dolo 650");
                                System.out.println("- ORS and light meals");
                                break;
                            case 3:
                                System.out.println("- Cough Syrup (Ascoril, Benadryl)");
                                System.out.println("- Steam inhalation tablets");
                                break;
                            default:
                                System.out.println("Invalid Issue Input.");
                        }
                    } else if (option == 3) {
                        System.out.println("Home Remedies You Can Try:");
                        switch (issue) {
                            case 1:
                                System.out.println("- Tulsi + Ginger tea");
                                System.out.println("- Warm water gargle with salt");
                                break;
                            case 2:
                                System.out.println("- Drink Giloy or Kadha");
                                System.out.println("- Rest well and stay hydrated");
                                break;
                            case 3:
                                System.out.println("- Steam with Vicks or eucalyptus oil");
                                System.out.println("- Honey + Ginger mixture");
                                break;
                            default:
                                System.out.println("Invalid Issue Input.");
                        }
                    } else {
                        System.out.println("Invalid Option.");
                    }
                    break;

                case 4:
                    System.out.println("Please take care. It’s serious.");
                    System.out.println("Tips until you get medical help:");
                    System.out.println("- Stay hydrated");
                    System.out.println("- Avoid outside food and caffeine");
                    System.out.println("- Have someone monitor your condition");
                    System.out.println("- Contact a doctor or visit a hospital ASAP");

                    // Symptom-based guidance
                    System.out.print("\nCan you describe your main issue in one word (e.g., 'chest', 'headache', 'breathing')? ");
                    String symptom = sc.nextLine().toLowerCase();

                    if (symptom.contains("chest")) {
                        System.out.println(" Possible cardiac or respiratory concern. Avoid strain and seek a cardiologist.");
                    } else if (symptom.contains("head")) {
                        System.out.println("Possible migraine or stress issue. Avoid screen time and hydrate well.");
                    } else if (symptom.contains("breath")) {
                        System.out.println("Possible respiratory distress. Sit upright and breathe slowly.");
                    } else {
                        System.out.println("Consult a general physician immediately for proper diagnosis.");
                    }

                    // Specialist recommender
                    Map<String, String> specialistMap = new HashMap<>();
                    specialistMap.put("fever", "General Physician");
                    specialistMap.put("heart", "Cardiologist");
                    specialistMap.put("skin", "Dermatologist");
                    specialistMap.put("stomach", "Gastroenterologist");
                    specialistMap.put("mental", "Psychiatrist");

                    System.out.print("Enter affected body area or keyword: ");
                    String body = sc.nextLine().toLowerCase();

                    if (specialistMap.containsKey(body)) {
                        System.out.println("Suggested Specialist: " + specialistMap.get(body));
                    } else {
                        System.out.println("Suggested Specialist: General Physician");
                    }

                    // Emergency contacts
                    System.out.println("\n Emergency Helpline: 108 (India)");
                    System.out.println("Nearby Hospitals (Sample Data):");
                    System.out.println("- AIIMS Delhi: 011-26588500");
                    System.out.println("- Apollo Hospital: 1066");
                    System.out.println("- Fortis Healthcare: 0124-4962200");
                    break;

                default:
                    System.out.println("Invalid input. Please choose between 1–4.");
            }

            System.out.println("----------------------------------------");
            System.out.print("Would you like to check again? (yes/no): ");
            repeat = sc.nextLine().toLowerCase();
            System.out.println("========================================");

        } while (repeat.equals("yes"));

        System.out.println("Thank you, " + name + "! Stay healthy and take care.");
        sc.close();
    }
}
