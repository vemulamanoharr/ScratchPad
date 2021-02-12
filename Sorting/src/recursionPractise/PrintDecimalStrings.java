package recursionPractise;

public class PrintDecimalStrings {
	public void dsHelper(String slate, int n) {

		if (n == 0) {
			System.out.println(slate);
		} else {
			for(int i= 0;i<=9;i++) {
				dsHelper(slate + Integer.toString(i), n - 1);
			}		
		}

	}

	public void ds(int n) {
		dsHelper("", n);
	}

}
