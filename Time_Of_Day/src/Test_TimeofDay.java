import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_TimeofDay {

	
	
	@Test
	void testTimeofDay() {
		
		Time_of_Day timeofday1=new Time_of_Day(22,45);
		timeofday1.setHours(22);
		timeofday1.setMinutes(45);
		assertEquals(22, timeofday1.getHours());
		assertEquals(45,timeofday1.getMinutes());
		assertEquals(1365,timeofday1.getMinutesMidnight());
		
		
		timeofday1.setHours(20);
		timeofday1.setMinutes(45);
		assertEquals(20, timeofday1.getHours());
		assertEquals(45,timeofday1.getMinutes());
		assertEquals(1245,timeofday1.getMinutesMidnight());
		
		
	
		timeofday1.setMinutes(30);
		assertEquals(20, timeofday1.getHours());
		assertEquals(30,timeofday1.getMinutes());
		assertEquals(1230,timeofday1.getMinutesMidnight());
		
		
	}
	
	

}
