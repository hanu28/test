package bubbelSort;

import java.util.*;


public class arrayList {

	public static void main(String[] args) {
		String [] textArrayList = {"Roma","Kasun","Amila","Naveen"};
		List<String> str = new ArrayList<String>();
		for(String x: textArrayList )
			str.add(x);
		for(int i=0;i<str.size();i++){
			System.out.println(str.get(i));
		}
		String [] textArrayList1 = {"Harshi","Lakmal","Amila","Navin"};
		List<String> str1 = new ArrayList<String>();
		for(String y: textArrayList1 )
			str1.add(y);	
		
		for(int j=0;j<str1.size();j++){
			System.out.println(str1.get(j));
		}
	}

}
