package com.kodewala.Array;
class NaturalNumber {
	
	public void getNumber()
	{
		int numbers[] = new int[10];
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		numbers[5] = 6;
		numbers[6] = 7;
		numbers[7] = 8;
		numbers[8] = 9;
		numbers[9] = 10;
		
		for(int i = 0; i<= numbers.length-1; i++) {
			
			//System.out.println(numbers[i]);
			
			//if(numbers[i] == 5) {
				
				System.out.println(numbers[i]);
	
			//}
		}
		
		
		
	}
}
public class ArrayDay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NaturalNumber naturalNumber = new NaturalNumber();
		naturalNumber.getNumber();
	}

}
