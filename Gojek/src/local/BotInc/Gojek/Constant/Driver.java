package local.BotInc.Gojek.Constant;

public enum Driver {

	DRIVER1(1, "Riado Alexander Sitorus", "B 96 BC", "Honda Beats"),
	DRIVER2(2, "Imam Darto", "B 1962 ZC", "Jupiter MX"),
	DRIVER3(3, "Dirgantara Lovitura", "B 116 JC", "Harley Davidson Seri 2000"),
	DRIVER4(4, "Anastasius DaLovez", "B 2000 XXX", "Ducati 2001"),
	DRIVER5(5, "Tahan Nadeak", "B 2222 BC", "Subaru 9990");

	public int no;
	public String namaDriver, noPlat, tipeKendaraan;

	private Driver(int no, String namaDriver, String noPlat, String tipeKendaraan) {
		this.no = no;
		this.namaDriver = namaDriver;
		this.noPlat = noPlat;
		this.tipeKendaraan = tipeKendaraan;
	}

}
