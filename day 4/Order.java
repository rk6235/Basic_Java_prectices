class OrderDetails
{
	public static void main(String[] args)
	{
		String Order_ID = args[0];
		String Item_Name = args[1];
		String Price = args[2];
		String Quantity = args[3];
		String State = args[4];
		String Delivery_Address = args[5];
		System.out.println("OrderID is : "+Order_ID);
		System.out.println("ItemName is :"+Item_Name);
		System.out.println("Price is:"+Price);
		System.out.println("Quantity is :"+Quantity);
		System.out.println("State is :"+State);
		System.out.println("DeliveryAddress ia : "+Delivery_Address);
	}
}