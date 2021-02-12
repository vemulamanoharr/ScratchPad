package recursionPractise;

public class PrintBinaryString {

	public void bsHelper(String slate, int n) {

		if (n == 0) {
			System.out.println(slate);
		} else {
			bsHelper(slate + "0", n - 1);
			bsHelper(slate + "1", n - 1);

		}

	}

	public void bs(int n) {
		bsHelper("", n);
	}

}
