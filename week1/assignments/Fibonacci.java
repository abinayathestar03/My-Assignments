package week1.assignments;

public class Fibonacci {
public static void main(String[] args) {
	int firstnum=0,secondnum=1,sum=0;
	System.out.println("The firstnum"+firstnum+"The second num"+secondnum);
	for(int i=1;i<11;i++)
	{
		sum=firstnum+secondnum;
		firstnum=secondnum;
		secondnum=sum;
		System.out.println(sum);
		
		
}
	
	
}
}
