// Largest Number in Array
package com.kodewala.Array;

public class LargestOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestNumber largestNumber = new LargestNumber();
		largestNumber.getLargestNumber();
	}

}

class LargestNumber
{
	void getLargestNumber()
	{
		int arr[] = {20,30,10,50,34,40,60,55};
		int max = arr[0];
		
		for(int i = 1; i <= arr.length-1; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		System.out.println("Largest number in an array is : "+max);
	}
}