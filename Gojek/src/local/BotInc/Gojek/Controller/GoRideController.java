package local.BotInc.Gojek.Controller;

import local.BotInc.Gojek.Service.GoRideService;

public class GoRideController extends BaseController {

	private String nameCustomer,currentLoc, destinationLoc;
	private GoRideService goRideService;
	private int gopayIdentify,tip,rate;
	
	public GoRideController(int gopayIdentify, String nameCustomer, String currentLoc, String destinationLoc, int tip,int rate) {
		this.gopayIdentify = gopayIdentify;
		this.nameCustomer = nameCustomer;
		this.currentLoc = currentLoc;
		this.destinationLoc = destinationLoc;
		this.tip = tip;
		this.rate = rate;
		this.goRideService = new GoRideService(gopayIdentify,nameCustomer,currentLoc, destinationLoc,tip,rate);
	}

	@Override
	public String start() {
		return this.goRideService.cetak();
	}

}