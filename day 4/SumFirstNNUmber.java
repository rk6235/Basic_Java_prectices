//Sum of First N Numbers
class SumFirstNNUmber
{
	public static void main(String[] args)
	{
		int n = 5;
		int sum = 0;
		for(int i = 1; i <= n; i++)
		{
			sum = sum + i;
		}
		System.out.println("sum of first n number of"+ n +" is " +sum);
		
	}
}