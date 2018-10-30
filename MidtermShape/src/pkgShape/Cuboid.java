package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle implements Comparable<Object> {
	
	private int iDepth;
	
	public Cuboid(int width, int length, int depth) {
		
		super(width, length);
		
		this.iDepth = depth;
	}

	public int getiDepth() {
		
		return iDepth;
		
	}
	
	public void setiDepth(int depth) {
		
		this.iDepth = depth;
		
	}
	
	public double volume() {
		
		return this.getiLength() * this.getiWidth() * this.iDepth;
		
	}
	
	@Override
	public double area() {
		
		return this.getiLength() * this.getiWidth() * 2 + this.getiLength() * this.iDepth * 2 + this.getiWidth() * this.iDepth * 2;
		
	}
	
	@Override
	public double perimeter() throws UnsupportedOperationException {
		
		throw new UnsupportedOperationException("A Cuboid does not have a perimeter");
		
	}
	
	
	@Override
	public int compareTo(Object cuboid) {
		
		return (int) (((Cuboid) this).volume() - ((Cuboid) cuboid).volume());
		
	}
	
	public static class SortByVolume implements Comparator<Object> {
		
		SortByVolume() {}

		
		public int compare(Object cuboid1, Object cuboid2) {
			
			return (int) (((Cuboid) cuboid1).volume() - ((Cuboid) cuboid2).volume());
			
		}
		
	}
	
	public static class SortByArea implements Comparator<Object> {
		
		SortByArea() {}
		
		public int compare(Object cuboid1, Object cuboid2) {
			
			return (int) (((Cuboid) cuboid1).area() - ((Cuboid) cuboid2).area());
			
		}
		
	}
	
}