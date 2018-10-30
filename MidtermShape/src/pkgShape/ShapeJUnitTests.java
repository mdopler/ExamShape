package pkgShape;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public class ShapeJUnitTests {
	
	//Rectangle tests.

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
	
	
	@Test
	public void Cuboid_test() {
		
		Cuboid cuboidTest = new Cuboid(1,2,3);
		
		assertTrue(cuboidTest instanceof Cuboid);
		
	}
	
	@Test
	public void Cuboid_Depth_Get_test() {
		
		Cuboid cubTest = new Cuboid(4,5,6);
		
		assertEquals(cubTest.getiDepth(), 6);
		
	}
	
	@Test
	public void Cuboid_Depth_Set_test() {
		Cuboid cubTest = new Cuboid(7,8,9);
		
		cubTest.setiDepth(10);
		
		assertEquals(cubTest.getiDepth(), 10);
		
	}
	
	@Test
	public void Cuboid_volume_test() {
		Cuboid cubTest = new Cuboid(1,2,3);
		assertTrue(cubTest.volume() == 6);
	}
	
	@Test
	public void Cuboid_area_test() {
		Cuboid cubTest = new Cuboid(1,2,3);
		assertTrue(cubTest.area() == 22);
	}
	
	@Test (expected = UnsupportedOperationException.class)
	public void Cuboid_perimeter_test() throws UnsupportedOperationException {
		Cuboid cubTest = new Cuboid(1,2,3);
		cubTest.perimeter();
	}
	
	@Test
	public void Cuboid_SortByVolume_test() {
		Cuboid cubTest1 = new Cuboid(1,2,3);
		Cuboid cubTest2 = new Cuboid(3,3,2);
		Cuboid cubTest3 = new Cuboid(3,2,4);
		Cuboid cubTest4 = new Cuboid(4,6,2);
		Cuboid cubTest5 = new Cuboid(5,5,5);
		ArrayList<Cuboid> ar = new ArrayList<Cuboid>();
		ar.add(cubTest3);
		ar.add(cubTest2);
		ar.add(cubTest5);
		ar.add(cubTest4);
		ar.add(cubTest1);
		Collections.sort(ar, new Cuboid.SortByVolume());
		assertTrue(ar.get(0) == cubTest1);
		assertTrue(ar.get(1) == cubTest2);
		assertTrue(ar.get(2) == cubTest3);
		assertTrue(ar.get(3) == cubTest4);
		assertTrue(ar.get(4) == cubTest5);
	}
	
	@Test
	public void Cuboid_SortByArea_test() {
		Cuboid cubTest1 = new Cuboid(1,2,3);
		Cuboid cubTest2 = new Cuboid(3,3,2);
		Cuboid cubTest3 = new Cuboid(3,2,4);
		Cuboid cubTest4 = new Cuboid(4,6,2);
		Cuboid cubTest5 = new Cuboid(5,5,5);
		ArrayList<Cuboid> ar = new ArrayList<Cuboid>();
		ar.add(cubTest3);
		ar.add(cubTest2);
		ar.add(cubTest5);
		ar.add(cubTest4);
		ar.add(cubTest1);
		Collections.sort(ar, new Cuboid.SortByArea());
		assertTrue(ar.get(0) == cubTest1);
		assertTrue(ar.get(1) == cubTest2);
		assertTrue(ar.get(2) == cubTest3);
		assertTrue(ar.get(3) == cubTest4);
		assertTrue(ar.get(4) == cubTest5);
	}
}
