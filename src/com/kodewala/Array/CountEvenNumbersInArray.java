package com.kodewala.Array;

public class CountEvenNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenNumber evenNumber = new  EvenNumber();
		evenNumber.getEvenNumbberCount();
	}

}
class EvenNumber
{
	public void getEvenNumbberCount()
	{
		int arr[] = {1,2,3,4,5,6,7,8,9,12,13,14,15,16};
		int count = 0;
		
		for(int i = 0; i<= arr.length-1; i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.println(arr[i]);
				count++;
			}
		}
		System.out.println("even number in an arrya is : "+ count);
		
	}
}