/*
 *  will display the info about me
 */

/*  This the IBG 1st Assignment
 *  public is the class modifier
 *  and Assignment is the class name
 */
public class Assignment {
	
	// main static method initially to be invoke upon program execution
	public static void main(String[] args){
		// Constructing person01 Object from the AboutMe constructor
		// passing three parameters
		AboutMe person01 = new AboutMe("Renz Jayson Mallari",32,"Asian");
		// printing and invoking AboutMe variables with the person01 
		// object parameter values.
		System.out.println("Name: " + person01.name +
				"\nAge: " + person01.age + "\nRace: "+ person01.race);
	}

}
