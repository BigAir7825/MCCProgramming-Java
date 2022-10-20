package adairassignment3;
import java.text.NumberFormat;
import java.util.Scanner;
public class TheConversions {

    // CToF
    
    public static double cToF(double inputTemp) { 
    double ctof = 1.8 * inputTemp + 32;
    return ctof;
    } 
    
    // KToF
    
    public static double kToF(double inputTemp) {  
    double ktof = 1.8 * (inputTemp - 273) + 32;
    return ktof;
    }
    
    // FToC
    
    public static double fToC(double inputTemp) {  
    double ftoc = .555555555 * (inputTemp - 32);
    return ftoc;
    }
    
    //CToK
    
    public static double cToK(double inputTemp) {
    double ctok = inputTemp + 273;
    return ctok;
    }
    
    //KToC
    
    public static double kToC(double inputTemp) {
    double ktoc = inputTemp - 273;
    return ktoc;    
    }
    
    //FToK
    
    public static double fToK(double inputTemp) {
    double ftok = .555555555 * (inputTemp - 32) + 273;
    return ftok;
    }
    
    // Input Temp
    
    public static double inputTemp(String temp) { 
    double inputTemp, validatedouble;
    Scanner temperature = new Scanner(System.in);
    //System.out.println("\nEnter the temperature you want to convert in " + temp);
    //inputTemp = temperature.nextDouble();
    validatedouble = Validator.getDouble(temperature, ("\nEnter the temperature you want to convert in " + temp));
    return validatedouble;
    }
    
    // Output Generic
    
    public static void outputGeneric(String str1, String str2, double initialTemp, double finalTemp) {
    
    // Number Formatting    
        
    NumberFormat number = NumberFormat.getNumberInstance();
    number.setMaximumFractionDigits(2);
    
    //  Variable Formatting
    
    String strInitial = number.format(initialTemp);
    String strFinal = number.format(finalTemp);
    
    // Printing
    
    System.out.println("\n\n\nInitial temp in " + str1 + strInitial + "\nFinal temp in " + str2 + strFinal + "\n\n\n");
    }    
    }
