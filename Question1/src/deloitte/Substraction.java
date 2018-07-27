package deloitte;

import java.util.Scanner;

public class Substraction extends Arithmetic {

	@Override
	public void calculate(int var1, int var2) {
		int res = var1 - var2;
		this.display(res);
	}
}
