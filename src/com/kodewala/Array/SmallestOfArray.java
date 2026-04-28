package com.kodewala.Array;

public class SmallestOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmallestNumber smallestNumber = new SmallestNumber();
		smallestNumber.getSmallestNumber();
	}

}

class SmallestNumber
{
	public void getSmallestNumber()
	{
		int arr[] = {20,30,10,50,34,40,60,55};
		int min = arr[0];
		
		for(int i = 0; i <= arr.length-1; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("Smallest number in an array is : "+min);
	}

}