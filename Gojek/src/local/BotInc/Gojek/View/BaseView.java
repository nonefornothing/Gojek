package local.BotInc.Gojek.View;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class BaseView {
	
	Scanner input = new Scanner(System.in);

	protected String brandName = "Bot Inc";
	
	abstract void show();
	
	public Float getAnFloat() {
		while (true) {
			try {
				return input.nextFloat();
			} catch (InputMismatchException e) {
				input.next();
				System.err.print("Try again: ");
			}
		}
	}
	
	public Integer getAnInteger() {
		while (true) {
			try {
				return input.nextInt();
			} catch (InputMismatchException e) {
				input.next();
				System.err.print("Try again: ");
			}
		}
	}
	
	
	
}
