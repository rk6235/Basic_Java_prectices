// print all element in an array.
package com.kodewala.Array;

public class PrintElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintArray printArray = new PrintArray();
		printArray.getElement();
	}

}

class PrintArray 
{
	public void getElement() 
	{
		int[] arr = {10,20,30,40,50};
		System.out.println("Elements in array are : ");
		for(int i = 0; i <= arr.length-1; i++)
		{
				System.out.println(arr[i]);
		}
	}
}
