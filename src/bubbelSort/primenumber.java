package bubbelSort;

public class primenumber {
	
	static int smallestDivisor(int n)
	{
	    // if divisible by 2
	    if (n % 2 == 0)
	        return 2;
	 
	    // iterate from 3 to sqrt(n)
	    for (int i = 3; i * i <= n; i += 2) {
	        if (n % i == 0)
	            return i;
	    }
	 
	    return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
        System.out.println (smallestDivisor(n));
	}

}
