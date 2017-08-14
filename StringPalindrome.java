import java.util.Arrays;
import java.util.Scanner;
public class StringPalindrome {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s[]=str.split(" ");
		int i,j;
		int max=0;
		String[] t=new String[s.length];
		int a[]=new int[s.length];
	    for(i=0;i<s.length;i++)
	    {   
	        t[i] = "";
	        for( j=s[i].length()-1;j>=0;j--)
	        {
	            t[i]+=s[i].substring(j,j+1);
	        }
	    }
	    String stw=" ";
	    for(i=0;i<s.length;i++)
	    {
	    	if(s[i].equals(t[i]))
	    	{
	    		a[i]=t[i].length();
	    	}
	    }
	    for(i=0;i<a.length;i++)
	    {
	    	if(a[i]>max)
	    	{
	    		max=a[i];
	    	}
	    }
	    for(i=0;i<t.length;i++)
	    {
	    	if(s[i].length()>=max)
    		{
    		stw=s[i]+" ";
    		}
    	}
	    System.out.println(stw);
}
}
