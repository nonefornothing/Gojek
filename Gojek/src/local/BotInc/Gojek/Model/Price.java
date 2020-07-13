package local.BotInc.Gojek.Model;

public class Price {

	private int tripFare;
	private int platformFee;
	private int subtotal;
	private int tip;
	private int total;
	private int gopayPayment;
	private int foodFee;
	
	public Price(int tripFare,int platformFee,int subtotal,int tip,int total,int gopayPayment) {
		this.tripFare = tripFare;
		this.platformFee = platformFee;
		this.subtotal = subtotal;
		this.tip = tip;
		this.total = total;
		this.gopayPayment = gopayPayment;
	}
	
	public Price(int tripFare,int platformFee,int subtotal,int tip,int total,int gopayPayment,int foodFee) {
		this.tripFare = tripFare;
		this.platformFee = platformFee;
		this.subtotal = subtotal;
		this.tip = tip;
		this.total = total;
		this.gopayPayment = gopayPayment;
		this.foodFee = foodFee;
	}
	
	public int getTip() {
		return tip;
	}
	public void setTip(int tip) {
		this.tip = tip;
	}
	public int getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}
	public int getPlatformFee() {
		return platformFee;
	}
	public void setPlatformFee(int platformFee) {
		this.platformFee = platformFee;
	}
	public int getTripFare() {
		return tripFare;
	}
	public void setTripFare(int tripFare) {
		this.tripFare = tripFare;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getGopayPayment() {
		return gopayPayment;
	}

	public void setGopayPayment(int gopayPayment) {
		this.gopayPayment = gopayPayment;
	}

	public int getFoodFee() {
		return foodFee;
	}

	public void setFoodFee(int foodFee) {
		this.foodFee = foodFee;
	}
	
}