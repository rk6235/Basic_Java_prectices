package com.kodewala.Array;

public class CountOddNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddNumber oddNumber = new OddNumber();
		oddNumber.countOddArray();
	}

}

class OddNumber
{
	public void countOddArray()
	{
		int arr[] = {1,2,3,4,5,6,7,8,9,12,11,13,14,15,16,17,18,19};
		int count = 0;
		System.out.print("total number of odd number in an array is : ");
		
		for(int i = 0; i <= arr.length-1; i++)
		{
			if(arr[i] % 2 != 0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}