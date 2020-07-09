package local.BotInc.Gojek.Service;

import local.BotInc.Gojek.Model.*;

public class GoSendService implements BaseService {
	
	private String currentLoc, destinationLoc,nameItem,typeItem;
	private float weightItem;
	
	@Override
	public Driver getDrivers() {
		Driver driver = new Driver();
		driver.setNama("imam");
		driver.setPlatNo("B 123 ABC");
		return driver;
	}
	
	public CustomerGoSend getCustomer(String nameItem, String typeItem, float weightItem) {
		CustomerGoSend customer = new CustomerGoSend();
		customer.setNameItem(nameItem);
		customer.setTypeItem(typeItem);
		customer.setWeightItem(weightItem);
		return customer;
	}
	
	

	public Integer totalAmount(String currentLoc, String destinationLoc,float weightItem ,Integer defaultAmount) {
		Integer condition1 = currentLoc.length();
		Integer condition2 = destinationLoc.length();
		return (int) (condition1 * condition2 * defaultAmount * weightItem);
	}

	@Override
	public String says() {
		return "=== Thanks ===";
	}

	public String cetak(String currentLoc, String destinationLoc, String nameItem, String typeItem, float weightItem, Integer defaultAmount) {
		Driver driver = getDrivers();
		CustomerGoSend customer = getCustomer(nameItem,typeItem,weightItem);
		StringBuilder sb = new StringBuilder();
		sb.append("\n=== Details ===");
		sb.append("\nDriver name : " + driver.getNama());
		sb.append("\nPlat no : " + driver.getPlatNo());
		sb.append("\nSend item from : " + currentLoc + " to " + destinationLoc);
		sb.append("\nItem name : " + customer.getNameItem());
		sb.append("\nType name : " + customer.getTypeItem());
		sb.append("\nWeight Item : " + customer.getWeightItem());
		sb.append("\nAmount : Rp." + totalAmount(currentLoc, destinationLoc, weightItem ,defaultAmount) + "\n");
		sb.append(says());

		return sb.toString();
	}

}
