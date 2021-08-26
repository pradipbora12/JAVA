import java.util.*;

public class swapplus
{
	public static void main(String [] args)
	{
	 int  a, b;
	 Scanner scan =new Scanner(System.in);
	 System.out.println("Enter the number for swapping");
	 a =scan.nextInt();
	 b =scan.nextInt();
	 System.out.println("Number before swapping"+ a+" "+ b);
	 a=a+b;
	 b=a-b;
	 a=a-b;
	 System.out.println("Number After swapping"+a+ "  "+b);

	}
}