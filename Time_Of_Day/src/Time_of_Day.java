



public class Time_of_Day {
			
	/**
	 * @invar|minutes<60 && minutes>0
	 * @invar|hours<24 &&hours>0
	 * @invar|minutesMidnight>0 && minutesMidnight <(24*60)
	 */
	private int minutes;
	private int hours;
	private int minutesMidnight;
	
	
	
	public Time_of_Day(int initialHours,int initialMinutes) {	
		initialHours=hours;
		initialMinutes=minutes;
		
	}
	
	
public int getHours() {
	return this.hours;
}
	
public int getMinutes() {
	return this.minutes;
}
	
	
public int getMinutesMidnight() {
	return this.minutesMidnight;
}
	
	
	
public void setHours(int hours) {
	this.hours=hours;
}
	
public void setMinutes(int minutes) {
	this.minutes=minutes;
}
	
public void setMinutesMidnight(int minutesMidnight) {
	throw new RuntimeException("Not yet implemented");
}





}
