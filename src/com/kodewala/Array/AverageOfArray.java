package com.kodewala.Array;

public class AverageOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayAverage average = new ArrayAverage();
		average.getAverageOfArray();
	}

}

class ArrayAverage
{
	public void getAverageOfArray()
	{
		int arr[] = {10,20,30,40,50};
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i];
		}
		double avg = (double) sum / arr.length;
		System.out.println("Average of the array is : " + avg);
	}
}