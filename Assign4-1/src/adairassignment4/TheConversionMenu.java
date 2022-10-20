package adairassignment4;
import java.util.Scanner;
import java.util.InputMismatchException;
public class TheConversionMenu {
    public static String menu(String cf, String kf, String fc, String ck, String kc, String fk) {   
        String conversionNum;
        int dummycounter = 3, num = 0;
        try {
        
            // New Scanner
    
            Scanner conv = new Scanner(System.in);
                
            // While loop for 3 tries
            
            while (dummycounter != 0)
                if (num >= 1) {
                    System.out.print("\nYou have " + dummycounter + " more tries.\n\n");
                }
            
                // Display Choices    
                
                System.out.println("\n\nTemperature conversion program:");
                System.out.println("1. " + cf);
                System.out.println("2. " + kf);
                System.out.println("3. " + fc);
                System.out.println("4. " + ck);
                System.out.println("5. " + kc);
                System.out.println("6. " + fk);
                System.out.println("7. Exit");
    
                // Get Conversion Number
    
                System.out.println("Enter a number for the conversion you wish to do");
                conversionNum = conv.next();

                // Returning Choice
            
                if (conversionNum.equalsIgnoreCase("1")) 
                    return conversionNum;
                else if (conversionNum.equalsIgnoreCase("2"))
                    return conversionNum;
                else if (conversionNum.equalsIgnoreCase("3"))
                    return conversionNum;
                else if (conversionNum.equalsIgnoreCase("4"))
                    return conversionNum;
                else if (conversionNum.equalsIgnoreCase("5"))
                    return conversionNum;
                else if (conversionNum.equalsIgnoreCase("6"))
                    return conversionNum;
                else if (conversionNum.equalsIgnoreCase("7"))
                    return conversionNum;
                else {
                    dummycounter--;
                    System.out.print("You did not enter a number between 1 and 7, please try again");
                }
                num++;
        } catch (InputMismatchException e) {
            System.out.println(
                "Error! Invalid number. Try again.\n");
            dummycounter --;
    }
    conversionNum = "7";
    return conversionNum;
    }     
 }