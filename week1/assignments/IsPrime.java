package week1.assignments;

public class IsPrime {
	public static void main(String[] args) {
		int n=7;
		boolean flag=true;
		for(int i=2;i<n-1;i++)
		{
			if(n%i==0)
			{
				System.out.println("the given number is not prime");
				flag=false;
				break;
			}}
			if(flag==true) {
				System.out.println("the given number is prime");
			}
			
		
		
	}

}
