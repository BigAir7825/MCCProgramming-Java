package adairassignment3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TheConversionMenu {
    public static int menu(String cf, String kf, String fc, String ck, String kc, String fk) {   
    int conversionNum;
    int idiotcounter = 3, num = 0;

    // TryCatch Block
    
    try {

        // New Scanner
    
        Scanner conv = new Scanner(System.in);
    
        // While Loop for 3 tries
    
        while (idiotcounter != 0) {
            if (num >= 1) {
            System.out.print("\nYou have " + idiotcounter + " tries left.\n");
            }
            // Display Choices
    
            System.out.println("\tTemperature conversion program:\n");
            System.out.println("1. " + cf);
            System.out.println("2. " + kf);
            System.out.println("3. " + fc);
            System.out.println("4. " + ck);
            System.out.println("5. " + kc);
            System.out.println("6. " + fk);
            System.out.println("7. Exit");
    
            // Get Conversion Number
                
            System.out.println("Enter a number for the conversion you wish to do");
            conversionNum = conv.nextInt();
    
            // Return conversionNum
            
                if (conversionNum == 1) 
                    return conversionNum;
                else if (conversionNum == 2)
                    return conversionNum;
                else if (conversionNum == 3)
                    return conversionNum;
                else if (conversionNum == 4)
                    return conversionNum;
                else if (conversionNum == 5)
                    return conversionNum;
                else if (conversionNum == 6)
                    return conversionNum;
                else if (conversionNum == 7)
                    return conversionNum;
                else {
                    idiotcounter--;
                    System.out.print("You did not enter a number between 1 and 7, please try again\n");
                }
                num++;
        }
    } catch (InputMismatchException e) {
            System.out.println(
                "Error! Invalid number. Try again.\n");
            idiotcounter --;
            Scanner conv = new Scanner(System.in);
            while (idiotcounter != 0) {
                System.out.print("\nYou have " + idiotcounter + " tries left.\n");
                
                // Display Choices
    
                System.out.println("\tTemperature conversion program:\n");
                System.out.println("1. " + cf);
                System.out.println("2. " + kf);
                System.out.println("3. " + fc);
                System.out.println("4. " + ck);
                System.out.println("5. " + kc);
                System.out.println("6. " + fk);
                System.out.println("7. Exit");
    
                // Get Conversion Number
                
                System.out.println("Enter a number for the conversion you wish to do");
                conversionNum = conv.nextInt();
    
                // Return conversionNum
            
                if (conversionNum == 1) 
                    return conversionNum;
                else if (conversionNum == 2)
                    return conversionNum;
                else if (conversionNum == 3)
                    return conversionNum;
                else if (conversionNum == 4)
                    return conversionNum;
                else if (conversionNum == 5)
                    return conversionNum;
                else if (conversionNum == 6)
                    return conversionNum;
                else if (conversionNum == 7)
                    return conversionNum;
                else {
                    idiotcounter--;
                    System.out.print("You did not enter a number between 1 and 7, please try again\n");
                }
        }            
    }
    conversionNum = 7;
    return conversionNum;        
    }     
 }



    
 

