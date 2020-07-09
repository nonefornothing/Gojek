package local.BotInc.Gojek.Controller;

import local.BotInc.Gojek.Service.GoFoodService;

public class GoFoodController extends BaseController {
	
	private String namaCustomer,currentLoc,namaRestaurant, alamatRestaurant,namaMenu;
	private int hargaMenu,jlhPesanan;
	private GoFoodService goFoodService;
	
	public GoFoodController(String namaCustomer,  String currentLoc, String namaRestaurant, String alamatRestaurant, String namaMenu, int hargaMenu, int jlhPesanan) {
		this.namaCustomer = namaCustomer;
		this.currentLoc = currentLoc;
		this.namaRestaurant = namaCustomer;
		this.alamatRestaurant = alamatRestaurant;
		this.namaMenu = namaMenu;
		this.hargaMenu = hargaMenu;
		this.jlhPesanan = jlhPesanan;
		this.goFoodService = new GoFoodService();
	}
	
	
	@Override
	protected String start() {
		return this.goFoodService.cetak(namaCustomer, currentLoc, namaRestaurant , alamatRestaurant , namaMenu , hargaMenu, jlhPesanan);
	}
	
}
