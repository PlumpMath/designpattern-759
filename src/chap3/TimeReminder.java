package chap3;

public class TimeReminder {
	TimeProvider tProv;
	MP3 m = new MP3();
	
	public void setTimeProvider(TimeProvider tProv) {
		this.tProv = tProv;
	}
	
	public void reminder() {
		int hour = tProv.getTime();
		
		if(hour >= 22) {
			m.playSong();
		}
	}
}