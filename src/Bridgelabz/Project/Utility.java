package Bridgelabz.Project;
import java.util.*;
public class Utility
{
	public static int [] bubbleInteger(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int k=a[j];
					a[j]=a[j+1];
					a[j+1]=k;
				}
			}
		}
		return a;
	}
	public static int input()
	{
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
	      return n;
	}
	public static double inputDouble()
	{
		 Scanner sc=new Scanner(System.in);
		 double n=sc.nextDouble();
	     return n;
	}
	public static String inputString()
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		return s1;
	}
	
    public static int [] insertionInteger(int a[])
    		{
    	
    	   for(int i=1;i<a.length;i++)
    	   {
    		   int j=i;
    		   while(j>0&& a[j]<a[j-1])
    		   {
    			   int k=a[j];
    			   a[j]=a[j-1];
    			   a[j-1]=k;
    			   j--;
    		   }
    	   }
    	   return a;
    		}
    public static int [] selectionInteger(int a[])
    {
    	for(int i=0;i<a.length-1;i++)
    	{
    		int min=a[i];
    		for(int j=i+1;j<a.length;j++)
    		{
    			if(a[j]<min)
    			{
    				int k=a[i];
    				a[i]=a[j];
    				min=a[j];
    				a[j]=k;
    				
    			}
    			else
    				continue;
    		}
    	}
    	return a;
    }
    public static long stopWatch() 
    {
   	 long t1=0,t2=0;
   	System.out.println("Enter any numeric key");
   	int n=Utility.input();
   	if(n>=0&&n<=9)
   		 t1=Utility.startTimer();
   	System.out.println("Enter any numeric key");
   	int m=Utility.input();
   	if(m>=0&&m<=9)
   		 t2=Utility.stopTimer();
   		return t2-t1;	
     }
    public static long startTimer()
    {
   	 long start=System.nanoTime();
   	 return start;
    }
    public static long stopTimer()
    {
   	 long end=System.nanoTime();
   	 return end;
    }
    public static long elapsedTime(long start,long end)
    {
    	long d= end-start;
    	return d;
    }
    public static int binaryInteger(int a[], int k)
    {
    	Utility.bubbleInteger(a);
    	int low=0;
    	int high=a.length-1;
    	int mid;
    	while(low<=high)
    	{
    		mid=(high+low)/2;
    		if(a[mid]<k)
    			low=mid+1;
    		else if(a[mid]>k)
    			high= mid-1;
    		else
    			return mid;
    	}
    	return -1;
    }
  
    public static String [] bubbleString(String a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length-1-i;j++)
			{
				if(a[j].compareTo( a[j+1])>0)
				{
					String k=a[j];
					a[j]=a[j+1];
					a[j+1]=k;
				}
			}
		}
		return a;
}
  public static String [] insertionString(String a[])
	{

   for(int i=1;i<a.length;i++)
   {
	   int j=i;
	   while(j>0 && a[j].compareTo(a[j-1])<0)
	   {
		   String k=a[j];
		   a[j]=a[j-1];
		   a[j-1]=k;
		   j--;
	   }
   }
   return a;
	}
  public static String [] selectionString(String a[])
  {
  	for(int i=0;i<a.length-1;i++)
  	{
  		String min=a[i];
  		for(int j=i+1;j<a.length;j++)
  		{
  			if(a[j].compareTo(min)<0)
  			{
  				String k=a[i];
  				a[i]=a[j];
  				min=a[j];
  				a[j]=k;
  				
  			}
  			else
  				continue;
  		}
  	}
  	return a;
}
  public static int binaryString(String a[], String k)
  {
  	Utility.bubbleString(a);
  	int low=0;
  	int high=a.length-1;
  	int mid;
  	int c=0;
  	while(low<=high)
  	{
  		mid=(high+low)/2;
  		if(a[mid].compareTo(k)<0)
  			low=mid+1;
  		    else if(a[mid].compareTo(k)>0)
  			high= mid-1;
  			
  		else 
  			return mid;
  	}
  	return -1;
  }
  public static int wordCount(String s)
  {
	  int c=0;int i;
	  char ch[]=s.toCharArray();
	  for(i=0;i<ch.length;i++)
	  {
		  if(ch[i]==' '&&i>0)
			  c++;
	  }
	  if(i==ch.length&&ch[i-1]!=' ')
		  c++;
	  return c;
  }
  public static String [] store(String s)
  {
	  int n=Utility.wordCount(s);
	  String s1[]=new String[n];
	  char ch[]=s.toCharArray();
	  int j=0;
	  for(int i=0;i<ch.length-1;i++)
	  {
		  String s2=" ";
		  while(ch[i]!=' '&& i>0)
		  {
			  s2=s2+ch[i];
		  }
		  s1[j]=s2;
		  j++;
		  
	  }
	  return s1;
  }
  public static Set<String> permutationFinder(String str) {
      Set<String> perm = new HashSet<String>();
      //Handling error scenarios
      if (str == null) {
          return null;
      } else if (str.length() == 0) {
          perm.add("");
          return perm;
      }
      char initial = str.charAt(0); // first character
      String rem = str.substring(1); // Full string without first character
      Set<String> words = permutationFinder(rem);
      for (String strNew : words) {
          for (int i = 0;i<=strNew.length();i++){
              perm.add(charInsert(strNew, initial, i));
          }
      }
      return perm;
  }

  public static String charInsert(String str, char c, int j) {
      String begin = str.substring(0, j);
      String end = str.substring(j);
      return begin + c + end;
  }
  public static int binaryIntegerN(int a[], int k)
  {
  	Utility.bubbleInteger(a);
  	int low=0;
  	int c=0;
  	int high=a.length-1;
  	int mid;
  	while(low<=high)
  	{
  		System.out.println(low+"----->"+high);
  	
  		mid=(high+low)/2;
  		if(a[mid]<k)
  		{
  			low=mid+1;
  			c++;
  		}
  		else if(a[mid]>k)
  		{
  			high= mid-1;
  			c++;
  		}
  		else
  		{
  			System.out.println(c);
  			return mid;
  		}
  	}
  	return -1;
  }
	static int Tamt;
	public static int totalNotes=0;
	static int Thnotes = 0,Fhnotes = 0,Hhnotes = 0,Ffnotes = 0,Tenotes = 0,Finotes = 0,Twnotes = 0,Onnotes=0;

