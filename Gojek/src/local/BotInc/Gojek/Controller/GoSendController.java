package local.BotInc.Gojek.Controller;

import local.BotInc.Gojek.Service.GoSendService;

public class GoSendController extends BaseController  {

	private String nameSender,nameReceiver,currentLoc, destinationLoc,nameItem,typeItem;
	private float weightItem;
	private GoSendService goSendService;
	private int gopayIdentify,tip,rate;

	public GoSendController(int gopayIdentify,String nameSender,String nameReceiver,String currentLoc, String destinationLoc,String nameItem, String typeItem, float weightItem,int tip,int rate) {
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
		this.goSendService = new GoSendService(gopayIdentify,nameSender,nameReceiver,currentLoc, destinationLoc, nameItem, typeItem, weightItem,tip,rate);
	}

	@Override
	public String start() {
		return this.goSendService.cetak();
	}

}
