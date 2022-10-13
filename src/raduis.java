import java.util.Scanner;

public class raduis {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" please enter a raduis;");
		double r = sc.nextDouble();
		System.out.println(" premiter is = " + 2*Math.PI*r);
		System.out.println("Area is = " + Math.PI * Math.pow(r, 2));
	} 
}
 