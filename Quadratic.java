public class Quadratic{
	public static void main (String[] args){
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		double root;
		double root1;
		double root2;
		double delta = b * b - (4 * a * c);
	if (a == 0){
		System.out.println("Not a quadratic");
	}
	if (delta < 0)
	{
		System.out.println("No real roots");
	}
	else if (delta == 0){
		root = -b / (2 * a);
		System.out.print("The root is: " + root);
	}
	else{
		root1 = (-b + Math.sqrt(delta))/ (2*a);
		root2 = (-b - Math.sqrt(delta))/ (2*a);
		System.out.print("The two roots are: " + root1 + " and " + root2);
	}
	
	
	}
}