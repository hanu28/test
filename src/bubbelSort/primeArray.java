package bubbelSort;

import java.util.Arrays;
import java.util.Collections;

public class primeArray {

	public static void main(String[] args) {
		int i;
		Integer arr[]= {11,23,45,29,67,97};
		String primeNumbers = "";
		int n=arr.length;
		int num=0;
		for(i=0;i<n;i++){
			int counter = 0;
			for(num=i;num>=1;num--){
				if(i%num == 0){
					counter = counter + 1;
				}
			}
			if(counter ==2){
				primeNumbers = primeNumbers +arr[i] + " ";
			}
		}
		System.out.println("Prime Numbers : " + primeNumbers);
		
	}
		
		// TODO Auto-generated method stub

	}

