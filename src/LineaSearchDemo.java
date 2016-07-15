
/*
 * Student: Eduardo Aguirre
 * Session 7
 * Assignment 2
 * Java Class that searches for a Number in an Array
 * User enters the number of values in the Array, then enter the number to search 
 *  
 */


import java.util.Scanner; //Import the Scanner Java Class that allows the User to Input

public class LineaSearchDemo {

	public static void main(String[] args) { //Main method to start the Program
		int i; //Counter
		int number; //Number store in the Array
		int search; //Value to be searched
		int array[]; //Array to store the numbers
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in); //Creates an instance of the Stack 
		System.out.print("Number of Elements: ");  //Prompts the user to enter the Number of elements in the Array
		number =sc.nextInt(); //Stores the number of elements in the Array 
		array = new int [number]; //Create the array with the Number of Elements entered by the User 
		
		System.out.println("Enter a number:"); //Prompts the user to enter the number to be searched
		for (i=0; i<number;i++) // Set counter i to 0; while counter is lower than the number of items in the array executes code below.
			                    //increments the counter by 1
		{
			array[i]=sc.nextInt(); //enters the number entered by the user in the array
		}
		
		System.out.print("Search for this value: "); //Prompts the user to enter the number to be searched
		search=sc.nextInt(); //stores the value entered by the user
		
		for (i=0;i<number;i++) // Set counter i to 0; while counter is lower than the number of items in the array executes code below.
            //increments the counter by 1 
			
		{
			if (array[i]==search) //If the element of the array equals the value the user enters to be searched  then executes code below 
			{
				System.out.println("Number " +search + " is a this position " + (i +1)); //returns the position on the Array
				break;
			}
		}
		
		if (i==number) //If the counter equals the number on the array prints out that the element is missing
		{
			System.out.println("Number does not exist");
		}
		
	}

}
