package local.BotInc.Gojek.Service;

import local.BotInc.Gojek.Model.*;

public class GoSendService extends DateService implements BaseService {

	private String nameSender, nameReceiver, currentLoc, destinationLoc, nameItem, typeItem;
	private float weightItem;
	private int gopayIdentify, tip, rate;
	private int tripFare, subtotal, total, gopayPayment;

	public GoSendService(int gopayIdentify,String nameSender, String nameReceiver, String currentLoc, String destinationLoc,
			String nameItem, String typeItem, float weightItem,int tip, int rate) {
		this.gopayIdentify = gopayIdentify;
		this.nameSender = nameSender;
		this.nameReceiver = nameReceiver;
		this.currentLoc = currentLoc;
		this.destinationLoc = destinationLoc;
		this.nameItem = nameItem;
		this.typeItem = typeItem;
		this.weightItem = weightItem;
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

	public CustomerGoSend getCustomer(String nameSender, String nameReceiver, String currentLoc, String destinationLoc,
			String nameItem, String typeItem, float weightItem) {
		CustomerGoSend customer = new CustomerGoSend(nameSender, nameReceiver, currentLoc, destinationLoc, nameItem,
				typeItem, weightItem);
		return customer;
	}

	public Price getPrice(int TripFare, int platformFee, int subtotal, int tip, int total, int gopayPayment) {
		Price price = new Price(TripFare, platformFee, subtotal, tip, total, gopayPayment);
		return price;
	}

	public Integer totalAmount(String currentLoc, String destinationLoc, float weightItem, Integer defaultAmount) {
		Integer condition1 = currentLoc.length();
		Integer condition2 = destinationLoc.length();
		return (int) ((condition1 + condition2) * defaultAmount * weightItem);
	}

	public String cetak() {
		Driver driver = getDrivers();
		CustomerGoSend customer = getCustomer(nameSender, nameReceiver, currentLoc, destinationLoc, nameItem, typeItem,
				weightItem);
		tripFare = totalAmount(currentLoc, destinationLoc, weightItem, defaultAmount);
		subtotal = tripFare + platformFee;
		total = subtotal + tip;
		gopayPayment = total - getGopayDiscount();
		Price price = getPrice(tripFare, platformFee, subtotal, tip, total, gopayPayment);
		StringBuilder sb = new StringBuilder();
		sb.append("\n________________Details transaction________________");
		sb.append("\nGoRide ordered at " + getDate());
		sb.append("\n___________________________________________________");
		sb.append("\nDriver Details\n");
		sb.append(driver.getNama() + "\n");
		sb.append(driver.getTipeKendaraan() + " | " + driver.getPlatNo());
		sb.append("\nRating " + rate + " star");
		sb.append("\n===========================");
		sb.append("\nTrip Details\n");
		sb.append(customer.getNameSender() + " send to " + customer.getNameReceiver());
		sb.append("\nFrom          : " + customer.getCurrentLoc());
		sb.append("\nTo            : " + customer.getDestinationLoc());
		sb.append("\n===========================");
		sb.append("\nItem Details");
		sb.append("\nItem name : " + customer.getNameItem());
		sb.append("\nType name : " + customer.getTypeItem());
		sb.append("\nWeight Item : " + customer.getWeightItem());
		sb.append("\n===========================");
		sb.append("\nPayment Details");
		sb.append("\nTrip Fare     : " + price.getTripFare());
		sb.append("\nPlatform fee  : " + price.getPlatformFee());
		sb.append("\nSubtotal      : " + price.getSubtotal());
		if (tip != 0) {
			sb.append("\nTip           : " + price.getTip());
		}
		sb.append("\n-----------------------------");
		sb.append("\nTotal         : " + price.getTotal());
		sb.append("\n-----------------------------");
		if (gopayIdentify == 1) {
			sb.append("\nPaid with GoPay : " + price.getGopayPayment());
		}
		sb.append("\n___________________________________________________\n");
		sb.append(says());
		return sb.toString();
	}

}
