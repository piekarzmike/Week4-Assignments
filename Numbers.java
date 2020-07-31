//*********************************************************************************************
//
//	Account.java					Author: Mike Piekarz
//
//	Lab: #4							Exercise: #4
//
// 	Create an initializer list to instantiate an array and loop through each index spot and identify 
//  the next highest integer in relation to the current index
// 		
//*********************************************************************************************

//-----------------------------------------------------------------------------------------
// Exercise 4
// 	Write a Java Class (Numbers.java) that contains a method called nextLargest. This method
//	should accept an array of numbers and output, for each number in the array, the next bigger
//	number. For example, if the array is: {78, 22, 56, 99, 12, 14, 17, 15, 1, 144, 37, 23, 47, 88, 3, 19}
//	the output should look like the following (? is a placeholder):
//	78: 88
//	22: 23
//	56: 78
//	99: 144
//	12: 14
//	14: 15
//	17: 19
//	15: 17
//	1: 3
//	144: 2147483647
//	37: 47
//	23: 37
//	47: 56
//	88: 99
//	3: 12
//	19: 22
//	
//	NOTE 1: If there is no bigger number in the sequence, just display the value of
//	Integer.MAX_VALUE.
//
//	NOTE 2: ? should be replaced with the appropriate number
//	Test the method by creating an array and calling it from the main method.
//-----------------------------------------------------------------------------------------
// Import the Arrays class from the Java.util package 

import java.util.Arrays;

public class Numbers {
	
	// Declare and instantiate the index variable to 0.  This will be used as the index spot for the array
	private static int index = 0; 

	public static void main(String[] args) {
		// Instantiate an array and provide the initial values (original array)
		int[] array = {78, 22, 56, 99, 12, 14, 17, 15, 1, 144, 37, 23, 47, 88, 3, 19};
		
		// Call nextLargest method to select the next largest number for each index value of the array
		nextLargest(array);
	}

	//======================================================================================
	// Create the nextLargest method that will select the next largest number of the array and print the values
	//=====================================================================================
	
	public static void nextLargest(int [] array) {
		// Create a copy of the array (new array)
		int[] newArray = Arrays.copyOf(array, array.length);

		// Sort the values in ascending order of the newly created array (new array)
		Arrays.sort(newArray);

		// Perform loop to compare values of the original array to the new array that was sorted.  
		//  + If value of original array is less than new array increase index of the new array.
		//  + If new array value is greater; print values, increase index of original array, and reset old array index to zero
		while (index < array.length-1){
			for (int sortIndex = 0; sortIndex < array.length; sortIndex++) {
				if (array[index] < newArray[sortIndex]) {
					System.out.println(array[index] + ": " + newArray[sortIndex]);
					index++;
					sortIndex = 0; 
					// If index spot exceeds length of original array exit program
					if (index>array.length-1) {
						System.exit(0);
					}
				}
			}
			
			// If value in array is the highest integer provide the max value allowed for an integer, print values, and increase index
			if (array[index] < array.length);{
				System.out.println(array[index] + ": " + Integer.MAX_VALUE);
				index++;
			}	
		}
	}
	
}
