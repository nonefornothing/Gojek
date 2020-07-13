package local.BotInc.Gojek.View;

import java.util.List;
import local.BotInc.Gojek.Controller.HistoryController;

public class ViewMain extends BaseView {

	private List<String> listHistory;
	
	public ViewMain(List<String> listHistory) {
		this.listHistory = listHistory;
		show();
	}

	@Override
	public void show() {
		System.out.println("\n==== GO-JEK ====");
		System.out.println("1. Go-Ride");
		System.out.println("2. Go-Food");
		System.out.println("3. Go-Send");
		System.out.println("4. History");
		System.out.println("5. Exit");
		System.out.print("Select menus [1-5] : ");

		do {
			
			int pil = getAnInteger();
			if (pil == 1) {
				new ViewGoRide(listHistory);
			} else if (pil == 2) {
				new ViewGoFood(listHistory);
			} else if (pil == 3) {
				new ViewGoSend(listHistory);
			} else if (pil == 4) {
				new HistoryController(listHistory);
			} else if (pil == 5) {
				input.close();
				System.exit(0);
			}else {
				System.out.println("input out of range");
			}
			
		}while(true);

	}
}
