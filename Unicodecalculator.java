package deliverable2;
import java.util.Scanner;
public class Unicodecalculator {
	public static void main(String[]args)
	{
		@SuppressWarnings("resource")
		Scanner inputUserScannerObj = new Scanner(System.in);
		System.out.println("Please enter String1: ");
		String string1 = inputUserScannerObj.next();
		System.out.println("Please enter String2: ");
		String string2 = inputUserScannerObj.next();
		int string1UNICODESum = 0;
		int string2UNICODESum = 0;
		for (int i = 0; i < string1.length(); i++) {
			int a = string1.charAt(i);
			string1UNICODESum = string1UNICODESum+a;
			System.out.println(string1.charAt(i)+" > "+String.valueOf(a));
		}
		for (int i = 0; i < string2.length(); i++) {
			int a = string2.charAt(i);
			string2UNICODESum = string2UNICODESum+a;
			System.out.println(string2.charAt(i)+" > "+String.valueOf(a));
		}
		System.out.println("Absolute Value between two Strings: >> "+String.valueOf(Math.abs(string2UNICODESum-string1UNICODESum)));
		
	}

}
