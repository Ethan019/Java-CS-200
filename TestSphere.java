
import java.util.*;

public class TestSphere {
	//******************************************************************************
	// NAME: Ethan Massingill
	// DATE: 10/10/2020
	// HOURS: 5 hours
	// CLASS: CSCI 200 Summer 2020
	// ASSSIGNMENT: test program for program-ch04
	// PURPOSE: test the Sphere class
	//******************************************************************************
	

	   

	        public static void main (String[] args ) {

	            Scanner scan = new Scanner(System.in);

	            double dia;
	            System.out.print("Enter diameter: ");
	            dia=scan.nextDouble();
	            Sphere s;
	            s = new Sphere(dia);
	            
	            System.out.println(s);

	       

	        }
	    

}
