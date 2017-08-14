import java.io.*;
import java.util.*;
public class Days
{

public static void main(String[] args) {
System.out.println("Enter the weekdays");
		Scanner input=new Scanner(System.in);
		String weekdays=input.nextLine();
		boolean output1=false;
		if(!(weekdays.equalsIgnoreCase("sunday")))
		{
			output1=true;
		}
		System.out.println(output1);
	}

}
