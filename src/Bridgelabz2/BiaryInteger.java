package Bridgelabz2;
import Bridgelabz.Project.*;
import java.util.*;
public class BiaryInteger
{
public static void main(String[] args)
{
		System.out.println("Enter the number for the size of Array");
		int n=Utility.input();
		int m=(int)Math.pow(2,n);
		int a[]=new int [m];
		for(int i=0;i<a.length;i++)
		{
			a[i]=i;
		}
		System.out.println("Enter the number to search in a Array");
		int k= Utility.input();
		int l=Utility.binaryIntegerN(a,k);
		if(l==-1)
			System.out.println("Number not found in a Array");
			else
				System.out.println(l+"---->"+a[l]);
	}

}
