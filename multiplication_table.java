import java.io.ObjectInputFilter.Status;
import java.util.Scanner;

public class multiplication_table {

     public static void main(String[] args) {
        
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

