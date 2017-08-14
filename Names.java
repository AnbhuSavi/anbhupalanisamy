import java.util.Scanner;

public class Names {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter firstname,lastname,pin,digit as 'x,x,x,x' in single line :");
		String str = s.next();
		String arr[] = str.split(",");
		String fname = arr[0];
		String lname = arr[1];
		String smaller = "", larger = "";
		String pin = arr[2];
		int n = Integer.parseInt(arr[3]);
		if (pin.charAt(0) == '-' || n < 0 || !pin.matches(".*\\d+.*") || fname.matches(".*\\d+.*")
				|| lname.matches(".*\\d+.*")) {
			System.out.println("This Cannot be Processed");
		} else {
			if (fname.length() == lname.length()) {
				if (fname.compareToIgnoreCase(lname) > 0) {
					smaller = lname;
					larger = fname;
				} else {
					smaller = fname;
					larger = lname;
				}
			} else if (fname.length() > lname.length()) {
				smaller = lname;
				larger = fname;
			} else {
				smaller = fname;
				larger = lname;
			}
			String out = larger.charAt(0) + "" + smaller + pin.charAt(n - 1) + "" + pin.charAt(pin.length() - n);
			StringBuilder sbr = new StringBuilder(out);
			for (int i = 0; i < out.length(); i++) {
				if (Character.isUpperCase(out.charAt(i))) {
					sbr.setCharAt(i, Character.toLowerCase(out.charAt(i)));
				} else {
					sbr.setCharAt(i, Character.toUpperCase(out.charAt(i)));
				}
			}
			System.out.print(new String(sbr));
		}
		s.close();
	}
}
