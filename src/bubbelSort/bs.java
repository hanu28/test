package bubbelSort;
import java.io.*;


public class bs {
	
	static void bubbleSort(int arr[],int n) {
		int i,j,temp;
		boolean swapped;
		for(i=0;i<n-1;i++){
			swapped=false;
			for(j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			if(swapped=false){
			break;	
			}
		}
		
	}
	
	static void printArray(int arr[],int size) {
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]+"");
		}
		
	}
	
	public static void main(String [] arg)  {
		int arr[]= {12,67,9,34,56,67,23,45};
		int n=arr.length;
		bubbleSort(arr,n);
		System.out.println("Sorted Array");
		printArray(arr,n);
	}

}
