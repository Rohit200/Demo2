package Bridgelabz2;
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import Bridgelabz.Project.*;
public class InsertionSort
{
public static void main(String[] args)throws IOException {
try{
	String token1 = "";
    Scanner inFile1 = new Scanner(new File("/home/bridgeit/Desktop/Word.txt")).useDelimiter(",\\s*");
    String s=" ";
    while (inFile1.hasNext())
    {
      token1 = inFile1.next();
      s=s+token1+" ";
    }
    int n=Utility.wordCount(s);
    System.out.println(n);
    String s1[]=new String[n];
   s1=s.split("\\s+");
   String s2[]= new String[n];
   s2=Utility.insertionString(s1);
   
  for(int i=0;i<s2.length;i++)
    {
		 System.out.println(s1[i]);
	    }
}
catch(IOException e)
{
	System.out.println("File not found");
}
}

}
