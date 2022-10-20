package adairassignment7;
public class DateTime extends Clock{
    private int day;
    private int month;
    private int year;
    private int hours;
    private int minutes;
    private int seconds;
    
    // first constuctor
    
    public DateTime(){
        super();
        day=1;
        month=1;
        year=2000;
        hours=0;
        minutes=0;
        seconds=0;
    }
    
    // second constructor
    
    public DateTime(int day, int month, int year, int hours, int minutes, int seconds){
        this.day = day;
        this.month = month;
        this.year = year;
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    // set the date
    
    void setDate(int day, int month, int year){
        if (day>=1 && day<33)
            this.day = day;
        else
            this.day = 1;
        
        if (month>=1 && month<13)
            this.month = month;
        else
            this.month = 1;
        
        this.year = year;
    }
    
    // set the time
    
    @Override
    void setTime(int hours, int minutes, int seconds){
        super.setTime(hours, minutes, seconds);
    }
    
    // print the time
    
    @Override
    void printTime(){
        super.printTime();
    }
    
    // print the date
    
    void printDate(){
        System.out.println("The date is " + day + "-" + month + "-" + year);
    }
    
    // print the date and time
    
    void printDateTime(){
        System.out.println("The time is " + hours + ":" + minutes + ":" + seconds + " On " + day + "-" + month + "-" + year);
    }
    
    // increment the seconds
    
    @Override
    void incrementSeconds(){
        super.incrementSeconds();
    }
    
    // increment the minutes
    
    @Override
    void incrementMinutes(){
        super.incrementMinutes();
    }
    
    // increment the hours
    
    @Override
    void incrementHours(){
        super.incrementHours();
    }
    
    // compares times
    
    boolean equalTime(DateTime otherClock){
     return (hours == otherClock.hours && minutes == otherClock.minutes && seconds == otherClock.seconds);    
    }
    
    // increment the days
    
    void incrementDays(){
        day++;
        if (day == 31){
            day = 1;
            incrementMonths();
        }
        if (day == 31 && month == 12 && year == 2009){
            day = 1;
            month = 1;
            year = 9010;
        }
    }
    
    // increment the months
    
    void incrementMonths(){
        month++;
        if (month == 12){
            month = 1;
            incrementYears();
        }
        if (day == 31 && month == 12 && year == 2009){
            day = 31;
            month = 1;
            year = 9010;
        }
    }
    
    // increment the years
    
    void incrementYears(){
        year++;
    }
    
    // compares dates
    
    boolean equalDate(DateTime otherDate){
        return (year == otherDate.year && month == otherDate.month && day == otherDate.day);
    }
}
