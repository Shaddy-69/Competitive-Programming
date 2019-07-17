import java.util.*;
import java.io.*;
class Attendance
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
		        sc.nextLine();
		        List<String> list1 = new ArrayList<String>();
		        List<String> list2 = new ArrayList<String>();
		        for(int i=0;i<n;i++)
		        {
		            String s[] = sc.nextLine().split(" ");
		            list1.add(s[0]);
		            list2.add(s[1]);
		        }
		        for(int i=0;i<n;i++)
		        {
		            if(Collections.frequency(list1,list1.get(i))>1)
		            System.out.println(list1.get(i)+" "+list2.get(i));
		            else
		            System.out.println(list1.get(i));
		        }
		        T--;
		    }
		}
		catch(Exception e){}
	}
}