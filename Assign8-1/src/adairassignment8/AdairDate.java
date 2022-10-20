package adairassignment8;
import java.text.*;	
import java.util.*;
public class AdairDate {
    static Date now = new Date();
    public static void datemain(
    )	{
        System.out.printf("\n\n  Will Adair\n");
	System.out.printf("  Assignment Eight - Working With Interfaces\n", now);
	printfDate();
    }	// end main(...)

    public static void printfDate()
    {
        System.out.printf("  %tA, %tB %te, %tY", now, now, now, now);
    }	// end getPrintfDate() method

    public static void printfTime()
    {
	System.out.printf("  %tl:%tM:%tS%tp", now, now, now, now);
     press();
	}	// end getPrintfDate() method

    public static void press()
    {
        System.out.printf("\n  Press the Enter key to continue.\n\n");
    }
}
