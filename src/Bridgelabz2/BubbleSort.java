package Bridgelabz2;
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import Bridgelabz.Project.*;
public class BubbleSort
{
	public static void main(String[] args)throws IOException
	{
		try
		{
			int i=0;
			int a[]=new int[10];
		    Scanner input = new Scanner(new File("/home/bridgeit/Desktop/Integer.txt")).useDelimiter(",\\s*");
		    while(input.hasNext())
            {
                a[i] = input.nextInt();
                i++;
            }
		    for(int j=0;j<a.length;j++)
			{
	        System.out.println(a[j]);
			}
            input.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
		
    }

	
	}

