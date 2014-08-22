package chap3;

import java.util.Calendar;

public class FakeTimeProvider implements TimeProvider {
	private Calendar cal;
	
	public FakeTimeProvider() {
		cal = cal.getInstance();
	}
	
	public FakeTimeProvider(int hours) {
		cal = cal.getInstance();
		setHours(hours);
	}
	
	public void setHours(int hours) {
		cal.set(Calendar.HOUR_OF_DAY, hours);
	}
	
	public int getTime() {
		return cal.get(Calendar.HOUR_OF_DAY);
	}
}
