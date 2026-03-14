// Program to find factorial of a number
class factorialNumber
{
	public static void main(String[] args)
	{
		int num = 5;
		int factorial = 1;
		for (int i = 1; i <=5;i++){
			factorial = factorial * i;
			
		}
		System.out.println("factorial of number "+ num + "is ="+factorial);
		
	}
}