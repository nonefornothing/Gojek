package local.BotInc.Gojek.Model;

public class Customer {

	private String nameItem;
	private String typeItem;
	private float weightItem;
	
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
	
}