public static void vendingMachine(int amt)
{
	
	int Tamt=amt;
	//int totalNotes=0;
	
	
	if(amt>=1000)
	{
		int q=amt/1000;
		Thnotes=Thnotes+q;
		amt=amt%1000;
		System.out.println("Number of Thousands			="+Thnotes+"*1000");
		vendingMachine(amt);
	}
	else if(amt>=500)
	{
		int q=amt/500;
		Fhnotes=Fhnotes+q;
		amt=amt%500;
		System.out.println("Number of Five Hundreads		="+Fhnotes+"*500");
		vendingMachine(amt);
	}
	else if(amt>=100)
	{
		int q=amt/100;
		Hhnotes=Hhnotes+q;
		amt=amt%100;
		System.out.println("Number of Hundreads			="+Hhnotes+"*100");
		vendingMachine(amt);
	}
	else if(amt>=50)
	{
		int q=amt/50;
		Ffnotes=Ffnotes+q;
		amt=amt%50;
		System.out.println("Number of Fifties			="+Ffnotes+"*50");
		vendingMachine(amt);
	}
	else if(amt>=10)
	{
		int q=amt/10;
		Tenotes=Tenotes+q;
		amt=amt%10;
		System.out.println("Number of Tens				="+Tenotes+"*10");
		vendingMachine(amt);
	}
	else if(amt>=5)
	{
		int q=amt/5;
		Finotes=Finotes+q;
		amt=amt%5;
		System.out.println("Number of Fives				="+Finotes+"*5");
		vendingMachine(amt);
	}
	else if(amt>=2)
	{
		int q=amt/2;
		Twnotes=Twnotes+q;
		amt=amt%2;
		System.out.println("Number of Twos				="+Twnotes+"*2");
		vendingMachine(amt);
	}
	else if(amt>=1)
	{
		int q=amt/1;
		Onnotes=Onnotes+q;
		System.out.println("Number of Ones				="+Onnotes+"*1");
	}
	
	totalNotes=Thnotes+Fhnotes+Hhnotes+Ffnotes+Tenotes+Finotes+Twnotes+Onnotes;

}
 public static void output(int a[])
		 {
	 for(int i=0;i<a.length;i++)
	 {
		 System.out.println(a[i]);
	 }
		 }
 public static void output1(String a[])
 {
for(int i=0;i<a.length;i++)
{
 System.out.println(a[i]);
}
 }
 public static int array[];
 public static int tempsMergeArr[];
 public static int length;
 public static void doMergeSort(int lowerIndex, int higherIndex)
 {
      
     if (lowerIndex < higherIndex)
     {
         int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
         doMergeSort(lowerIndex, middle);
         doMergeSort(middle + 1, higherIndex);
         mergeParts(lowerIndex, middle, higherIndex);
}
 }
     public static void mergeParts(int lowerIndex, int middle, int higherIndex)
     {
    	 
         for (int i = lowerIndex; i <= higherIndex; i++)
         {
             tempsMergeArr[i] = array[i];
         }
         int i = lowerIndex;
         int j = middle + 1;
         int k = lowerIndex;
         while (i <= middle && j <= higherIndex)
         {
             if (tempsMergeArr[i] <= tempsMergeArr[j])
             {
                 array[k] = tempsMergeArr[i];
                 i++;
             } 
             else 
             {
                 array[k] = tempsMergeArr[j];
                 j++;
             }
             k++;
         }
         while (i <= middle) {
             array[k] = tempsMergeArr[i];
             k++;
             i++;
         }
  
     } 
     public static void mergeSort(int a[])
     {
    	 Utility.array=a;
    	 Utility.length=a.length;
    	 Utility.tempsMergeArr= new int[length];
    	 Utility.doMergeSort(0,length-1);
     }
public static void sqrtNewton(double c)
{
	double t=c;
	double epsilon= 1e-15;
	while (Math.abs(t - c/t) > epsilon*t) 
	{
        t = (c/t + t) / 2.0;
	}
	System.out.println(t);;
 } 

public static int swapNibbles(int x)
{
    return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
}
}
