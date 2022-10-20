package roastedbeanpayrollprogram;
import java.util.Scanner;
import java.util.*;
import java.text.*;
/**
 * Title: SchuettHeading
 * Author: Schuett, H
 * Date: 12/17/2020
 * Code version: 2
 * Type: Java
 * Availability: https://canvas.mccneb.edu/courses/10006/files/1309066?module_item_id=849008
 * Change: Changed Hugh Schuett's name for Will Adair
 */
public class Assignment_2 {
    
    //Jim Holden
    
    public double JHoursWeek1;
    public double JHoursWeek2;
    public double JHoursWeek3;
    public double JHoursWeek4;
    public double JHoursTotal;
    public double JPay;
    
    //Naomi Nagata
    
    public double NHoursWeek1;
    public double NHoursWeek2;
    public double NHoursWeek3;
    public double NHoursWeek4;
    public double NHoursTotal;
    public double NPay;
    
    //Amos Burton
    
    public double AHoursWeek1;
    public double AHoursWeek2;
    public double AHoursWeek3;
    public double AHoursWeek4;
    public double AHoursTotal;
    public double APay;
    
    //Frankie Adams
    
    public double FHoursWeek1;
    public double FHoursWeek2;
    public double FHoursWeek3;
    public double FHoursWeek4;
    public double FHoursTotal;
    public double FPay;
    
    //Fred Johnson
    
    public double FrWeek1;
    public double FrWeek2;
    public double FrWeek3;
    public double FrWeek4;
    public double FrWeeklyPay;
    public double FrMonthPay;
    
    //Chrisjen Avasarala
    
    public double CWeek1;
    public double CWeek2;
    public double CWeek3;
    public double CWeek4;
    public double CWeeklyPay;
    public double CMonthPay;

    //Formatting Output
    
