
package pattern15;

import java.util.Scanner;

public class classpattern15 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE SIZE:");
		int n=sc.nextInt();
		int count=n*n;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j--) {
				System.out.print("* ");
				count--;
			
			}
		System.out.println();
		}

	}

}
