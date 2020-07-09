package local.BotInc.Gojek.Controller;

import local.BotInc.Gojek.Model.*;
import local.BotInc.Gojek.Service.*;

public class GoSendController extends BaseController implements StrukService {

	private String currentLoc, destinationLoc,nameItem,typeItem;
	private float weightItem;

	public GoSendController(String currentLoc, String destinationLoc,String nameItem, String typeItem,float weightItem) {
		this.currentLoc = currentLoc;
		this.destinationLoc = destinationLoc;
		this.nameItem = nameItem;
		this.typeItem = typeItem;
		this.weightItem = weightItem;
	}
	
	@Override
	public Driver getDrivers() {
		Driver driver = new Driver();
		driver.setNama("imam");
		driver.setPlatNo("B 123 ABC");

		return driver;
	}
	
	public Customer getCustomer() {
		Customer customer = new Customer();
		customer.setNameItem(nameItem);
		customer.setTypeItem(typeItem);
		customer.setWeightItem(weightItem);
		return customer;
	}

	@Override
	public String cetak() {
		Driver driver = getDrivers();
		Customer customer = getCustomer();
		StringBuilder sb = new StringBuilder();
		sb.append("\n=== Details ===");
		sb.append("\nDriver name : " + driver.getNama());
		sb.append("\nPlat no : " + driver.getPlatNo());
		sb.append("\nSend item from : " + currentLoc + " to " + destinationLoc);
		sb.append("\nItem name : " + customer.getNameItem());
		sb.append("\nType name : " + customer.getTypeItem());
		sb.append("\nWeight Item : " + customer.getWeightItem());
		sb.append("\nAmount : Rp." + totalAmount() + "\n");
		sb.append(says());

		return sb.toString();
	}

	@Override
	public Integer totalAmount() {
		Integer condition1 = currentLoc.length();
		Integer condition2 = destinationLoc.length();
		return (int) (condition1 * condition2 * defaultAmount * weightItem);
	}

	@Override
	public String says() {
		return "=== Thanks ===";
	}

}