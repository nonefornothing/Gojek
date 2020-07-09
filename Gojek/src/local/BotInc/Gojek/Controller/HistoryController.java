package local.BotInc.Gojek.Controller;

import java.util.List;

public class HistoryController extends BaseController {
	
	private List<String> listHistory;
	
	public HistoryController(List<String> listHistory) {
		this.listHistory = listHistory;
		start();
	}

	@Override
	protected String start() {
		listHistory.forEach(System.out::println);
		return "";
	}

}