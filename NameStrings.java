public class NameStrings{

public static void main(String[] args) {
	String first = "John";
	String middle = "Fitzgerald";
	String last = "Kennedy";

	System.out.println("Total name = " + first + " " + middle + " " + last);
	System.out.println("Length of first = " + first.length());
	System.out.println("Length of middle = " + middle.length());
	System.out.println("Length of last = " + last.length());
	int total = (first.length() + middle.length() + last.length() + 2);
	System.out.println("Length of total name = " + total);
	System.out.println("Initials = " + first.substring(0,1) + middle.substring(0,1)+ last.substring(0,1));
	System.out.println("Short name = " + first + " " + middle.substring(0,1) + " " + last);
	System.out.println("Shorter name = " + first.substring(0,1) + " " + middle.substring(0,1) + " " + last);
	System.out.println("UpperCase name = " + first.toUpperCase() + " " + middle.toUpperCase() + " " + last.toUpperCase());
	System.out.println("LowerCase name = " + first.toLowerCase() + " " + middle.toLowerCase() + " " + last.toLowerCase());


}
}