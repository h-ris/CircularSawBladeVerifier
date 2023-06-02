/*
 * Date modified: Nov 14th, 2022
 * Description: This class prompts users to input the information of the blade and 
 *              give feedback according to user input.
 */


public class Test02 {

	public static void main(String[] args) {
		
		CircularSawBlade blade = new CircularSawBlade();
		
		double diameter, kerf;
		boolean cycle = true;
		
		int diameterCount = 0;
		int kerfCount = 0;
		int count = 0;

		/* 
		 * The loop will continue if user input "yes" at the end.
		 */
		while(cycle) {
		
		diameter = User.inputPositiveDouble("Please enter measured diameter:\n");
		blade.setDiameter(diameter);
		
		
		kerf = User.inputPositiveDouble("Please enter measured kerf:\n");
		blade.setKerf(kerf);
		
		/* 
		 * output the information for the blade
		 */
	    System.out.printf("%s%n", blade.toString());
	    
	    
	    /* 
	     *  message to tell the user if diameter and kerf are within tolerance
	     */
		if(CircularSawBladeVerifier.isDiameterInTolerance(blade))
			System.out.println("Diameter in tolerance.");
		else
			System.out.println("Diameter out of tolerance.");
		if(CircularSawBladeVerifier.isKerfInTolerance(blade))
			System.out.println("Kerf in tolerance.");
		else
			System.out.println("Kerf out of tolerance.");
	
		
		
		/* 
		 *  collect a count of, and display the blade entered to the user
		 */
		boolean keepGoing = true;
		while(keepGoing) {
			/* 
			 *  the number of blades entered
			 */
			count++;
			System.out.printf("Blades entered: %d%n", count);
			
		/* 
		 *  the number of diameters out of tolerance
		 */
		if(!CircularSawBladeVerifier.isDiameterInTolerance(blade))
			diameterCount++;
		else
			diameterCount = diameterCount;
	    
		System.out.printf("Diameter(s) out of tolerance: %d%n", diameterCount);
		
		/* 
		 *  the number of kerfs out of tolerance
		 */
		if(!CircularSawBladeVerifier.isKerfInTolerance(blade))
			kerfCount++;
		else
			kerfCount = kerfCount;
	    
		System.out.printf("Kerf(s) out of tolerance: %d%n", kerfCount);
		    
		    
		    keepGoing = false;
		}
		
		

		System.out.println("Program by Huixin Xu");

		
		/* 
		 *  Ask if there is more data to enter (yes, no) and continue.
		 *  If yes, processing would repeat starting from the beginning.
		 */
		String loopDecision = User.inputString("Continue (yes/no)? ");
		
		if(loopDecision.equals("Yes")||loopDecision.equals("yes")||loopDecision.equals("YES")
				||loopDecision.equals("YEs")||loopDecision.equals("yES")||loopDecision.equals("YeS"))
			cycle = true;
		
		else
			cycle = false;
			
		}
		
		System.out.println("The program has shut down.");

	}
}

/*
 * References:
 * [1] C. Baylor. What Does the Term "Kerf" Mean in Woodworking?. thesprucecrafts.com.
 * https://www.thesprucecrafts.com/definition-of-kerf-3536563 (Accessed Oct 28, 2022).
 */
