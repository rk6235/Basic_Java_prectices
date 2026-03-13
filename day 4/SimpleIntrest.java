import java.util.*;
class SimpleIntrest
{
	public static void main(String[] args) {
		System.out.println("Enter the principal amount ");
	Scanner sc = new Scanner(System.in);
	int p = sc.nextInt();
	System.out.println("Enter the rate ");
	int r = sc.nextInt();
	System.out.println("Enter time");
	int t = sc.nextInt();
	
	int si = (p * r * t)/100;
	System.out.println("Simple intrest is :"+si);
	}
}