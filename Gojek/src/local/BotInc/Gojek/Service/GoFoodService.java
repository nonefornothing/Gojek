package local.BotInc.Gojek.Service;

import local.BotInc.Gojek.Model.CustomerGoFood;
import local.BotInc.Gojek.Model.Driver;
import local.BotInc.Gojek.Model.Price;

public class GoFoodService extends DateService implements BaseService {

	private String namaCustomer,alamatCustomer,namaRestaurant, alamatRestaurant,namaMenu;
	private int hargaMenu,jlhPesanan;
	private int tripFare, subtotal, total, gopayPayment, foodFee;
	private int gopayIdentify,tip,rate;

	public GoFoodService(int gopayIdentify, String namaCustomer, String alamatCustomer, String namaRestaurant,
			String alamatRestaurant, String namaMenu, int hargaMenu, int jlhPesanan, int tip, int rate) {
		this.gopayIdentify = gopayIdentify;
		this.namaCustomer = namaCustomer;
		this.alamatCustomer = alamatCustomer;
		this.namaRestaurant = namaCustomer;
		this.alamatRestaurant = alamatRestaurant;
		this.namaMenu = namaMenu;
		this.hargaMenu = hargaMenu;
		this.jlhPesanan = jlhPesanan;
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

	public CustomerGoFood getCustomer(String namaCustomer, String alamatCustomer, String namaRestaurant,
			String alamatRestaurant, String namaMenu, int hargaMenu, int jlhPesanan) {
		CustomerGoFood customer = new CustomerGoFood(namaCustomer, alamatCustomer, namaRestaurant, alamatRestaurant,
				namaMenu, hargaMenu, jlhPesanan);
		return customer;
	}

	public Price getPrice(int TripFare, int platformFee, int subtotal, int tip, int total, int gopayPayment, int foodFee) {
		Price price = new Price(TripFare, platformFee, subtotal, tip, total, gopayPayment,foodFee);
		return price;
	}

	public Integer calculatetripFare(String currentLoc, String destinationLoc, Integer defaultAmount) {
		Integer condition1 = currentLoc.length();
		Integer condition2 = destinationLoc.length();
		return ((condition1 + condition2) * defaultAmount);
	}

	public Integer calculateFoodFee(int hargaMenu, int jlhPesanan) {
		return hargaMenu * jlhPesanan;
	}

	// if using gopay , got discount 10% from subtotal
	public int getGopayDiscount() {
		return subtotal / 10;
	}

	public String cetak() {
		Driver driver = getDrivers();
		CustomerGoFood customer = getCustomer(namaCustomer, alamatCustomer, namaRestaurant, alamatRestaurant, namaMenu,
				hargaMenu, jlhPesanan);
		tripFare = calculatetripFare(alamatCustomer, alamatRestaurant, defaultAmount);
		System.out.println(tripFare);
		foodFee = calculateFoodFee(hargaMenu,jlhPesanan);
		System.out.println(foodFee);
		subtotal = tripFare + platformFee + foodFee;
		total = subtotal + tip;
		gopayPayment = total - getGopayDiscount();
		Price price = getPrice(tripFare, platformFee, subtotal, tip, total, gopayPayment,foodFee);
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
		sb.append("\nFood Ordered by " + customer.getNamaCustomer() + " from " + customer.getNamaRestaurant());
		sb.append("\nFrom          : " + customer.getAlamatRestaurant());
		sb.append("\nTo            : " + customer.getAlamatCustomer());
		sb.append("\n===========================");
		sb.append("\nItem Details");
		sb.append("\nMenu name : " + customer.getNamaMenu());
		sb.append("\nprice of menu (pcs): " + customer.getHargaMenu());
		sb.append("\nAmount of menu : " + customer.getJlhPesanan());
		sb.append("\n===========================");
		sb.append("\nPayment Details");
		sb.append("\nFood Fare     : " + price.getFoodFee());
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
