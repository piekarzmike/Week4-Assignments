//*********************************************************************************************
//
//	Account.java					Author: Mike Piekarz
//
//	Lab: #4							Exercise: #3
//
// 	Create several instances of the card object in which the face/suit value is randomly selected
//
//*********************************************************************************************

//-----------------------------------------------------------------------------------------
// Exercise 3
//	Design and implement a class called Card that represents a standard playing card. Each card has
//	a suit and a face value. Create a program that deals five random cards (with replacement).
//	
//	HINT: Use numbers to represent the suit and the face value and implement a toString method
//	that returns a String corresponding to the given suit and face value numbers.
//-----------------------------------------------------------------------------------------

public class Card {

	// Declare 4 instance variables related to the face and suit of the card object
	private int suitValue;
	private int faceValue;
	private String face;
	private String suit;

	// ----------------------------------------------------------------------
	// Creates 5 instances of the card object
	// ----------------------------------------------------------------------
	public static void main(String[] args) {
		// Declare and initialize count variable
		int count = 0;

		// Create 5 instances of a card with that contains a face/suit value
		while (count < 5) {
			Card card = new Card();
			System.out.println(card);
			count++;
		}
	}

	// ----------------------------------------------------------------------
	// Constructor: Sets the face/suite value for each instance of the card object
	// ----------------------------------------------------------------------
	public Card() {

		// Randomly creates the suit value of the card
		suitValue = (int) (Math.random() * 4);

		if (suitValue == 0) {
			suit = "Hearts";
		} else if (suitValue == 1) {
			suit = "Spades";
		} else if (suitValue == 2) {
			suit = "Clubs";
		} else {
			suit = "Diamonds";
		}

		// Randomly creates the face value of the card
		faceValue = (int) (Math.random() * 13);

		if (faceValue == 0) {
			face = "Two";
		} else if (faceValue == 1) {
			face = "Three";
		} else if (faceValue == 2) {
			face = "Four";
		} else if (faceValue == 3) {
			face = "Five";
		} else if (faceValue == 4) {
			face = "Six";
		} else if (faceValue == 5) {
			face = "Seven";
		} else if (faceValue == 6) {
			face = "Eight";
		} else if (faceValue == 7) {
			face = "Nine";
		} else if (faceValue == 8) {
			face = "Ten";
		} else if (faceValue == 9) {
			face = "Jack";
		} else if (faceValue == 10) {
			face = "Queen";
		} else if (faceValue == 11) {
			face = "King";
		} else {
			face = "Ace";
		}

	}

	// ----------------------------------------------------------------------
	// Returns a string representing the face and suite value of the cards selected
	// ----------------------------------------------------------------------
	public String toString() {
		String result;
		result = "Your card is the " + face + " of " + suit;
		return result;
	}

}
