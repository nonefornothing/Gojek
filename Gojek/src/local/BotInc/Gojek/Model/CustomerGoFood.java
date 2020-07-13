package local.BotInc.Gojek.Model;

public class CustomerGoFood {

	private String namaCustomer, alamatCustomer, namaRestaurant, alamatRestaurant, namaMenu;
	private int hargaMenu, jlhPesanan;

	public CustomerGoFood(String namaCustomer, String alamatCustomer, String namaRestaurant, String alamatRestaurant,
			String namaMenu, int hargaMenu, int jlhPesanan) {
		this.namaCustomer = namaCustomer;
		this.alamatCustomer = alamatCustomer;
		this.namaRestaurant = namaRestaurant;
		this.alamatRestaurant = alamatRestaurant;
		this.namaMenu = namaMenu;
		this.hargaMenu = hargaMenu;
		this.jlhPesanan = jlhPesanan;
	}

	public String getAlamatCustomer() {
		return alamatCustomer;
	}

	public void setAlamatCustomer(String alamatCustomer) {
		this.alamatCustomer = alamatCustomer;
	}

	public String getNamaCustomer() {
		return namaCustomer;
	}

	public void setNamaCustomer(String namaCustomer) {
		this.namaCustomer = namaCustomer;
	}

	public String getNamaRestaurant() {
		return namaRestaurant;
	}

	public void setNamaRestaurant(String namaRestaurant) {
		this.namaRestaurant = namaRestaurant;
	}

	public String getAlamatRestaurant() {
		return alamatRestaurant;
	}

	public void setAlamatRestaurant(String alamatRestaurant) {
		this.alamatRestaurant = alamatRestaurant;
	}

	public String getNamaMenu() {
		return namaMenu;
	}

	public void setNamaMenu(String namaMenu) {
		this.namaMenu = namaMenu;
	}

	public int getHargaMenu() {
		return hargaMenu;
	}

	public void setHargaMenu(int hargaMenu) {
		this.hargaMenu = hargaMenu;
	}

	public int getJlhPesanan() {
		return jlhPesanan;
	}

	public void setJlhPesanan(int jlhPesanan) {
		this.jlhPesanan = jlhPesanan;
	}

}
