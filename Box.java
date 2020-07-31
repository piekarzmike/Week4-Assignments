//*********************************************************************************************
//
//	Box.java					Author: Mike Piekarz
//
//	Lab: # 4					Exercise: #1
//
// 	Print out to the screen a set of * (star) and 'c' characters by calling methods
//	that are overloaded
// 		
//*********************************************************************************************

//-----------------------------------------------------------------------------------------
// Exercise 1
//	In your Box class from the previous lab, add an overloaded method for printBox that takes 1
// 	parameter: char c. This version should do the same as the printBox version with no parameters,
// 	except use the character c instead of *. Add code in the main method to invoke the second
// 	version of the printBox method and run it.
//-----------------------------------------------------------------------------------------

public class Box {
	private int size = 0;

	public static void main(String[] args) {
		// Declare and instantiate a object reference variable called box
		Box box = new Box();
		// Set the size of the object reference variable Box
		box.size = 5;

		// Call printBox method
		box.printBox();
		// Call printBox method
		box.printBox('c');
	}

	// -----------------------------------------------------------------------------------------
	// Create printBox method
	// -----------------------------------------------------------------------------------------
	public void printBox() {
		// Declare and initialize the count and rowCount variable
		int colCount = 0;
		int rowCount = size;

		// Print * out in a pattern in accordance with it's size
		while (rowCount != 0) {
			while (colCount < size) {
				System.out.print("*"); // Print * in same line per the number of times stated in the size variable
				colCount++;
			}
			// Set print area to next line
			System.out.println(""); 
			rowCount--;
			colCount = 0; // Resets count variable to zero
		}

	}

	// -----------------------------------------------------------------------------------------
	// Create another printBox method
	// -----------------------------------------------------------------------------------------
	public void printBox(char c) {
		// Declare and initialize the count and rowCount variable
		int colCount = 0;
		int rowCount = size;

		// Print the supplied parameter out in a pattern in accordance with it's size
		while (rowCount != 0) {
			while (colCount < size) {
				System.out.print(c); // Print c in same line per the number of times stated in the size variable
				colCount++;
			}
			// Set print area to next line
			System.out.println(""); 
			rowCount--;
			colCount = 0; // Resets count variable to zero
		}

	}

}
