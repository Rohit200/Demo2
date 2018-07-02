package Bridgelabz2;
import Bridgelabz.Project.*;
public class MainClass
{
public static void main(String[] args)
{
	System.out.println("Enter the number to define the size of Array");
	int m=Utility.input();
	int a[]=new int [m];
	System.out.println("Enter the number in Array");
    for(int i=0;i<a.length;i++)
	{
		a[i]=Utility.input();
	}
	
	int b[]=new int[a.length];
	long start=Utility.startTimer();
	b=Utility.bubbleInteger(a);
	Utility.output(b);
	long end= Utility.stopTimer();
	long d= Utility.elapsedTime(start, end);
	System.out.println("Time taken by bubblesort for Integer is "+d);
	System.out.println("---------------------------------------------------------------");
	
	 start=Utility.startTimer();
	b=Utility.insertionInteger(a);
	Utility.output(b);
	 end= Utility.stopTimer();
	 d= Utility.elapsedTime(start, end);
	System.out.println("Time taken by insertionsort for Integer is "+d);
	System.out.println("---------------------------------------------------------------");
	
	 start=Utility.startTimer();
	b=Utility.selectionInteger(a);
	Utility.output(b);
	 end= Utility.stopTimer();
	 d= Utility.elapsedTime(start, end);
	System.out.println("Time taken by selectionsort for Integer is "+d);
	System.out.println("---------------------------------------------------------------");
	
	System.out.println("Enter the number to define the size of String Array");
	int l=Utility.input();
	String s[]=new String[l];
	String s1[]=new String[l];
	System.out.println("Enter the number in Array");
	for(int i=0;i<s.length;i++)
	{
		s[i]=Utility.inputString();
	}

	
	 start=Utility.startTimer();
		s1=Utility.insertionString(s);
		Utility.output1(s1);
		 end= Utility.stopTimer();
		 d= Utility.elapsedTime(start, end);
		System.out.println("Time taken by insertionsort for Integer is "+d);
		System.out.println("---------------------------------------------------------------");
		

		 start=Utility.startTimer();
			s1=Utility.selectionString(s);
			Utility.output1(s1);
			 end= Utility.stopTimer();
			 d= Utility.elapsedTime(start, end);
			System.out.println("Time taken by insertionsort for Integer is "+d);
			System.out.println("---------------------------------------------------------------");
			

			 start=Utility.startTimer();
				s1=Utility.insertionString(s);
				Utility.output1(s1);
				 end= Utility.stopTimer();
				 d= Utility.elapsedTime(start, end);
				System.out.println("Time taken by insertionsort for Integer is "+d);
				System.out.println("---------------------------------------------------------------");
	
}
}
