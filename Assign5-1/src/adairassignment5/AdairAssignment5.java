package adairassignment5;
import java.util.*;
public class AdairAssignment5 {
    public static void main(String[] args) {
        // Finish adding Code
        boolean DoesItExist;
        int iHowMany, Entry;
        final int SIZE = 100000;
        int[] NumArray = new int[SIZE];
        String prompt = "Please enter an integer between 0 & 2,500: ", goOn = "y";
        
        //Calling the Header
        
        AdairHeading.Heading(5);
        
        //entering the loop
        
        while (goOn.equalsIgnoreCase("y")) {

            //Getting the input
        
            Scanner input = new Scanner(System.in);
            Entry = Validator.getIntWithinRange(input, prompt, 0, 2500);
        
            //Filling the Array

            MethodResource.fillTheArray(NumArray, SIZE);
            System.out.println("\nDone filling the array\n");
        
            //Finding if it is in the loop
        
        DoesItExist = MethodResource.linearSearchOne(NumArray, SIZE, Entry);
       
        //Finding how many times
       
        if (DoesItExist == true)
            iHowMany = MethodResource.linearSearchTwo(NumArray, SIZE, Entry);
        else
            iHowMany = 0;
       
        //Printing
       
         MethodResource.programOutput(DoesItExist, iHowMany);
         
        // Finding if they want to go on
        
        Scanner keepGoing = new Scanner(System.in);
        System.out.println("Enter a y to keeep going.");
        goOn = keepGoing.next();
        }   
    }
}       
