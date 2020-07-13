package local.BotInc.Gojek.Service;

import local.BotInc.Gojek.Model.Driver;

public class GoRideService extends DateService implements BaseService {

	private String nameCustomer, currentLoc, destinationLoc;
	private int gopayIdentify, tip,rate;
	private int tripFare, subtotal, total;
	
	public GoRideService(int gopayIdentify, String nameCustomer, String currentLoc, String destinationLoc, int tip,int rate) {
		this.gopayIdentify = gopayIdentify;
		this.nameCustomer = nameCustomer;
		this.currentLoc = currentLoc;
		this.destinationLoc = destinationLoc;
		this.tip = tip;
		this.rate = rate;
	}

	@Override
	public Driver getDrivers() {
		Driver driver = new Driver();
		driver.setNama("Riado Alexander Sitorus");
		driver.setPlatNo("B 69 ABC");
		driver.setTipeKendaraan("Honda Beats");
		return driver;
	}

	@Override
	public String says() {
		return "=== Thanks you for using GoRide Service ===";
	}

	// if using gopay , got discount 10% from subtotal
	public int getGopayDiscount() {
		return subtotal / 10;
	}

	public Integer totalAmount(String currentLoc, String destinationLoc, Integer defaultAmount) {
		int condition1 = currentLoc.length();
		int condition2 = destinationLoc.length();
		return (condition1 + condition2) * defaultAmount;
	}

	public String cetak() {
		Driver driver = getDrivers();
		tripFare = totalAmount(currentLoc, destinationLoc, defaultAmount);
		subtotal = tripFare + platformFee;
		total = subtotal + tip;
		StringBuilder sb = new StringBuilder();
		sb.append("\n________________Details transaction________________");
		sb.append("\nGoRide ordered at " + getDate());
		sb.append("\n___________________________________________________");
		sb.append("\nDriver Details\n");
		sb.append(driver.getNama() + "\n");
		sb.append(driver.getTipeKendaraan() + " | " + driver.getPlatNo());
		sb.append("\nRating " + rate + " star");
		sb.append("\n===========================");
		sb.append("\nTrip Details");
		sb.append("\nCustomer name : " + nameCustomer);
		sb.append("\nFrom          : " + currentLoc);
		sb.append("\nTo            : " + destinationLoc);
		sb.append("\n===========================");
		sb.append("\nPayment Details");
		sb.append("\nTrip Fare     : " + tripFare);
		sb.append("\nPlatform fee  : " + platformFee);
		sb.append("\nSubtotal      : " + subtotal);
		if (tip != 0) {
			sb.append("\nTip           : " + tip);
		}
		sb.append("\n-----------------------------");
		sb.append("\nTotal         : " + total);
		sb.append("\n-----------------------------");
		if (gopayIdentify == 1) {
			sb.append("\nPaid with GoPay : " + (total - getGopayDiscount()));
		}
		sb.append("\n___________________________________________________\n");
		sb.append(says());
		return sb.toString();
	}

}
