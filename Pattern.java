public class Pattern{
	public static void main (String [] args){
		int n = 5;
		for (int i=0; i< n; i++){
		System.out.print("#");
			for(int j=0; j< i; j++){
			System.out.print(" ");
			}
			System.out.println("#");
	}
		for (int k=n-1; k >= 0; k--){
		System.out.print("#");
			for(int l=0; l<k; l++){
			System.out.print(" ");
			}
		System.out.println("#");
		}
	}
}