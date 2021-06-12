package bubbelSort;

import java.util.Scanner;

public class swappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y,t;
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Before Swap"+x +"AND" +y);
		t=x;
		x=y;
		y=t;
		System.out.println("After Swap"+x +"AND" +y);
		System.out.println();
	}

}
