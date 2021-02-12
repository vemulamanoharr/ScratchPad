package recursionPractise;

import java.util.ArrayList;
import java.util.List;

public class PrintSubSets {
	
	public static List<String> retS = new ArrayList<String>();

	public String [] pssHelper(String slate, int index, StringBuilder soFar) {

		// base case
		if (index == slate.length()) {
			retS.add(soFar.toString());
		}

		else {
			pssHelper(slate, index + 1, soFar);
			soFar.append(slate.charAt(index));
			pssHelper(slate, index + 1, soFar);
			soFar.deleteCharAt(soFar.length() - 1);
		}
		// check
		  String[] array = retS.stream().toArray(String[]::new);
		  return array;

	}

	public String [] pss(String s) {
		StringBuilder soFar = new StringBuilder();
		return pssHelper(s, 0, soFar);
	}

}
