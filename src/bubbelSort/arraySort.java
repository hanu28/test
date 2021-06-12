package bubbelSort;

import java.util.Arrays;
import java.util.Collections;

public class arraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [] arr = {12,78,45,23,9,23};
		Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
	}

}
