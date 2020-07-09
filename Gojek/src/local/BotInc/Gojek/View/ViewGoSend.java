package local.BotInc.Gojek.View;

import java.util.Scanner;

import local.BotInc.Gojek.Controller.*;

public class ViewGoSend extends BaseView {

	@Override
	public void show() {
		System.out.println("==== Welcome to Go-Send by " + super.brandName + " ====");
		Scanner input = new Scanner(System.in);
		System.out.print("Input your location : ");
		String currentLoc = input.nextLine();
		System.out.print("Input your destination : ");
		String destinationLoc = input.nextLine();
		System.out.print("Input name of item : ");
		String nameItem = input.nextLine();
		System.out.print("Input type of item : ");
		String typeItem = input.nextLine();
		System.out.print("Input weight of item (kg): ");
		float weightItem = getAnFloat();

		System.out.println("Finding driver....");
		System.out.println("Driver Found");

		GoSendController gosend = new GoSendController(currentLoc, destinationLoc,nameItem,typeItem,weightItem);
		System.out.println(gosend.cetak());
		
		input.nextLine();
		System.out.print("Repeat [y or n] : ");
		String repeat = input.nextLine();
		if ("y".equalsIgnoreCase(repeat)) {
			show();
		} else {
			new ViewMain();
		}
	}
}
