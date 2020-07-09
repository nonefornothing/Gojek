package local.BotInc.Gojek.View;

import java.util.Scanner;

import local.BotInc.Gojek.Controller.GoRideController;

public class ViewGoRide extends BaseView {

	@Override
	public void show() {
		System.out.println("==== Welcome to Go-Ride by " + super.brandName + " ====");
		Scanner sc = new Scanner(System.in);
		System.out.print("Input your location : ");
		String currentLoc = sc.nextLine();
		System.out.print("Input your destination : ");
		String destinationLoc = sc.nextLine();
		
		System.out.println("Finding driver....");
		System.out.println("Driver Found");
		
		GoRideController goride = new GoRideController(currentLoc, destinationLoc);
		System.out.println(goride.cetak());
				
		System.out.print("Repeat [y or n] : ");
		String repeat = sc.nextLine();
		if("y".equalsIgnoreCase(repeat)) {
			show();
		}else {			
			new ViewMain();
		}
	}
}
