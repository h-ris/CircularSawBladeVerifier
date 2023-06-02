/*
 * Date modified: Nov 14th, 2022
 * Description: This class is used to indicate if the circular saw blade
 *              diameter and kerf is within tolerance.
 */

public class CircularSawBladeVerifier {
	
   /*
	* EPSILON with value 0.015625: one-64th of an inch 1/64
	*/
	public static final double EPSILON = 0.015625;
	
	/*
	 * This is a utility class with only static members, prevent
	 * Instantiation.
	 */
	private CircularSawBladeVerifier() {}
	
	
	/*
	 * check the diameter does not differ more than EPSILON and expected diameter
	 */
	public static boolean isDiameterInTolerance(CircularSawBlade blade) {
		
		boolean difference;
		difference = Math.abs(blade.getDiameter() - CircularSawBlade.EXPECTED_DIAMETER) <= EPSILON;
			return difference;
		
	}
	
	
    /*
	 *  check the kerf does not differ more than EPSILON and expected kerf
	 */
	public static boolean isKerfInTolerance(CircularSawBlade blade) {

		boolean difference;
		difference = Math.abs(blade.getKerf() - CircularSawBlade.EXPECTED_KERF) <= EPSILON;
			return difference;
		
	}
}

/*
 * References:
 * [1] C. Baylor. What Does the Term "Kerf" Mean in Woodworking?. thesprucecrafts.com.
 * https://www.thesprucecrafts.com/definition-of-kerf-3536563 (Accessed Oct 28, 2022).
 */
