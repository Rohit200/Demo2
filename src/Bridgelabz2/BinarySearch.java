package Bridgelabz2;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import Bridgelabz.Project.*;
public class BinarySearch 
{

	    public static void main(String[] args) throws IOException
	    {
	   
	    String token1 = "";
        Scanner inFile1 = new Scanner(new File("/home/bridgeit/Desktop/Word.txt")).useDelimiter(",\\s*");
	    String s=" ";
	    while (inFile1.hasNext())
	    {
	      token1 = inFile1.next();
	      s=s+token1+" ";
	    }
	    System.out.println(s);
	    String k="Rohit";
	    int n=Utility.wordCount(s);
	    System.out.println(n);
	    String s1[]=new String[n];
	   s1=s.split("\\s+");
	   String s2[]= new String[n];
	   s2=Utility.bubbleString(s1);
	   
	  for(int i=0;i<s2.length;i++)
        {
			 System.out.println(s1[i]);
		    }
		   int m= Utility.binaryString(s2,k);
		   System.out.println(m);
           if(m==-1)
        	   System.out.println("Strng Not present");
           else
        	   System.out.println(m-1 +"------>"+ s2[m-1]);  
	    
	    }
}

