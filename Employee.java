import java.util.Scanner;
public class Employee {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(); 
    	int M=sc.nextInt(); 
		int A=sc.nextInt();
		int i,j;
		int arrI[]=new int[N];
		int arrJ[]=new int[N];
		
		for(i=0;i<M;i++){
				arrI[i]=sc.nextInt();
				arrJ[i]=sc.nextInt();
		}
		int[] salary=new int[N];
		for(i=0;i<N;i++){
			salary[i]=sc.nextInt();
		}
		int count=0;
	    
		for(j=0;j<M;j++){
			if(arrI[j]==A) {
				//System.out.println(salary[i] +" "+salary[A-1]+" "+arrI[i]+" "+arrJ[i]+" "+A);
				if(salary[arrJ[j]-1]<salary[A-1]){
					++count;
				}
			}
			if(arrJ[j]==A){
				if(salary[arrI[j]-1]<salary[A-1]){
					++count;
				}
			}
		}
		sc.close();
		System.out.println(count);
	}
}
