package local.BotInc.Gojek.Service;

import local.BotInc.Gojek.Model.Driver;

public interface BaseService {
	
	public Integer defaultAmount = 1000;
	
	public Integer platformFee = 4000;
	
	abstract Driver getDrivers();

	abstract String says();

}
