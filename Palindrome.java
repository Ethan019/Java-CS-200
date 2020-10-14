//****************************************************************************************
// NAME: Ethan Massingill
// DATE: 9/17/20-9/18/20
// HOURS: 2-3 hours
// CLASS: CSCI 200 Fall 2020
// ASSSIGNMENT: Palindrome Project
//****************************************************************************************


import java.util.*;

public class Palindrome
{

  public static Boolean isPalindrome (String s)
  {
    //code that creats two strings then reverses string b.
    StringBuilder a = new StringBuilder();
      a.append (s);
    String b = a.reverse().toString();
    //ignores all cases and removes all non characters from the statments, checks if strings match
      return (b.replaceAll ("[\\W]", "").equalsIgnoreCase (s.replaceAll ("[\\W]", "")));
    //At first I put a if and else conditions instead of just pure return,
    // after messing around found the code seemed less clutered if the while loop handled it.
  }

  public static void main (String[]args)
  {
    //reading in scanner
    Scanner scan = new Scanner(System.in);
    String word = scan.nextLine();

    while (!word.equals ("QUIT"))
      {
	//passes isPalindrome the word
	isPalindrome(word);

	if (isPalindrome(word))
	  System.out.println ("the string [" + word + "] IS a palindrome.");
	//false branch
	else

	  System.out.println ("the string [" + word + "] IS NOT a palindrome.");

	//reads next user input
	word = scan.nextLine ();
      }
  }
}
