package com.kodewala.Array;

public class ElectronicItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an array of electronic items with their prices
		String[] products = { "Laptop", "Smartphone", "Tablet","Smartwatch", "Headphones"};
		int[] prices = { 50000, 30000, 20000, 15000, 10000};
		
		int maxPrice = 0;
		
		for(int i = 1; i <= prices.length-1;i ++)
		{
			if(prices[i] > prices[maxPrice])
			{
				
				maxPrice = i;
			}
			
		}
		System.out.println("The product with the highest price is: "+ products[maxPrice] + " with a price of Rs."+ prices[maxPrice]);
	}

}
