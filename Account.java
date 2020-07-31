//*********************************************************************************************
//
//	Account.java					Author: Mike Piekarz
//
//	Lab: # 4						Exercise: #2
//
// 	Create several instances of an object and return the number of instanced that were created
// 		
//*********************************************************************************************

//-----------------------------------------------------------------------------------------
// Exercise 2
//	Create a new class called Account with a main method that contains the following:
//		• A static variable called numAccounts, initialized to 0.
//		• A constructor method that will add 1 to the numAccounts variable each time a new
//		  Account object is created.
//		• A static method called getNumAccounts(). It should return numAccounts.
//	Test the functionality in the main method of Account by creating a few Account objects, then
//	print out the number of accounts.
//-----------------------------------------------------------------------------------------

public class Account {

	// Declaring and initializing a static variable
	private static int numAccounts = 0;

	// Perform loop to create several Account objects and print the number of
	// instances that were created
	public static void main(String[] args) {

		while (numAccounts < 4) {
			Account account = new Account();
			System.out.println(numAccounts);
		}
	}

	// ----------------------------------------------------------------------------------
	// Constructor: Increase the the initialized variable by one each time an new
	// instance of the Account object is created
	// ----------------------------------------------------------------------------------
	public Account() {
		numAccounts++;
	}

	// ----------------------------------------------------------------------------------
	// Returns the number of instances the Account object has been created
	// ----------------------------------------------------------------------------------
	public static int getNumAccounts() {
		return numAccounts;
	}

}
