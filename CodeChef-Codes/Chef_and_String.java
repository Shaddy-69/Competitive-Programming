import java.util.*;
import java.io.*;
class Chef_and_String
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try
		{
		    Scanner sc = new Scanner(System.in);
		    String str = sc.nextLine();
		    char S[] = str.toCharArray();
		    char ch[] = {'C','H','E','F'};
		    int c=0,k=0;
		    for(int i=0;i<S.length;i++)
		    {
		        if(S[i]==ch[k])
		        {
		            k++;
		            S[i]='*';
		        }
		        if(k==4)
		        {
		            c++;
		            k=0;
		            i=0;
		        }
		    }
		    System.out.println(c);
		}
		catch(Exception e){}
	}
}