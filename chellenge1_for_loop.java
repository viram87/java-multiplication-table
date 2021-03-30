//display a multiplication table

package for_loops;

import java.util.Scanner;

public class chellenge1_for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner v1 = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
		int n = v1.nextInt();
		
		System.out.println(" ");
		
		for(int i = 1 ; i<=10 ; i++)
		{
			System.out.println(n + " * " + i + " = " + (n*i));
		}
		
		
		v1.close();
		
	
		
				
		
		
	}

}
