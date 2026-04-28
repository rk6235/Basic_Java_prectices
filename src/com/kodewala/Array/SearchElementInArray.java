// Search Element in Array
package com.kodewala.Array;

public class SearchElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchElemennt searchElemennt = new SearchElemennt();
		searchElemennt.getElement();
	}

}
class SearchElemennt
{
	public void getElement()
	{
		int arr[] = {20,30,440,50,60,70};
		int search = 50;
		
		for(int i = 0; i <= arr.length-1; i++)
		{
			if(arr[i] == search)
			{
				System.out.println("element found at index : "+ i);
			}
		}
	}
}