import java.util.*;
import java.lang.*;
import java.io.*;


public class Length
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String sub=new String();
		int length=0;
		for(int i=0;i<s.length();i++)
		{
		    for(int j=i+1;j<s.length();j++)
		    {
		        String su=s.substring(i,j);
		        if(isrepeat(su))
		        {
		            if(su.length()>length)
		            {
		                length=su.length();
		                sub=new String(su);
		            }
		        }
		    }
		}
		System.out.println(sub);
	}
	static boolean isrepeat(String st)
	{
	    char[] a=st.toCharArray();
	    Arrays.sort(a);
	    int flag=0;
	    for(int i=0;i<a.length;i++)
	    {
	        for(int j=i+1;j<a.length;j++)
	        {
	            if(a[j]==a[i])
	            {
	                flag=1;
	                break;
	            }
	            else
	            {
	                continue;
	            }
	        }
	    }
	    if(flag==0)
	        return true;
	   else
	        return false;
	}
}
