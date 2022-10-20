package adairassignment5;
import java.util.Random;
public class MethodResource {
        
    public static void fillTheArray(int[] iTempArray, int SIZE) {
         //Finished - Don't alter!
        final int RANGE = 2500;
        Random rand = new Random();
        for (int index = 0; index <= SIZE - 1; index++){
            iTempArray[index] = rand.nextInt(RANGE);
        }
    }//end of fillTheArray
    
    
    public static boolean linearSearchOne(int[] iTempArray, int SIZE, int Entry) {
        // Finish adding Code
        boolean TempDoesItExist = false;
        int index = 0, counter = 0;
        while (TempDoesItExist == false && index < SIZE) {
            if (iTempArray[counter] == Entry) {
                TempDoesItExist = true;
            } else {
                counter ++;
                index ++;
            }
        }
        return TempDoesItExist;
    }
    
    
    public static int linearSearchTwo(int[] iTempArray, int SIZE, int Entry) {
        // Finish adding Code
        int HowManyExist = 0;
        int index = 0, counter = 0;
        while (index < SIZE) {
            if (iTempArray[counter] == Entry) {
                HowManyExist++;
            }
            index++;
            counter++;
        } 
        return HowManyExist;
    }
    
    
    public static void programOutput(boolean TempDoesItExist, int TempHowMany) {
        // Finish adding code
        if (TempDoesItExist == false)
            System.out.print("Your number did not appear at all in the array.");
        else
            System.out.println("Your number occured " + TempHowMany + " times in the array.");
    }    
}
