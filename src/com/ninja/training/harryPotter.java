package com.ninja.training;
import java.util.Arrays;
import java.util.Scanner;
public class harryPotter {
	
	public static void main(String[] args) {
		
	
	String HP_movieName[] = {"HP_ the Philosopher's Stone ","HP_the Chamber of Secrets",		
	   "HP_the Prisoner of Azkaban","HP_the Goblet of Fire", "HP_ the Order of the Phoenix","HP_the Half-Blood Prince","HP_the Deathly Hallows – Part 1","HP_the Deathly Hallows – Part 2"};	
	int movieNo[]= {1,2,3,4,5,6,7,8};
	int movieYr[]= {2001,2002,2004,2005,2007,2009,2010,2011};
	
	System.out.println("Length is : "+ movieYr.length);
	
	// find	 How many years elapsed between first and last movie of Harry Potter? 
	int yrElapsed =movieYr[movieYr.length-1] -movieYr[0];	
	{
		System.out.println("Year Elapsed for movie Harry Potter : "+yrElapsed);	
		System.out.println("****1st qn ended*****");
	}
	
	// Approx years for a movie release = (Last movie Release Year – First Movie Release year) / Total Number of Movies
	int appyrsofMovierelease= (movieYr[7] -movieYr[0]) /movieNo[7];
	{
		System.out.println("Approx years for a movie release  : "+appyrsofMovierelease);	
		System.out.println("*****2nd qn ended*****");
	}
	
	//Get a number as input from user and print the name of the movie.
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number of movie and see the Name of the movie : ");
	
	int mno = input.nextInt();
	System.out.println("Movie Name is : "+ HP_movieName[mno]);
	//input.close();
	System.out.println("*****3rd qn ended*****");
	
	// user enters input as 1, print ”First movie”,  8, print “Last movie”.
	//For anything else, print “Not First or Last movie”
	
	Scanner input1 = new Scanner(System.in);
	System.out.println("Enter the number of movie : ");
	
	int pm1 = input1.nextInt();
	switch (pm1) {
	case 0:
	System.out.println("Its a first movie!");
	break;
	case 7:
	System.out.println("Its a last movie!");
	break;
	default:
	System.out.println("Not first or last movie!");
	
	}//end of switch
	
	
	System.out.println("*******4th qn ended*****");
	input1.close();
	//Keep getting input from user and print the name of the movie till the user enters an invalid input.
	
	Scanner input2 = new Scanner(System.in);
	int mnumber;
	do {
		
		System.out.println("Enter movie number to display name: ");
	mnumber = input2.nextInt();
		System.out.println("Movie Name : "+ HP_movieName[mnumber]);
		
	} while (mnumber <HP_movieName.length); 
	
		
	System.out.println("***5th qn ended*");
	
    // for each loop 
    for ( int temp=0; temp<8; temp++)
    {
      System.out.println("Movie Number is:"+ movieNo[temp] + ", Movie Name is:"+ HP_movieName[temp] + " and Movie Year is: " + movieYr[temp]);
     // System.out.println(Arrays.toString(movieYr));
    //  System.out.println(movieYr[temp]);
    }
		
    Scanner input3= new Scanner(System.in);
    int array[] = new int [5];
    for ( int i= 0;i< array.length; i++)    	
   {    
	   array[i]=input3.nextInt();	   
   }
    
    System.out.println(Arrays.toString(array));	
	for (int j: array) 
	{
        System.out.println(HP_movieName[j]);
	}	
	
	
	}
}

	