    public double totalPayHourly;
    public double totalPaySalary;
    public static void main(String[] args) {
            
        //Heading
        
        AdairHeading.Heading(2);

        //week 1 input
        
        Scanner J1 = new Scanner(System.in);
        System.out.println(
                "Enter the hours worked by Jim Holden during Week 1:");
        double JHoursWeek1 = J1.nextDouble();
        
        //week 2 input
        
        Scanner J2 = new Scanner(System.in);
        System.out.println(
                "Enter the hours worked by Jim Holden during Week 2:");
        double JHoursWeek2 = J2.nextDouble();
        
        //week 3 input
        
        Scanner J3 = new Scanner(System.in);
        System.out.println(
                "Enter the hours worked by Jim Holden during Week 3:");
        double JHoursWeek3 = J3.nextDouble();
        
        //week 4 input
        
        Scanner J4 = new Scanner(System.in);
        System.out.println(
                "Enter the hours worked by Jim Holden during Week 4:");
        double JHoursWeek4 = J4.nextDouble();

        //getting the total hours and total pay
        
        double JHoursTotal = JHoursWeek1+JHoursWeek2+JHoursWeek3+JHoursWeek4;
        double JPay = JHoursTotal*13.25;
        
        //TRANSITION TO NAOMI
        
        //week 1 input
        
        Scanner N1 = new Scanner(System.in);
        System.out.println(
                "Enter the hours worked by Naomi Nagata during Week 1:");
        double NHoursWeek1 = N1.nextDouble();
        
        //week 2 input
        
        Scanner N2 = new Scanner(System.in);
        System.out.println(
                "Enter the hours worked by Naomi Nagata during Week 2:");
        double NHoursWeek2 = N2.nextDouble();
        
        //week 3 input
        
        Scanner N3 = new Scanner(System.in);
        System.out.println(
                "Enter the hours worked by Naomi Nagata during Week 3:");
        double NHoursWeek3 = N3.nextDouble();
        
        //week 4 input
        
        Scanner N4 = new Scanner(System.in);
        System.out.println(
                "Enter the hours worked by Naomi Nagata during Week 4:");
        double NHoursWeek4 = N4.nextDouble();

        //getting the total hours and total pay
        
        double NHoursTotal = NHoursWeek1+NHoursWeek2+NHoursWeek3+NHoursWeek4;
        double NPay = NHoursTotal*11.75;
        
        //TRANSITION TO AMOS
        
        //week 1 input
        
        Scanner A1 = new Scanner(System.in);
        System.out.println(
                "Enter the hours worked by Amos Burton during Week 1:");
        double AHoursWeek1 = A1.nextDouble();
        
        //week 2 input
        
        Scanner A2 = new Scanner(System.in);
        System.out.println(
                "Enter the hours worked by Amos Burton during Week 2:");
        double AHoursWeek2 = A2.nextDouble();
        
        //week 3 input
        
        Scanner A3 = new Scanner(System.in);
        System.out.println(
                "Enter the hours worked by Amos Burton during Week 3:");
        double AHoursWeek3 = A3.nextDouble();
        
        //week 4 input
        
        Scanner A4 = new Scanner(System.in);
        System.out.println(
                "Enter the hours worked by Amos Burton during Week 4:");
        double AHoursWeek4 = A4.nextDouble();

        //getting the total hours and total pay
        
        double AHoursTotal = AHoursWeek1+AHoursWeek2+AHoursWeek3+AHoursWeek4;
        double APay = AHoursTotal*11.75;

        //TRANSITION TO FRANKIE
        
        //week 1 input
        
        Scanner F1 = new Scanner(System.in);
        System.out.println(
                "Enter the hours worked by Frankie Adams during Week 1:");
        double FHoursWeek1 = F1.nextDouble();
        
        //week 2 input
        
        Scanner F2 = new Scanner(System.in);
        System.out.println(
                "Enter the hours worked by Frankie Adams during Week 2:");
        double FHoursWeek2 = F2.nextDouble();
        
        //week 3 input
        
        Scanner F3 = new Scanner(System.in);
        System.out.println(
                "Enter the hours worked by Frankie Adams during Week 3:");
        double FHoursWeek3 = F3.nextDouble();
        
        //week 4 input
        
        Scanner F4 = new Scanner(System.in);
        System.out.println(
                "Enter the hours worked by Frankie Adams during Week 4:");
        double FHoursWeek4 = F4.nextDouble();

        //getting the total hours and total pay
        
        double FHoursTotal = FHoursWeek1+FHoursWeek2+FHoursWeek3+FHoursWeek4;
        double FPay = FHoursTotal*14.65;

        //TRANSITION TO FRED JOHNSON
        
        //week 1 input
        
        Scanner Fr1 = new Scanner(System.in);
        System.out.println(
                "Enter a 1 if Fred Johnson worked during Week 1, if not enter 0");
        double FrWeek1 = Fr1.nextDouble();
        
        //week 2 input
        
        Scanner Fr2 = new Scanner(System.in);
        System.out.println(
                "Enter a 1 if Fred Johnson worked during Week 2, if not enter 0");
        double FrWeek2 = Fr2.nextDouble();

        //week 3 input
        
        Scanner Fr3 = new Scanner(System.in);
        System.out.println(
                "Enter a 1 if Fred Johnson worked during Week 3, if not enter 0");
        double FrWeek3 = Fr3.nextDouble();

        //week 4 input
        
        Scanner Fr4 = new Scanner(System.in);
        System.out.println(
                "Enter a 1 if Fred Johnson worked during Week 4, if not enter 0");
        double FrWeek4 = Fr4.nextDouble();

        //getting the total pay during the month
        
        double FrWeeklyPay = 41300/52;
        double FrMonthPay = FrWeeklyPay*FrWeek1 + FrWeeklyPay*FrWeek2 + FrWeeklyPay*FrWeek3 + FrWeeklyPay*FrWeek4;
        
        //TRANSITION TO CHRISJEN

        //week 1 input
        
        Scanner C1 = new Scanner(System.in);
        System.out.println(
                "Enter a 1 if Chrisjen Avasarala worked during Week 1, if not enter 0");
        double CWeek1 = C1.nextDouble();
        
        //week 2 input
        
        Scanner C2 = new Scanner(System.in);
        System.out.println(
                "Enter a 1 if Chrisjen Avasarala worked during Week 2, if not enter 0");
        double CWeek2 = C2.nextDouble();

        //week 3 input
        
        Scanner C3 = new Scanner(System.in);
        System.out.println(
                "Enter a 1 if Chrisjen Avasarala worked during Week 3, if not enter 0");
        double CWeek3 = C3.nextDouble();

        //week 4 input
        
        Scanner C4 = new Scanner(System.in);
        System.out.println(
                "Enter a 1 if Chrisjen Avasarala worked during Week 4, if not enter 0");
        double CWeek4 = C4.nextDouble();

        //getting the total pay during the month
        
        double CWeeklyPay = 39800/52;
        double CMonthPay = CWeeklyPay*CWeek1 + CWeeklyPay*CWeek2 + CWeeklyPay*CWeek3 + CWeeklyPay*CWeek4;

        //STARTING THE OUTPUT FORMATTING
        
        double totalPayHourly = JPay + NPay + APay + FPay;
        double totalPaySalary = FrMonthPay + CMonthPay;
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
        System.out.println("  The gross pay to hourly workers is:                       " 
                            + dollars.format(totalPayHourly));
        System.out.println("  The gross pay to salary workers is:                       " 
                            + dollars.format(totalPaySalary));
        System.out.println("    \nJim Holden hours worked:                 " + JHoursTotal + "\nJim Holden earned:                       "
                            + dollars.format(JPay));
        System.out.println("    \nNaomi Nagata hours worked:                 " + NHoursTotal + "\nNaomi Nagata earned:                       "
                            + dollars.format(NPay));        
        System.out.println("    \nAmos Burton hours worked:                 " + AHoursTotal + "\nAmos Burton earned:                       "
                            + dollars.format(APay));
        System.out.println("    \nFrankie Adams hours worked:                 " + FHoursTotal + "\nFrankie Adams earned:                       "
                            + dollars.format(FPay));
        System.out.println("    \nFred Johnson weeks worked:                 " + (FrWeek1 + FrWeek2 + FrWeek3 + FrWeek4) + "\nFred Johnson earned:                       " 
                            + dollars.format(FrMonthPay));
        System.out.println("    \nChrisjen Avasarala weeks worked:                 " + (CWeek1 + CWeek2 + CWeek3 + CWeek4) + "\nChrisjen Avasarala earned:                       " 
                            + dollars.format(CMonthPay));        
    }   
    }
    
