package local.BotInc.Gojek.Controller;

import local.BotInc.Gojek.Service.GoFoodService;

public class GoFoodController extends BaseController {
	
	private String namaCustomer,alamatCustomer,namaRestaurant, alamatRestaurant,namaMenu;
	private int hargaMenu,jlhPesanan;
	private GoFoodService goFoodService;
	private int gopayIdentify,tip,rate;
	
	public GoFoodController(int gopayIdentify,String namaCustomer,  String alamatCustomer, String namaRestaurant, String alamatRestaurant, String namaMenu, int hargaMenu, int jlhPesanan,int tip,int rate) {
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
		this.goFoodService = new GoFoodService(gopayIdentify,namaCustomer,  alamatCustomer, namaRestaurant, alamatRestaurant, namaMenu, hargaMenu, jlhPesanan,tip,rate);
	}
	
	@Override
	public String start() {
		return this.goFoodService.cetak();
	}
	
}
