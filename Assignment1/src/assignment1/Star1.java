package assignment1;

public class Star1 extends Stars{
	protected static void one() { //The method used to build the first section of the image
		String stars=star; //Defines stars as a single star to be built upon
		String dots=dot; //Defines dots as a single dot to be built into the dot line by the end
		
		System.out.println("1)"); //Prints the number we are in this pattern, being 1
		
		//A for loop to build the stars variable, printing it at each stage
		for (int i=0;i<4;i++) { 
			System.out.println(stars); //Prints out the star line at each state
			stars=stars+star; //Adds a star to the line for the next loop
		}
		
		//A for loop to build the dot line at the bottom
		for(int j=0;j<8;j++) {
			dots=dots+dot; //builds the bottom line dot by dot
		}
		System.out.println(dots); //prints the bottom line
	}
}
