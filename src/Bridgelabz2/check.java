package Bridgelabz2;
import Bridgelabz.Project.*;
public class check
{
public static void main(String[] args)
{
		String a1= "how are you my friend";
		int n=Utility.wordCount(a1);
		System.out.println(n);
		//String s2[]=new String[n];
			  String s1[]=new String[n];
			  char ch[]=a1.toCharArray();
			  int j=0;
			  for(int i=0;i<ch.length-1;i++)
			  {
				  String s2=" ";
				  while(ch[i]!=' '&& i>0)
				  {
					  System.out.println(ch[i]);
					  s2=s2+ch[i];
				  }
				  s1[j]=s2;
				  System.out.println(s2);
				  j++;
			  }  
			
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}

	}

}
