package local.BotInc.Gojek.Constant;

public enum Restaurant {

	BGIWAN1(1, "Restoran Bang Iwan", "Jl. Karet Kuningan No 18 Jakarta Selatan", "Nasi Goreng Daging", 28000),
	BGIWAN2(2, "Restoran Bang Iwan", "Jl. Karet Kuningan No 18 Jakarta Selatan", "Mie Tumis Daging", 30000),
	BGIWAN3(3, "Restoran Bang Iwan", "Jl. Karet Kuningan No 18 Jakarta Selatan", "Nasi Goreng Ayam", 17000),
	BGIWAN4(4, "Restoran Bang Iwan", "Jl. Karet Kuningan No 18 Jakarta Selatan", "Indomei Rebus Special", 39000),
	OTOY1(1, "Restoran Otoy", "Jl. Dr Sutomo No 12 Jakarta Barat", "Paket Ayam Komplit", 47000),
	OTOY2(2, "Restoran Otoy", "Jl. Dr Sutomo No 12 Jakarta Barat", "Paket Empal Komplit", 49000),
	OTOY3(3, "Restoran Otoy", "Jl. Dr Sutomo No 12 Jakarta Barat", "Semur Tempe dan Tahu", 7000),
	OTOY4(4, "Restoran Otoy", "Jl. Dr Sutomo No 12 Jakarta Barat", "Ikan Mas Bakar", 22000),
	IbuAzka1(1, "Restoran Ibu Azka", "Jl. Kemerdekaan No 45 Jakarta Utara", "Paket Ayam Paha Goreng", 23000),
	IbuAzka2(2, "Restoran Ibu Azka", "Jl. Kemerdekaan No 45 Jakarta Utara", "Paket Ayam Dada Goreng", 24000),
	IbuAzka3(3, "Restoran Ibu Azka", "Jl. Kemerdekaan No 45 Jakarta Utara", "Gurame Goreng", 27000),
	IbuAzka4(4, "Restoran Ibu Azka", "Jl. Kemerdekaan No 45 Jakarta Utara", "Kerang Ijo Saos Padang", 25000),
	MIEACEH1(1, "Restoran Mie Aceh", "Jl. BanjarGebang No 5 Jakarta Timur", "Mie Aceh Goreng Telur", 21000),
	MIEACEH2(2, "Restoran Mie Aceh", "Jl. BanjarGebang No 5 Jakarta Timur", "Nasi Goreng Aceh Telur", 22000),
	MIEACEH3(3, "Restoran Mie Aceh", "Jl. BanjarGebang No 5 Jakarta Timur", "Mie Aceh Tumis Telur", 27000),
	MIEACEH4(4, "Restoran Mie Aceh", "Jl. BanjarGebang No 5 Jakarta Timur", "Martabak Telur", 10000);

	public int no, harga;
	public String namaRestaurant, namaMenu,alamatRestaurant;

	private Restaurant(int no, String namaRestaurant,String alamatRestaurant ,String namaMenu, int harga) {
		this.no = no;
		this.namaRestaurant = namaRestaurant;
		this.alamatRestaurant = alamatRestaurant;
		this.namaMenu = namaMenu;
		this.harga = harga;
	}

}
