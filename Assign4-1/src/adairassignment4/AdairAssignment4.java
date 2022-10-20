package adairassignment4;
public class AdairAssignment4 {
/**
 * Title: SchuettHeading
 * Author: Schuett, H
 * Date: 12/17/2020
 * Code version: 2
 * Type: Java
 * Availability: https://canvas.mccneb.edu/courses/10006/files/1309066?module_item_id=849008
 * Change: Changed Hugh Schuett's name for Will Adair
 */    
    public static void main(String [] args) {
        String choice, ctof = "Enter a 1 to convert from Celcius to Fahrenheit\n\n",
                ktof = "Enter a 2 to convert from Kelvin to Fahrenheit\n\n",
                ftoc = "Enter a 3 to convert from Fahrenheit to Celcius\n\n",
                ctok = "Enter a 4 to convert from Celcius to Kelvin\n\n",
                ktoc = "Enter a 5 to convert from Kelvin to Celcius\n\n",
                ftok = "Enter a 6 to convert from Fahrenheit to Kelvin\n\n",
                Fahrenheit = "Fahrenheit: ",
                Celcius = "Celcius: ",
                Kelvin = "Kelvin: ";
        double Initial, Final;
        
        // Call heading and conversion menu
        
        AdairHeading.Heading(4);
        choice = TheConversionMenu.menu(ctof, ktof, ftoc, ctok, ktoc, ftok);
        
        // While loop for running program
        
        while (!choice.equalsIgnoreCase("7"))
       {
           
            // Celcius to Fahrenheit
            
            if (choice.equalsIgnoreCase("1")){
                Initial = TheConversions.inputTemp();
                Final = TheConversions.cToF(Initial);
                TheConversions.outputGeneric(Celcius, Fahrenheit, Initial, Final);
            } 
            
            // Kelvin to Fahrenheit
            
            else if (choice.equalsIgnoreCase("2")){
                Initial = TheConversions.inputTemp();
                Final = TheConversions.cToF(Initial);
                TheConversions.outputGeneric(Kelvin, Fahrenheit, Initial, Final);                
            }
            
            // Fahrenheit to Celcius
            
            else if (choice.equalsIgnoreCase("3")){
                Initial = TheConversions.inputTemp();
                Final = TheConversions.cToF(Initial);
                TheConversions.outputGeneric(Fahrenheit, Celcius, Initial, Final);                
            }
            
            // Celcius to Kelvin
            
            else if (choice.equalsIgnoreCase("4")){
                Initial = TheConversions.inputTemp();
                Final = TheConversions.cToF(Initial);
                TheConversions.outputGeneric(Celcius, Kelvin, Initial, Final);                
            }
            
            // Kelvin to Celcius
            
            else if (choice.equalsIgnoreCase("5")){
                Initial = TheConversions.inputTemp();
                Final = TheConversions.cToF(Initial);
                TheConversions.outputGeneric(Kelvin, Celcius, Initial, Final);                
            }
            
            // Fahrenheit to Kelvin
            
            else if (choice.equalsIgnoreCase("6")){
                 Initial = TheConversions.inputTemp();
                Final = TheConversions.cToF(Initial);
                TheConversions.outputGeneric(Fahrenheit, Kelvin, Initial, Final);
            }  
            choice = TheConversionMenu.menu(ctof, ktof, ftoc, ctok, ktoc, ftok);
        }
    }
    }
