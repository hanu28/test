package bubbelSort;

public class primeNumbers {
	static int returnValue=0;
	public static int isPrime(long n) {
	    // Write your code here
		int returnValue=0;
	    	
	         boolean flag = false;
	        for (int i = 2; i <= n / 2; ++i) {
	          // condition for nonprime number
	          if (n % i == 0) {
	            flag = true;
	            returnValue=1;
	            break;
	          }
	        }

	        if (!flag){
	          System.out.println(n + " is a prime number.");
	        }
	        else{
	          System.out.println(n + " is not a prime number.");
	          for (int i=2; i<=n; i++) 
	          if (n%i==0)  {                                              
	              
	        	  returnValue=i;
	              break;
	          }
	          
	       }
	    		return returnValue;
	    }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPrime(90));
	}

}
