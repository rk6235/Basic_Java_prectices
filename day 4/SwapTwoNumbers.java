// Program to swap two numbers
class SwapTwoNumbers
{
	public static void main(String[] args)
	{
		int a = 10;
		int b= 20;
		
		// before swaping 
		System.out.println("Before Swap a = " + a + " b = "+b);
		// temperory variable used for swapping 
		int temp = a;
		
		// assigning b to a
		a = b;
		
		// assingning b to temp
		b = temp;
		
		// printing after swapping 
		System.out.println("after swaping a = "+ a + " b = "+b);
	}
}