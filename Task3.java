import java.util.Scanner;
public class Task3
{
   public static void main(String args[])
   {
	   
	  
	Scanner sc = new Scanner(System.in);
	   
	System.out.print("Enter number ");
	int n = sc.nextInt();
    for(int i=1;i<=n;i++)
	{
		for(int k=n;k>i;k--)
		{
			System.out.print(" ");
		}
		
	System.out.println();
	
   }
}
}


