package pkgShape;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public class CuboidTest {
	
	@Test
	public void Cuboid_test() {
		
		Cuboid cuboidTest = new Cuboid(1,2,3);
		
		assertTrue(cuboidTest instanceof Cuboid);
		
	}
	
	@Test
	public void Cuboid_Depth_Get_test() {
		
		Cuboid cuboidTest = new Cuboid(4,5,6);
		
		assertEquals(cuboidTest.getiDepth(), 6);
		
	}
	
	@Test
	public void Cuboid_Depth_Set_test() {
		Cuboid cuboidTest = new Cuboid(7,8,9);
		
		cuboidTest.setiDepth(10);
		
		assertEquals(cuboidTest.getiDepth(), 10);
		
	}
	
	@Test
	public void Cuboid_Volume_test() {
		
		Cuboid cuboidTest = new Cuboid(1,2,3);
		
		assertTrue(cuboidTest.volume() == 6);
		
	}
	
	@Test
	public void Cuboid_area_test() {
		
		Cuboid cuboidTest = new Cuboid(4,5,3);
		
		assertTrue(cuboidTest.area() == 94);
		
	}
	
	@Test (expected = UnsupportedOperationException.class)
	
	public void Cuboid_perimeter_test() throws UnsupportedOperationException {
		
		Cuboid cuboidTest = new Cuboid(2,2,2);
		
		cuboidTest.perimeter();
	}
	
	@Test
	public void Cuboid_SortByArea_test() {
		
		Cuboid cuboidTest1 = new Cuboid(1,2,3);
		
		Cuboid cuboidTest2 = new Cuboid(2,3,4);
		
		Cuboid cuboidTest3 = new Cuboid(5,4,3);
		
		Cuboid cuboidTest4 = new Cuboid(5,6,4);
		
		ArrayList<Cuboid> arrayTest = new ArrayList<Cuboid>();
		
		arrayTest.add(cuboidTest3);
		
		arrayTest.add(cuboidTest2);
		
		arrayTest.add(cuboidTest4);
		
		arrayTest.add(cuboidTest1);
		
		Collections.sort(arrayTest, new Cuboid.SortByArea());
		
		assertTrue(arrayTest.get(0) == cuboidTest1);
		
		assertTrue(arrayTest.get(1) == cuboidTest2);
		
		assertTrue(arrayTest.get(2) == cuboidTest3);
		
		assertTrue(arrayTest.get(3) == cuboidTest4);
		
	}
	
	@Test
	public void Cuboid_SortByVolume_test() {
		
		Cuboid cuboidTest1 = new Cuboid(1,2,3);
		
		Cuboid cuboidTest2 = new Cuboid(2,3,4);
		
		Cuboid cuboidTest3 = new Cuboid(5,4,3);
		
		Cuboid cuboidTest4 = new Cuboid(5,6,4);
		
		ArrayList<Cuboid> arrayTest = new ArrayList<Cuboid>();
		
		arrayTest.add(cuboidTest3);
		
		arrayTest.add(cuboidTest1);
		
		arrayTest.add(cuboidTest4);
		
		arrayTest.add(cuboidTest2);
		
		Collections.sort(arrayTest, new Cuboid.SortByVolume());
		
		assertTrue(arrayTest.get(0) == cuboidTest1);
		
		assertTrue(arrayTest.get(1) == cuboidTest2);
		
		assertTrue(arrayTest.get(2) == cuboidTest3);
		
		assertTrue(arrayTest.get(3) == cuboidTest4);
		
	}
	
}
