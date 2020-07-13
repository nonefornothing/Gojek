package local.BotInc.Gojek.Service;

import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter; 

public class DateService {

	public String getDate() {
		
		LocalDateTime myDateObj = LocalDateTime.now();
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	    String formattedDate = myDateObj.format(myFormatObj);
	    return formattedDate;
	    
	}
	
	
}
