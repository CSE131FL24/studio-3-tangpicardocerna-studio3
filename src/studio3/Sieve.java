package studio3;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = in.nextInt();
		boolean numbers[] = new boolean [n+1];
		for(int i = 0; i < n; i ++) {
			numbers[i] = true;
		}
		
		for(int p = 2; p*p <= n; p++) {
			if(numbers[p]= true) {
				for(int i = p*p; i <= n; i +=p) {
					numbers[i] = false;
				}
			}
		}
		System.out.println("These are prime numbers: ");
		for(int a = 2; a <= n; a++) {
			if(numbers[a] == true) {
				System.out.println(a);
			}
		}
		
	}

}
