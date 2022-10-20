package adairassignment7;
public class DateTimeApp {
    public static void main(String[] args) {
        int day = 1, month = 1, year = 2000, hours = 0, minutes = 0, seconds = 0;
        AdairHeading.Heading(7);
        
        // DateTime Objects
        
        DateTime myDateTime = new DateTime(day, month ,year, hours, minutes, seconds);
        DateTime yourDateTime = new DateTime();
        
        // finding my date and time
        
        System.out.println("My Clock Time");
        myDateTime.printDateTime();
        
        // New time and date
        
        myDateTime.setTime(2, 4, 5);
        yourDateTime.setTime(2, 4, 5);
        myDateTime.setDate(13, 4, 2009);
        yourDateTime.setDate(13, 4, 2009);
        
        // Finding if they are equal
        
        boolean isTimeEqual = myDateTime.equalTime(yourDateTime);
        boolean isDateEqual = myDateTime.equalDate(yourDateTime);
        if (isTimeEqual == true && isDateEqual == true)
            System.out.println("\n\nMy time and date are equal to your time and date");
        else if (isTimeEqual == true && isDateEqual == false)
            System.out.println("\n\nMy time is equal to your time but our dates are not");
        else if (isTimeEqual == false && isDateEqual == true)
            System.out.println("\n\nMy time is not equal to your time but our dates are equal");
        else
            System.out.println("\n\nNeither our times nor our dates are equal");
        
        // Incrementing time
        
        System.out.println("\n\nIncrementing time");
        long delay = 1000;
        int x = 0;
        while (x++ <= 10){
            for(int y = 0; y<=delay; y++)
                myDateTime.incrementSeconds();
            myDateTime.printTime();
        }    
        
        // Incrementing date
        
        x = 0;
        System.out.println("\n\nIncrementing date");

        while (x++ <= 10){
            for(int y = 0; y<=delay; y++)
                myDateTime.incrementDays();
            myDateTime.printDate();
        }        
    }    
}
