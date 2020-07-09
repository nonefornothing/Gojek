package local.BotInc.Gojek.Controller;

import local.BotInc.Gojek.Service.*;
import local.BotInc.Gojek.Model.*;

public class GoRideController extends BaseController implements StrukService {

	private String currentLoc, destinationLoc;

	public GoRideController(String currentLoc, String destinationLoc) {
		this.currentLoc = currentLoc;
		this.destinationLoc = destinationLoc;
	}
	
	@Override
	public Driver getDrivers() {
		Driver driver = new Driver();
		driver.setNama("imam");
		driver.setPlatNo("B 123 ABC");
		return driver;
	}

	@Override
	public String cetak() {
		Driver driver = getDrivers();
		StringBuilder sb = new StringBuilder();
		sb.append("\n=== Details ===");
		sb.append("\nDriver name : " + driver.getNama());
		sb.append("\nPlat no : " + driver.getPlatNo());
		sb.append("\nAmount : " + totalAmount());
		sb.append("\nFrom : " + currentLoc);
		sb.append("\nTo : " + destinationLoc + "\n");
		sb.append(says());

		return sb.toString();
	}

	@Override
	public Integer totalAmount() {
		int condition1 = currentLoc.length();
		int condition2 = destinationLoc.length();
		return condition1 * condition2 * defaultAmount;
	}

	@Override
	public String says() {
		return "=== Thanks ===";
	}

}