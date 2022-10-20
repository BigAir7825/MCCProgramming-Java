package adairassignment3;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
public class AgeCalculatorApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Age Calculator\n");
        
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        
        // Get input from the the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String dateOfBirthString = sc.nextLine();
        String birthDateParts[] = dateOfBirthString.split("-");
        if (birthDateParts.length != 3)
            System.out.println("That is not a correct date");
        else{        
            LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString);
            if (dateOfBirth.isAfter(currentDate))
                System.out.println("This date is after the current date");
            else{
        
            DateTimeFormatter dtf = 
                    DateTimeFormatter.ofLocalizedDate(
                            FormatStyle.MEDIUM);
            String dateOfBirthFormatted = dtf.format(dateOfBirth);
            System.out.println("Your date of birth is " + dateOfBirthFormatted);

            //Format and print the current date
            String currentDateFormatted = dtf.format(currentDate);
           System.out.println("The current date is " + currentDateFormatted);

            // Calculate and print the user's age
            
            System.out.println("Your age is " + ChronoUnit.YEARS.between(dateOfBirth, currentDate));
            }
        }
    }
}