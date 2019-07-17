import java.util.*;
import java.io.*;
class Smallest_Numbers_of_Notes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try
		{
		    Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		    while(T>0)
		    {
		        int n = sc.nextInt();
		        int c=0;
		        while(n>=100)
		        {
		            n-=100;
		            c++;
		        }
		        while(n>=50)
		        {
		            n-=50;
		            c++;
		        }
		        while(n>=10)
		        {
		            n-=10;
		            c++;
		        }
		        while(n>=5)
		        {
		            n-=5;
		            c++;
		        }
		        while(n>=2)
		        {
		            n-=2;
		            c++;
		        }
		        while(n>=1)
		        {
		            n-=1;
		            c++;
		        }
		        T--;
		        System.out.println(c);
		    }
		}
		catch(Exception e){}
	}
}
