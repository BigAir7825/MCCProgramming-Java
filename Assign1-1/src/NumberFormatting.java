
/**	NumberFormatting.java
	Wm Bowers (c) 2005 thru 2013,  All Rights Reserved.
	Demonstrating techniques in formatting with Date,
	DateFormat, NumberFormat and DecimalFormat classes
*/

import java.util.*;
import java.text.*;
import java.text.DateFormat;

public class NumberFormatting	{

	// Global variables
	static float money = 12345.6789F;
	static float salary = 23456.789F;
	static float percentage = .125F;

	public static void main (String [] args)
	{
        System.out.println("\n\n  Number Formatting Techniques\n  (c) Wm. Bowers 2005 - 2013, All Rights Reserved");
        
		// Date and time setups
		String date;
		Date now = new Date();
		DateFormat longDate = DateFormat.getDateInstance(DateFormat.LONG);
	    date = longDate.format(now);
        
        String time;
		Date nowTime = new Date();
		DateFormat longTime = DateFormat.getTimeInstance(DateFormat.SHORT);
		time = longTime.format(nowTime);
        
        String date1;
        Date now1 = new Date();
        DateFormat dateTime = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
        date1 = dateTime.format(now);

        // Formatting setup using the NumberFormat class
		NumberFormat dollars = NumberFormat.getCurrencyInstance();
        
		NumberFormat onePlace = NumberFormat.getNumberInstance();
        onePlace.setMaximumFractionDigits(1);
        
		NumberFormat twoPlace = NumberFormat.getNumberInstance();
        twoPlace.setMaximumFractionDigits(2);
            
		NumberFormat threePlace = NumberFormat.getNumberInstance();
        threePlace.setMaximumFractionDigits(3);
            
		NumberFormat noPlace1 = NumberFormat.getPercentInstance();
        
        NumberFormat noPlace2 = NumberFormat.getNumberInstance();
        noPlace2.setMaximumFractionDigits(1);
        
		//  NumberFormat Output
        System.out.println("\n  NumberFormat Class Output with Left Alignment of Values");
		System.out.println("  This is money without any formatting                         " 
                            + money);
		System.out.println("  This is money with currency formatting                       " 
                            + dollars.format(money));
		System.out.println("  This is money with onePlace for one decimal place            " 
                            + onePlace.format(money));
		System.out.println("  This is money with twoPlace for two decimal places           " 
                            + twoPlace.format(money));
		System.out.println("  This is money with threePlace for three decimal places       " 
                            + threePlace.format(money));
		System.out.println("  This is noPlace1 percentage using \"getPercentInstance()\"     " 
                            + noPlace1.format(percentage));
		System.out.println("  This is noPlace2 percentage using \"getNumberInstance()\"      " 
                            + noPlace2.format(percentage * 100) + "%");
		System.out.println();
        
        //  Same NumberFormat Output using printf(...) Statments, Alignment on the Decimal Place
        System.out.printf("  Variable Values Output Using printf(...) Statements, Alignment on the Decimal Point\n");
		System.out.printf("  %30s%34.2f\n", "This is money without any formatting", money);
		System.out.printf("  %33s%23s%,9.2f\n", "This is money with currency formatting", "$ ", money);
		System.out.printf("  %33s%,16.1f\n", "This is money w\\thousands comma and one decimal place", money);
		System.out.printf("  %33s%,16.2f\n", "This is money w\\thousands comma and two decimal places", money);
		System.out.printf("  %33s%,15.3f\n", "This is money w\\thousands comma and three decimal places", money);
		System.out.printf("  %33s%26.0f %%\n", "This is percentage with no decimal places", (percentage * 100));
		System.out.printf("  %33s%28.1f %%\n", "This is percentage with one decimal place", (percentage * 100));

		// DecimalFormat Example
		System.out.println("\n  DecimalFormat Class Using println(...) Statements Alignment on the Decimal Point");
		DecimalFormat wage1 = new DecimalFormat("$ #,##0.00");
		DecimalFormat wage2 = new DecimalFormat("#,##0.000");
		DecimalFormat wage3 = new DecimalFormat("###0");
		DecimalFormat noPlace3 = new DecimalFormat("##0.0%");
		System.out.println("  DecimalFormat wage1 salary             " + wage1.format(salary));
		System.out.println("  DecimalFormat wage2 salary               " + wage2.format(salary));
		System.out.println("  DecimalFormat wage3 salary                " + wage3.format(salary));
		System.out.println("  DecimalFormat noPlace3 Percentage            " + noPlace3.format(percentage));
        
        System.out.println("\n  Dates\n  Using println(...) Statements");
    	System.out.println("    The date is " + date);
    	System.out.println("    The date is " + date1);    //DateFormat.getDateInstance(DateFormat.LONG));
        System.out.printf("  Using printf(...) Statements");
        System.out.printf("\n    The date is %tA, %tB %te, %tY %tl:%tM:%tS%tp", now, now, now, now, now, now, now, now);
        System.out.println("\n");
      
	}	// end main
}	// end class ShowDate