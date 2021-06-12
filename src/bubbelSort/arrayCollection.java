package bubbelSort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class arrayCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer []array={12,45,98,45,34,90};
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println("Sorted Array"+Arrays.toString(array));
	

	}

}
