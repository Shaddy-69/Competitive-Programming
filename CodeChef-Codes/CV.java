import java.util.*;
import java.io.*;
class CV
{
	public static boolean isVowel(char ch)
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		return true;
		else
		return false;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		try
		{
		    Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		    while(T>0)
		    {
		        int n = sc.nextInt();
		        sc.nextLine();
		        String s = sc.nextLine();
		        int c=0;
		        for(int i=0;i<s.length()-1;i++)
		        {
		            char ch = s.charAt(i);
		            if(ch>='a' && ch<='z' && !isVowel(ch))
		            {
		                if(isVowel(s.charAt(i+1)))
		                c++;
		            }
		        }
		        T--;
		        System.out.println(c);
		    }
		}
		catch(Exception e){}
	}
}
