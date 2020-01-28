package assignment1;

public class Star4 extends Stars{
	protected static void four() { //A method to build the rest of the image
		System.out.println("4)"); //A line to show which part the image is on
		
		String dots=dot; //A variable to make the top dot line
		
		//For loop to build the upper dot line per the image
		for(int j=0;j<11;j++) {
			dots=dots+dot; //Builds the dot line
		}
		System.out.println(dots); //Print the dot line before the star triangle
		
		String fullLine=space+space; //Initialize the spacing to the smallest needed, being 2
		for (int i=3;i>=0;i--) {
			String stars=star; //Create our stars in comparison to the spacing this time, as the spacing is what is steadily increasing
			
			//For loop to build the stars in conjunction to how it is spaced to form the upside down triangle
			for (int j=0;j<i;j++) {
				stars=stars+starTwo; //Add two stars for needed length as needed
			}
			System.out.println(fullLine+stars); //Add the spacing and stars together to create the right line
			fullLine=fullLine+space; //Add a space to further build the triangle
		}
	}
}
