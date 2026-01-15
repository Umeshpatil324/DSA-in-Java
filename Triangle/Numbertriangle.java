package Triangle;
import java.util.Scanner;
public class Numbertriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter name :");
		String n = sc.next();
		for (int i=1; i<=n.length(); i++) {
			for(int j=0; j<i; j++) {
				System.out.print(n.charAt(j)+ " ");
			}
			System.out.println();
		}
	}

}
