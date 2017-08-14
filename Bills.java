import java.util.Scanner;
public class Bills
{
public static void main(String args[])
{
Scanner S=new Scanner(System.in);
int n=S.nextInt();
int k=S.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=S.nextInt();
int sum=0;
int chr=S.nextInt();
for(int i=0;i<n;i++)
{
if(i!=k)
sum=sum+a[i];
}
System.out.println(sum);
if((sum/2-chr)==0)
System.out.println("Bon Appetit");
else
System.out.println(chr-sum/2);
}
}
