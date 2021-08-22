/* Write a program in JAVA to print the sum of two numbers.   
Sample Output:
Print the sum of two numbers :
-----------------------------------
The sum of 29 and 30 is : 59  */

import java.util.*;
import java.util.Scanner;


class sum
{
	public static void main(String []agrs)
	{
		int a;int b;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the the value ");
		a =scan.nextInt();
		b =scan.nextInt();

		int sum =a+b;
		System.out.println("Sum is "+ sum);


	}
}
