package chap3;

public class FuelTankMonitoringWith extends FuelTankMonitoring{
	protected boolean checkFuelTank() {
		return super.checkFuelTank();
	}
	protected void giveWarningSignal() {}
}
