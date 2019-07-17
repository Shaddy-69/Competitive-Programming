import java.util.*;
import java.io.*;
class Chef_and_Sum
{
	public static void main(String[] args) throws Exception
	{
		try
	    	{
        			Scanner sc=new Scanner(System.in);
        			int T=sc.nextInt();
        			while(T>0)
        			{
        	 			int N=sc.nextInt();
        	    			int K=sc.nextInt();
        	    			int Arr[]=new int[N];
                				for(int i=0;i<N;i++)
                				Arr[i]=sc.nextInt();
                				int f=0;
                				for(int i=0;i<N-1;i++)
                				{   
                    				for(int j=i+1;j<N;j++)
                    				{
                        					if(Arr[i]+Arr[j]==K)
                        					{
                            						f=1;
                            						break;
                        					}
                    				}
                				}
                				if(f==1)
                				System.out.println("Yes");
                				else
                				System.out.println("No");
                				T--;
            			}
	    	}
	    	catch(Exception e){}
    	}
}