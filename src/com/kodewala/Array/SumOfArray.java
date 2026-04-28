// Sum of Array Elements
package com.kodewala.Array;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySum arraySum = new ArraySum();
		arraySum.getArraySum();
	}

}

class ArraySum
{
	void getArraySum()
	{
		int arr[] = {10,20,30,40,50,60};
		int sum = 0;
		
		for(int i = 0; i <= arr.length-1; i++)
		{
			sum = sum + arr[i];
			
		}
		System.out.println("the sum of all elements in array are : "+ sum);
	}
}