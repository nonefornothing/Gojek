package local.BotInc.Gojek.Model;

public class CustomerGoSend {

	private String nameSender,nameReceiver;
	private String currentLoc,destinationLoc;
	private String nameItem,typeItem;
	private float weightItem;
	
	//constructor untuk inisialisasi awal 
	public CustomerGoSend (String nameSender,String nameReceiver,String currentLoc,String destinationLoc,String nameItem,String typeItem,float weightItem) {
		this.nameSender = nameSender;
		this.nameReceiver = nameReceiver;
		this.currentLoc = currentLoc;
		this.destinationLoc = destinationLoc;
		this.nameItem = nameItem;
		this.typeItem = typeItem;
		this.weightItem = weightItem;
	}
	
	
	//set digunakan untuk fungsi update kedepannya
	public void setNameItem(String nameItem) {
		this.nameItem = nameItem;
	}
	
	public void setTypeItem(String typeItem) {
		this.typeItem = typeItem;
	}
	
	public void setWeightItem(float weightItem) {
		this.weightItem = weightItem;
	}
	
	public String getNameItem() {
		return nameItem;
	}
	
	public String getTypeItem() {
		return typeItem;
	}
	
	public float getWeightItem() {
		return weightItem;
	}

	public String getNameReceiver() {
		return nameReceiver;
	}

	public void setNameReceiver(String nameReceiver) {
		this.nameReceiver = nameReceiver;
	}

	public String getNameSender() {
		return nameSender;
	}

	public void setNameSender(String nameSender) {
		this.nameSender = nameSender;
	}

	public String getCurrentLoc() {
		return currentLoc;
	}

	public void setCurrentLoc(String currentLoc) {
		this.currentLoc = currentLoc;
	}

	public String getDestinationLoc() {
		return destinationLoc;
	}

	public void setDestinationLoc(String destinationLoc) {
		this.destinationLoc = destinationLoc;
	}
	
}
