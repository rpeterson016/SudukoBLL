package pkgHelper;

import java.util.Arrays;

public class LatinSquare {
	private int[][] LatinSquare;
	public LatinSquare() {
		super();
		}
	
/*
 * Pass in a given puzzle, set the LatinSquare.
 * 
 * @param - LatinSquare puzzle
 */
	public LatinSquare(int[][] puzzle) {
		super();
		this.LatinSquare = puzzle;
		}

/*
 * Returns LatinSquare instance attribute.
 * 
 * @return - Instance of the LatinSquare
 */
	public int[][] getLatinSquare() {
		return LatinSquare;
		}
	
/*
 * Set LatinSquare instance attribute.
 * 
 * @param latinsquare - instance of possible LatinSquare
 */
	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
		}
	
/*
 * Pass in one dimensional array and a value, if iValue exists in array,
 * returns true.
 * 
 * @param iValue - integer
 * @param arr - array
 * 
 * @return - boolean indicating if iValue exists in arr.
 */
	public static boolean doesElementExist(int[] arr, int iValue){
		for (int x = 0; x < arr.length; x++){
			if (arr[x] == iValue) {
				return true;
				}
			}
		return false;
		}
	
/*
 * Pass in a one-dimension array, pass back true if there is a duplicate value.
 * 
 * @param arr - One dimensional array to check for duplicates.
 * 
 * @return - Boolean indicating if there are any duplicates.
 */
	public static boolean hasDuplicates (int[] arr){
		int[] arrCopy = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arrCopy);
		for (int i = 0; i < arr.length -1; i++){
			if (arrCopy[i] == arrCopy[i+1]){
				return true;
				}
			}
		return false;
		}

/*
 * Return 'true' if every element from arr2 is in arr1.
 * 
 * @param arr1 - target array
 * @param arr2 - source array
 * 
 * @return - Boolean indicating if every element from 
 * source array is in target array.
 */
	public static boolean hasAllValues(int[] arr1, int[] arr2){
		boolean hasAllValues = true;
		for (int j = 0; j < arr2.length; j++) {
			boolean bFound = false;
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] == arr2[j]) {
					bFound = true;
					break;
					}
				}
			if (bFound == false) {
				hasAllValues = false;
				break;
				}
			}
		return hasAllValues;
		}
	
/*
 * Return 'true' if any element in the LatinSquare is a zero.
 * 
 * @return - Boolean indicating if any element in the LatinSquare is zero.
 */
	public boolean ContainsZero() {
		for (int i = 0; i < LatinSquare.length; i++) {
			for (int j = 0; j < LatinSquare.length; j++) {
				if (LatinSquare[i][j] == 0) {
					return true;
				}
			}
		}
		return false;
	}
	
/*
 *  Return a one-dimension array from a given row in the LatinSquare.
 *  
 *  @param iRow - Given row of the two dimensional array to return.	
 *  
 *  @return - One dimensional array of the given row.
 */
	public int[] getRow(int iRow) {
		return LatinSquare[iRow];
	}
	
/*
 * Return a one-dimension array from a given column in the LatinSquare.
 * 
 * @param iCol - The column you want returned from the two-dimensional array.
 * 
 * @return - One dimensional array of values for the given column.
 */
	public int[] getColumn(int iCol) {
		int [] column_array = new int[LatinSquare.length]; 
		for (int i = 0; i < LatinSquare.length; i++) {
			column_array[i] = LatinSquare[i][iCol];
		}
		return column_array;
	}
	
/*
 * Returns 'true' if: Each row and column doesn't contain duplicates 
 * If each element in the first row is found in every other row 
 * If each element in the first column is found in every other column.
 * 
 * @return - Boolean indicating if the two-dimensional array is a LatinSquare.
 */
	
	public boolean isLatinSquare() {

		boolean isLatinSquare = true;


			for (int i = 1; i < LatinSquare.length; i++) {

			if (!hasAllValues(getRow(0), getRow(i))) {
				return false;
			}

		}

		for (int j = 1; j < LatinSquare.length; j++) {

			if (!hasAllValues(getColumn(0), getColumn(j))) {
				return false;
			}
		}
		
		return isLatinSquare;
	}
}


		