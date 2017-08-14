   import java.io.*;
import java.util.*;
public class Rotation{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
if(n>k &&n>1){
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(int i=n-1;i>=n-k;i--){
System.out.println(a[i]);
}
for(int i=0;i<n-k;i++){
System.out.println(a[i]);
}
}

}
}
