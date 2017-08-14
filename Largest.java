import java.util.*;

public class Largest {
	public static void main (String[] args) {
		int j=-1,k,k1=1,k2=0,k4=0;
		Scanner s1=new Scanner(System.in);
		String s=s1.next();
		int a[]=new int[s.length()];
		
		for(int i=0;i<s.length();i++)
		    if(Character.isDigit(s.charAt(i)))
		    a[++j]=Integer.parseInt(s.substring(i,i+1));
		
		 Arrays.sort(a);
		        for(int i=2;i<a.length;i++)
		        {
		        k1=(a[i]+a[2])*k1;
		        k2=(a[i]*a[a.length-1])+k2;
                }
            
		        k1=function1(k1);
		        k2=function1(k2);
		        k2=Math.min(k1,k2);
		        System.out.println((k2*k2));
	}
		 static int function1(int k)
		        {
		            int k5=0;
		            while(k>0)
		            {
		                k5=k5+(k%10);
		                k=k/10;
		                if(k==0)
		                if((k5%10)!=k5)
		                {
		                k=k5;
		                k5=0;
		            }}
		        return(k5);
		            
		        }
	
}
