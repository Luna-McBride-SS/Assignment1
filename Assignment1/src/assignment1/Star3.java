package assignment1;

public class Star3 extends Stars{
	protected static void three() { //A method to build the third section of the image
		System.out.println("3)"); //Prints out the section it is on, being 3
		
		String stars=star; //The variable to build the stars into a triangle when combined with spaces
		
		//For loop to build the spacing to appropriately display the stars
		for (int i=3;i>=0;i--) {
			String fullLine=space+space; //Start with the baseline spacing of 2
			
			//For loop to build the remaining spacing in addition to the two
			for (int j=0;j<i;j++) {
				fullLine=fullLine+space; //Add one space
			}
			System.out.println(fullLine+stars); //Print the line with the spacing and star ratio
			stars=stars+starTwo; //Add two stars for the triange
		}
		
		String dots=dot; //A variable to build the dot line at the bottom
		
		//For loop to build the dot line at the end
		for(int j=0;j<10;j++) {
			dots=dots+dot; //Add a dot for each run
		}
		System.out.println(dots); //Print our dot line
	}
}
