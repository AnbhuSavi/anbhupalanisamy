  import java.util.Scanner;
import java.lang.*;
public class Encoding
{
  public static void main(String[] args)
		   {
		        encryptedString("code kata",10);

}
		    
  static String output1="";
		    public static void encryptedString(String input1,int input2)
		    {
		        String s1=input1.toLowerCase();
		        char[] srcArray=s1.toCharArray();
		        int encodeLength=122-input2;
		        for(int i=0;i<s1.length();i++)
		        {
		            int c;
		            c=(int)srcArray[i];
		            if(c==32)
		            {
		                srcArray[i]=' ';
		            }
		            else if(c>=encodeLength)
		            {
		                srcArray[i]=(char) ((int)srcArray[i]-26+input2);
		            }
		            else
		            {
		                srcArray[i]=(char)((int)srcArray[i]+input2);
		            }
		        }
		        for(int i=0;i<srcArray.length;i++)
		        {
		            if(Character.isUpperCase(srcArray[i]))
		                srcArray[i]=Character.toUpperCase(srcArray[i]);
		            else if(Character.isLowerCase(srcArray[i]))
		                srcArray[i]=Character.toLowerCase(srcArray[i]);
		            else
		                srcArray[i]=' ';
		            
		        }
		        output1=new String(srcArray);
		        System.out.println(output1);
		        
		    


		    }
		    
	}
