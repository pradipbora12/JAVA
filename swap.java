import java.util.*;

public class swap
{
	public static void main (String [] args)
	{
		int a,b;
		int temp;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number");
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.println("Number Before the Swapping"+ a+" " +b);
       temp=a;
        a =b ;
        b=temp;
        System.out.println("Number after swapping"+a +" " +b);

	}
	
}