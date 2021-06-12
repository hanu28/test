package bubbelSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class duplicateElementRemove {

	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(1,3,3,3,4,5,5,5,2,2,2,2,2,2,5,7,7,7));
		LinkedHashSet<Integer> removeDuplicateElementsLHS = new LinkedHashSet<Integer>(numberList);
		ArrayList<Integer> removeDuplicateNumbers = new ArrayList<Integer>(removeDuplicateElementsLHS);
		System.out.println(removeDuplicateNumbers);

	}

}
