package com.kodewala.Array;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ReverseArray reverseArray = new ReverseArray();
		 reverseArray.getarray();
	}

}

class ReverseArray
{
	public void getarray()
	{
		int arr[] = {10,20,30,40,50,60};
		for(int i = arr.length-1; i >=0; i--)
		{
			System.out.println(arr[i]);
		}
		
	}
}