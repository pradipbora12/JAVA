import java.util.*;

public class swapstar
{
	public static void main(String args[])
    {
    	int a,b;
    	Scanner Scan = new Scanner(System.in);
    	System.out.println("Enter the numbers");
    	a =Scan.nextInt();
    	b =Scan.nextInt();
    	System.out.println("Number before Swappin"+a+" "+b);
    	a =a*b;
    	b =a/b;
    	a =a/b;
    	System.out.println("Number after swapping"+a+ " "+b);



    }
}