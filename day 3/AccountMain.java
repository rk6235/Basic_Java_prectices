class Account
{
	public static void Transaction()
	{
		System.out.println("Withdraw");
		System.out.println("Balance Enquiry");
	}
}

class AccountDetails
{
	public static void main(String[] args)
	{
		System.out.println("print all account details ");
		System.out.println("Account Holder Name : Rahul Kumar");
		System.out.println("Branch              : State Bank Of India");
		System.out.println("Account Number      : 123456789");
		System.out.println("IFSC                : SBIN0028");
		Account.Transaction();
	}
}