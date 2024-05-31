


/**
 * @invar|getHours()>0 && getHours()<24
 * @invar|getMinutes()>0 && getMinutes()<60
 * @invar|getMinutesMidnight()==getHours()*60+getMinutes()
 */
public class Time_of_Day {
			
	/**
	 * @invar|minutes<60 && minutes>0
	 * @invar|hours<24 &&hours>0
	 * 
	 * 
	 */
	private int minutes;
	private int hours;
	private int minutesMidnight;
	
	
	/**
	 * 
	 *
	 *@throws IllegalArgumentException | initialHours<0||initialHours >=24
	 *@throws IllegalArgumentException | initialMinutes<0 ||initialMinutes>=60
	 *
	 *@post|getHours()==initialHours
	 *@post|getMinutes()==initialMinutes
	 *
	 */
	public Time_of_Day(int initialHours,int initialMinutes) {	
		if (initialHours<0 || initialHours>24) {
			throw new IllegalArgumentException ("Invalid Hours given");}
		if (initialMinutes<0||initialMinutes>60) {throw new IllegalArgumentException("Invalid minutes given");}
		
		this.hours=initialHours;
		this.minutes=initialMinutes;
		}
	
	
public int getHours() {
	return this.hours;
}
	
public int getMinutes() {
	return this.minutes;
}
	
	
public int getMinutesMidnight() {
	return this.minutesMidnight=getHours()*60+getMinutes();
}
	
	
/**
 * 
 * @throws IllegalArgumentException|hours<0||hours>=24
 * @mutates|this
 * @post|getHours()==hours
 * @post|getMinutes()==old(getMinutes())
 * 
 */
public void setHours(int hours) {
	if (hours<0 || hours>=24) {
		throw new IllegalArgumentException ("Invalid Hours given");}
	this.hours=hours;
}
	
/**
 * @throws IllegalArgumentException|minutes<0 ||minutes>=60
 * @mutates|this
 * @post|getMinutes()==minutes
 * @post|getHours()==old(getHours())
 * 
 */
public void setMinutes(int minutes) {
	if (minutes<0||minutes>60) {throw new IllegalArgumentException("Invalid minutes given");}
	this.minutes=minutes;
}
	
/**
 * 
 * @throws IllegalArgumentException|minutesMidnight<0||minutesMidnight>(24*60)
 * @mutates|this
 * @post|getHours()==old(getHours())
 * @post|getMinutes()==old(getMinutes())
 * @post|getMinutesMidnight()==minutesMidnight
 * 
 * 
 */
public void setMinutesMidnight(int minutesMidnight) {
	if(minutesMidnight<0 ||minutesMidnight>(24*60)) {
		throw new IllegalArgumentException("Invalid minutes till midnight given");}
		hours=minutesMidnight/60;
		minutes=minutesMidnight%60;
	}
}






