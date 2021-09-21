import java.util.Scanner;
public class Task2
{
   public static void main(String args[])
   {
	   
	   Scanner sc = new Scanner(System.in);
	   
	System.out.print("Enter Salary :- ");
	double salary = sc.nextDouble();
    double tax = 1;
	int taxRate = 0;
	double hra=salary*0.15;
	double da=salary*0.60;
	salary=salary+da+hra;
	
	if(salary<=500000)
	{
		taxRate = 0;
		tax = 0;
	}
	else if(salary>=500001 && salary<=1000000)
	{
		taxRate=20;
		tax=(salary*taxRate)/100;
	}
	else
	{
		taxRate=30;
		tax=(salary*taxRate)/100;
	}
	System.out.println("for salary"+salary+"tax would be at"+taxRate+"% rate is "+tax);
	//System.out.print("For Salary "+salary+", Tax would be @ "+taxRate+"% amount "+tax+"Rs.");
	
   }
}

