package adairassignment5;
import java.util.Scanner;
public class Validator {
    public static double getDouble(Scanner sc, String prompt) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println(
                        "Error! Invalid number. Try again.");
            }
            sc.nextLine();
            }
        return d;
    }
    public static double getDoubleWithinRange(Scanner sc, String prompt, double min, double max) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            d = getDouble(sc, prompt);
            if (d <= min) {
                System.out.println(
                    "Error! Number must be greater than " + min + ".");
            } else if (d >= max) {
                System.out.println(
                    "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return d;
    }
    public static int getInt(Scanner sc, String prompt) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println(
                    "Error! Invalid integer. Try again.");
            }
            sc.nextLine();
        }
        return i;
    }
    public static int getIntWithinRange(Scanner sc, String prompt, int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = getInt(sc, prompt);
            if (i <= min) {
                System.out.println(
                    "Error! Number must be greater than " + min + ".");
            } else if (i >= max) {
                System.out.println(
                    "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return i;
    }
    public static int getRandomInt(int limit) {
        double d = Math.random() * limit;
        int randomInt = (int) d;
        randomInt++;
        return randomInt;
    }
    public static String getString(Scanner sc, String prompt) {
        String s = "";
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            s = sc.nextLine();
            if (!s.equalsIgnoreCase("1") && !s.equalsIgnoreCase("2") && !s.equalsIgnoreCase("3") && !s.equalsIgnoreCase("4") && !s.equalsIgnoreCase("5") && !s.equalsIgnoreCase("6") && !s.equalsIgnoreCase("7")) {
                System.out.println(
                    "Error! Invalid string. Try again.");                
            } else if (s.equals("")) {
                System.out.println("Error! This entry is required");
            } else {
                isValid = true;
            }
            sc.nextLine();
        }
        return s;
    }
    public static String getLine(Scanner sc, String prompt) {
        String s = "";
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextLine()) {
                s = sc.nextLine();
                isValid = true;
            } else {
                System.out.println(
                    "Error! Invalid line. Try again.");
            }
            sc.nextLine();
        }
        return s;
    }
}
