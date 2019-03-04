package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void hasDuplicates_test1() {
		

		int [] arr = {1,2,3,4,5};
		LatinSquare lq = new LatinSquare(); 
		boolean bExpected = false;
		assertFalse(lq.hasDuplicates(arr));	
		assertEquals(bExpected, LatinSquare.hasDuplicates(arr)); 
		}
	

	@Test 
	public void hasDuplicates_test2() {
		 int[] arr = {1,1,3,4,5};
		 LatinSquare lq = new LatinSquare();
		 boolean bExpected=true;
		 assertTrue(lq.hasDuplicates(arr));
		 assertEquals(bExpected, LatinSquare.hasDuplicates(arr));
	}
	

	@Test	
	public void hasDuplicates_test3() {
		int[] arr = {1,3,4,5,1}; 
		LatinSquare lq = new LatinSquare();
		assertTrue(lq.hasDuplicates(arr));
	}
	@Test
	public void hasDuplicates_test4() {
		int[] arr = { };
		LatinSquare lq = new LatinSquare();
		boolean bExpectedCondition = false;
		boolean bActualCondition;
		bActualCondition = LatinSquare.hasDuplicates(arr);
		}
	

	@Test
	public void doesElementExist_Test1()
	{
		

		int[] array1 = {1,2,3,4,5};
		int iValue = 2;
		boolean bExpectedCondition = true;
		boolean bActualCondition;
		

		bActualCondition = LatinSquare.doesElementExist(array1, iValue);
		

		assertEquals(bExpectedCondition,bActualCondition);
		
	}
	

	@Test
	public void doesElementExist_Test2()
	{
		

		int[] array1 = {1,2,3,4,5};
		int iValue = 6;
		boolean bExpectedCondition = false;
		boolean bActualCondition;
		

		bActualCondition = LatinSquare.doesElementExist(array1, iValue);
		

		assertEquals(bExpectedCondition,bActualCondition);	

	}
	

	@Test
	public void HasAllValues_Test1()
	{
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {1,2};
		boolean bExpected = true;
		boolean bActualValue = LatinSquare.hasAllValues(arr1, arr2);
		

		assertEquals(bExpected, bActualValue);
	}
	

	@Test
	public void HasAllValues_Test2()
	{
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {1,2,5};
		boolean bExpected = false;
		boolean bActualValue = LatinSquare.hasAllValues(arr1, arr2);
		

		assertEquals(bExpected, bActualValue);
	}
	

	@Test
	public void ContainsZero_Test1()
	{
		int[][] puzzle ={ {1,2,3},{2,0,1},{3,2,1} };
		LatinSquare ls = new LatinSquare(puzzle);
		boolean bExpected = true;
		boolean bActual = ls.ContainsZero();
	}
	
	@Test
	public void ContainsZero_Test2()
	{
		int[][] puzzle ={ {1,2,3},{2,0,1},{3,2,1} };
		LatinSquare ls = new LatinSquare(puzzle);
		boolean bExpected = false;
		boolean bActual = ls.ContainsZero();
	}
	

	@Test
	public void getColumn_Test()
	{
		int[][] puzzle = { {0,1,2}, {2,3,4}, {4,5,6} };
		LatinSquare ls = new LatinSquare(puzzle);
		int [] iCol = ls.getColumn(2);
		int [] bExpected = {2,4,6};
		

	}
	@Test
	public void getRow_Test()
	{
		int[][] puzzle = { {0,1,2}, {2,3,4}, {4,5,6} };
		LatinSquare ls = new LatinSquare(puzzle);
		int [] iRow = ls.getRow(2);
		int [] bExpected = {4,5,6};
		

	}
	@Test
	public void isLatinSquare_Test1()
	{
		int[][] puzzle = { {3,2,1}, {1,3,2}, {2,1,3}};
		LatinSquare ls = new LatinSquare(puzzle);
		boolean bExpected = true;
	}
	@Test
	public void isLatinSquare_Test2()
	{
		int[][] puzzle = { {3,2,1}, {2,3,4}, {4,5,6}};
		LatinSquare ls = new LatinSquare(puzzle);
		boolean bExpected = false;
	}
}
