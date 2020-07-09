package local.BotInc.Gojek.Service;

import local.BotInc.Gojek.Model.Driver;

public class GoRideService implements BaseService {

	@Override
	public Driver getDrivers() {
		Driver driver = new Driver();
		driver.setNama("imam");
		driver.setPlatNo("B 123 ABC");

		return driver;
	}

	public Integer totalAmount(String currentLoc, String destinationLoc, Integer defaultAmount) {
		int condition1 = currentLoc.length();
		int condition2 = destinationLoc.length();
		return condition1 * condition2 * defaultAmount;
	}

	@Override
	public String says() {
		return "=== Thanks ===";
	}
	
	
	public String cetak(String currentLoc, String destinationLoc, Integer defaultAmount) {
		Driver driver = getDrivers();
		StringBuilder sb = new StringBuilder();
		sb.append("\n=== Details ===");
		sb.append("\nDriver name : " + driver.getNama());
		sb.append("\nPlat no : " + driver.getPlatNo());
		sb.append("\nAmount : " + totalAmount(currentLoc, destinationLoc, defaultAmount));
		sb.append("\nFrom : " + currentLoc);
		sb.append("\nTo : " + destinationLoc + "\n");
		sb.append(says());

		return sb.toString();
	}

}
