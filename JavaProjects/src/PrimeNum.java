
public class PrimeNum {

	public static void main(String[] args) {
		int n=2;
		int i=0;
		boolean isPrime=true;	//assume that all no are prime,other way we can set flag(int flag=1)
		
		for(i=2;i<n;i++)	//i=2 we start with no 2
		{
			if(n%i==0)
			{
				isPrime=false; 
				
				
			break;	//to break the for loop when n== what we entered
			}
		}
		if(isPrime)
		{
			System.out.println("its prime");
		}
		else
		{
			System.out.println("not prime");
		}
		
	}

}
