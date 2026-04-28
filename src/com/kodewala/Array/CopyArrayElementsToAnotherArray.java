package com.kodewala.Array;

public class CopyArrayElementsToAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyArray copyArray = new CopyArray();
		copyArray.copyOfArray();
	}

}

class CopyArray
{
	public void copyOfArray()
	{
		int arr1[] = {20,30,40,50};
		int arr2[] = new int[arr1.length];
		
		for(int i = 0; i <= arr1.length-1; i++)
		{
			arr2[i] = arr1[i];
		}
		for(int i = 0; i <= arr2.length-1; i++)
		{
			System.out.println(arr2[i]);
		}
	}
}