package eular;
/*
 * Problem 3 :
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 
*/
import java.util.*;
public class q003 {
	static void factor()
	{
		long  num=600851475143l;
		long factor=0;
		long flag=0, flag2=0;
		for(long i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=1;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag2=1;
					break;
				}	
			}
			}
			if(flag==1&&flag2==0)
			{
				System.out.println(i);
			}
			flag=0;
			flag2=0;
		}
	}
	public static void main(String []args)
	{
		factor();
	}
}
