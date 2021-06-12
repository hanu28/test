package bubbelSort;

public class printNumbers {

	public static void main(String[] args) {
		
		printNum(1,100);
		// TODO Auto-generated method stub

	}
	
	public static  void printNum(int min,int max)
	{
		if(min<=max)
		{
			System.out.println(min);
			min++;
		
		printNum(min,max);
		}
	}

}
