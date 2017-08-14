import java.util.Scanner;

public class AlexPro {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the details");
		int tot=in.nextInt();
		int frnd=in.nextInt();
		System.out.print("");
		String str=in.next();
		int count=0;
		int id[]=new int[frnd];
		System.out.print("");
		for(int i=0;i<frnd;i++)
		{
			id[i]=in.nextInt();
		}
		int len=str.length();
		int[] status=new int[tot];
		int num=Integer.parseInt(str);
		for(int i=0;i<tot;i++)
		{
			status[i]=num%10;
			num/=10;
		}
		for(int i=0;i<frnd;i++)
		{
			if(status[id[i]-1]==0)
			{
			count++;	
			}
		}
		System.out.println((count>0)?"YES":"NO");
	}

}
