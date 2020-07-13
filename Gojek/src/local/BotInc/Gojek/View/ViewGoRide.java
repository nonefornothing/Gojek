package local.BotInc.Gojek.View;

import java.util.List;
import local.BotInc.Gojek.Controller.GoRideController;

public class ViewGoRide extends BaseView {

	private List<String> listHistory;

	public ViewGoRide(List<String> listHistory) {
		this.listHistory = listHistory;
		show();
	}

	@Override
	public void show() {
		System.out.println("==== Welcome to Go-Ride by " + super.brandName + " ====");
		System.out.print("Input your name : ");
		String nameCustomer = input.nextLine();
		System.out.print("Input your location : ");
		String currentLoc = input.nextLine();
		System.out.print("Input your destination : ");
		String destinationLoc = input.nextLine();

		int gopayIdentify;

		System.out.println("Do you want to use Gopay for payment ? [yes/no]");
		do {
			String gopayChoose = input.nextLine();
			if ("yes".equalsIgnoreCase(gopayChoose)) {
				gopayIdentify = 1;
				break;
			} else if ("no".equalsIgnoreCase(gopayChoose)) {
				gopayIdentify = 2;
				break;
			} else {
				System.out.println("input salah , input harus yes / no");
			}
		} while (true);

		System.out.println("Finding driver....");
		System.out.println("Driver Found");
		System.out.println("Customer on the way to location ...... ");
		System.out.println("Customer Arrived ......");
		System.out.println("Please rate your trip experince [1-5] : ");

		int rate;

		do {

			rate = getAnInteger();
			if (rate == 1 | rate == 2 | rate == 3 | rate == 4 | rate == 5) {
				break;
			} else {
				System.out.println("Input angka dari 1 - 5");
			}

		} while (true);

		input.nextLine();
		int tip;
		System.out.println("Do you want give tip to your driver ? [yes/no]");

		do {

			String tipChoose = input.nextLine();
			if ("yes".equalsIgnoreCase(tipChoose)) {
				System.out.println("How much do you want give ? ");
				tip = getAnInteger();
				break;
			} else if ("no".equalsIgnoreCase(tipChoose)) {
				tip = 0;
				break;
			} else {
				System.out.println("wrong input , input must yes or no");
			}

		} while (true);

		GoRideController goride = new GoRideController(gopayIdentify, nameCustomer, currentLoc, destinationLoc, tip,rate);
		String cetak = goride.start();
		listHistory.add(cetak);
		System.out.println(cetak);

		System.out.print("Do you want to using this service again [yes or no] : ");
		
		do {

			String repeat = input.nextLine();
			if ("yes".equalsIgnoreCase(repeat)) {
				show();
				break;
			} else if ("no".equalsIgnoreCase(repeat)){
				new ViewMain(listHistory);
				break;
			}else {
				System.out.println("wrong input , input must yes or no");
			}

		} while (true);

	}
}