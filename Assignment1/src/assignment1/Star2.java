package assignment1;

public class Star2 extends Stars{
	protected static void two() { //A method to build the second segment of the image provided
		String dots=dot; //A variable to build our upper line of dots
		System.out.println("2)"); //Prints where we are in the pattern, being part 2
		
		//A for loop to build up the upper line of dots
		for(int j=0;j<9;j++) {
			dots=dots+dot; //Build the line of dots bit by bit
		}
		System.out.println(dots); //give our line of dots to the terminal
		
		//A for loop to build the lines of stars
		for (int i=3;i>=0;i--) {
			String stars=star; //A variable to create the lines of stars
			
			//A for loop to rebuild the line of stars for each length
			for (int j=0;j<i;j++) {
				stars=stars+star; //Build the stars to the appropriate length
			}
			System.out.println(stars); //print our star lines
		}
	}
}
