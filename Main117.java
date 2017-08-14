import java.util.*;
public class Main117 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a[][] = new String[10][5];
		System.out.println("WELCOME TO GUVI TRAVELS");
		for(int i = 0;i < 10;i++){
			for(int j = 0;j < 5;j++){
				a[i][j] = "A"+i+j;
			}
		}
		String name = null;
		String ceatnumber = null;
		String gender = null;
		int ch = 0;
		do{
			System.out.println("Available Seets are");
			for(int i = 0;i < 10;i++) {
				for(int j = 0;j < 5;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		System.out.println("Enter the name");
 		name=sc.next();
		System.out.println("Enter your age");
		int age=sc.nextInt();
		int count1=0;
		do{
			System.out.println("Enter your gender (m or f)");
			gender=sc.next();
			if(gender.equals("f") || gender.equals("F") || gender.charAt(0) == 'F' || gender.charAt(0) == 'f' || gender.equals("m") || gender.equals("M") || gender.charAt(0)=='M'||gender.charAt(0)=='m'){
				count1++;
			}
			else {
				System.out.println("Enter the valid gender");
			}
		}while(count1 == 0);

	System.out.println("Enter your mobile number");
	int mobileNo = sc.nextInt(); 
	int count = 0;
	do{
	System.out.println("Enter your ceat number (FOR EX A08,A22,A35)");
	String num = sc.next();
	int row = Integer.parseInt(num.substring(1,2));
	int column = Integer.parseInt(num.substring(2,3));
	if(row < 10 && column < 5 && (num.charAt(0) == 'A' || num.charAt(0) == 'a') && num.length() == 3){
		if(a[row][column].equals("B(M)") || a[row][column].equals("B(F)")){
			System.out.println("Sorry already booked ceat");
	}
	else {
		System.out.println("Sucsesfully booked");
		count++;
		ceatnumber=a[row][column];
			if(gender.equals("m")||gender.equals("M")||gender.charAt(0)=='M'||gender.charAt(0) == 'm') {
				a[row][column] = "B(M)";
			}
			else if (gender.equals("f") || gender.equals("F") || gender.charAt(0)=='F' || gender.charAt(0) == 'f') {
				a[row][column] = "B(F)";
			}	
	}
}
		else {
			System.out.println("Enter the valid ceat number or the sheat is already booked");
		}
		}while(count == 0);
	System.out.println("if you want to continue press Y or any button to exit");
	ch = sc.next().charAt(0);
	}while(ch == 'y'||ch == 'Y');
		System.out.println("Your ceat number is "+ceatnumber+".");
		System.out.println("Thank You "+name+" Visit again");
    }
}
