package chap3;

public class FuelTankMonitoring {
	
	private boolean checkFuel;
	
	public void checkAndWarn() {
		if(checkFuelTank()) {
			giveWarningSignal();;
		}
	}
	
	protected boolean checkFuelTank() {
		return checkFuel;
	}
	protected void giveWarningSignal() {}
}
