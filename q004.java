package eular;
/*
 * Problem 4 :
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 
*/
import java.util.*;
public class q004 {
	static void find()
	{
		int temp;
		int pr=1;
		int p;
		for(int i=100;i<=999;i++)
		{
			for(int j=100;j<=999;j++)
			{
				p=i*j;
				if(p>pr && palindrome(p))
				{
					pr=p;
					
				}
			}
		}
		System.out.println(pr);
	}
		static boolean palindrome(int p)
		{	int reverse=0;
			int num=p;
			while(num!=0)
			{
				int l=num%10;
				reverse=l+reverse*10;
				num=num/10;
			}
			if(p==reverse)
			{
				return true;				
			}
		
				return false;
		}
		public static void main(String []args)
	{
		find();
	}
}
