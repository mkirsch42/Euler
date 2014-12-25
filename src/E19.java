
public class E19
{

	static void val(String val){}

	static Number run()
	{
		int year=1901;
		int month=1;
		int day=6;
		int daysInMonth=31;
		int firstSundays=0;
		while(year<2001)
		{
			if(month==4||month==6||month==9||month==11)
			{
				daysInMonth=30;
			}
			else if(month==2)
			{
				if(year%4==0)
				{
					daysInMonth=29;
				}
				else
				{
					daysInMonth=28;
				}
			}
			else
			{
				daysInMonth = 31;
			}
			
			while(day<=daysInMonth)
			{
				day+=7;
			}
			
			day-=daysInMonth;
			if(day==1)
			{
				firstSundays++;
			}
			
			month++;
			if(month>12)
			{
				year++;
				month=1;
			}
		}
		return firstSundays;
	}
	
}
