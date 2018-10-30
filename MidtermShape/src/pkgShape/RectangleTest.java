package pkgShape;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void Rectangle_test() {
		
		Rectangle rectangleTest = new Rectangle(2,2);
		
		assertTrue(rectangleTest instanceof Rectangle);
		
	}

	@Test
	public void Rectangle_Width_Get_test() {
		
		Rectangle rectangleTest = new Rectangle(5,1);
		
		assertEquals(rectangleTest.getiWidth(), 5);
		
	}
	
	@Test
	public void Rectangle_Length_test() {
		
		Rectangle rectangleTest = new Rectangle(1,9);
		
		assertEquals(rectangleTest.getiLength(), 9);
		
	}
	
	@Test
	public void Rectangle_Width_Set_test() {
		
		Rectangle rectangleTest = new Rectangle(1,1);
		
		rectangleTest.setiWidth(7);
		
		assertEquals(rectangleTest.getiWidth(), 7);
		
	}
	
	@Test
	public void Rectangle_Length_Set_test() {
		
		Rectangle rectangleTest = new Rectangle(1,1);
		
		rectangleTest.setiLength(5);
		
		assertEquals(rectangleTest.getiLength(), 5);
		
	}
	
	@Test
	public void Rectangle_Area_test() {
		
		Rectangle rectangleTest = new Rectangle(8,7);
		
		assertTrue(rectangleTest.area() == 56);
		
	}
	
	@Test
	public void Rectangle_Perimeter_test() {
		
		Rectangle rectangleTest = new Rectangle(7,8);
		
		assertTrue(rectangleTest.perimeter() == 30);
		
	}
	
	@Test
	public void Rectangle_compareTo_test() {
		Rectangle[] rectangleArray = new Rectangle[4];
		
		Rectangle rectangleTest1 = new Rectangle(1,10);
		
		Rectangle rectangleTest2 = new Rectangle(2,10);
		
		Rectangle rectangleTest3 = new Rectangle(3,10);
		
		Rectangle rectangleTest4 = new Rectangle(4,10);
		
		rectangleArray[0] = rectangleTest2;
		
		rectangleArray[1] = rectangleTest3;
		
		rectangleArray[2] = rectangleTest1;
		
		rectangleArray[3] = rectangleTest4;
		
		Arrays.sort(rectangleArray);
		
		assertTrue(rectangleArray[0] == rectangleTest1);
		
		assertTrue(rectangleArray[1] == rectangleTest2);
		
		assertTrue(rectangleArray[2] == rectangleTest3);
		
		assertTrue(rectangleArray[3] == rectangleTest4);
		
	}

}
