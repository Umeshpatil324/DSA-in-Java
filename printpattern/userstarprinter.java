package printpattern;
import java.util.Scanner;
public class userstarprinter {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter rows &cols:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		for( int i=1; i<=m; i++) {//rows
			for(int j=1; j<=n;j++) {//colsum
			System.out.print("* ");
	}
			System.out.println();
		

}}}




