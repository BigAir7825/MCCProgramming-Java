package adairassignment7;

/**
 * Author:   Hugh Schuett  
 * Date:   6-20-2017  
 * Requirements:  
 *  
 * This is the class that just runs the ClockApp  
 *  
 */
public class Clock
{
	private int hours;
	private int minutes;
	private int seconds;

	public Clock()
	{
                super();
		hours = 0;
		minutes = 0;
		seconds = 0;
	}

	public Clock(int h, int m, int s)
	{
		setTime(h, m, s);
	}
  
	void setTime(int h, int m, int s)
	{
		if (h>=0 && h<24)
			this.hours = h;
		else
			this.hours = 0;

		if (m>=0 && m<60)
			this.minutes = m;
		else
			this.minutes = 0;

		if (s>=0 && s<60)
			this.seconds = s;
		else
			this.seconds = 0;
	}

	void printTime()
	{
			System.out.println("The time is " + hours + ":" + minutes 
                                + ":" + seconds);
	}

	public void getTime(int[] time)
	{
			time[0] = hours;
			time[1] = minutes;
			time[2] = seconds;
	}

	public boolean equalTime(Clock otherClock)
	{
		return (hours == otherClock.hours && minutes == otherClock.minutes 
                        && seconds == otherClock.seconds);
	}
        
	void incrementSeconds()
	{
		seconds++;

		if (seconds == 60)
		{
			seconds = 0;
			incrementMinutes();
		}
	}

	void incrementMinutes()
	{
		minutes++;

		if (minutes == 60)
		{
			minutes = 0;
			incrementHours();
		}
	}

	void incrementHours()
	{
		hours++;

		if (hours == 24)
			hours = 0;
	}



}
