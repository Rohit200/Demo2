package Bridgelabz2;
import Bridgelabz.Project.*;
public class MergeSorting {

	public static void main(String[] args)
	{
		System.out.println("Enter the number for the size of Array");
         int n=Utility.input();
         int a[]=new int [n];
         System.out.println("Enter the number to fill the Array");
         for(int i=0;i<a.length;i++)
         {
        	 a[i]=Utility.input();
         }
         Utility.mergeSort(a);
         Utility.output(a);
	}
}
