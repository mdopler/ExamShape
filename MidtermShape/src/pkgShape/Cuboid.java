package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle implements Comparable<Object> {
	
	private int iDepth;
	
	public Cuboid(int paraW, int paraL, int paraD) {
		super(paraW, paraL);
		this.iDepth = paraD;
	}

	public int getiDepth() {
		return iDepth;
	}
	
	public void setiDepth(int paraD) {
		this.iDepth = paraD;
	}
	
	public double volume() {
		return this.getiLength() * this.getiWidth() * this.iDepth;
	}
	
	//(Surface) area
	@Override
	public double area() {
		return (this.getiLength() * this.getiWidth() * 2) + (this.getiLength() * this.iDepth * 2) + (this.getiWidth() * this.iDepth * 2);
	}
	
	@Override
	public double perimeter() throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Perimeter of a Cuboid does not exist!");
	}
	
	
	@Override
	public int compareTo(Object cub) {
		return (int) (((Cuboid) this).volume() - ((Cuboid) cub).volume());
	}
	
	public static class SortByVolume implements Comparator<Object> {
		
		SortByVolume() {
			
		}
		
		public int compare(Object cuboidA, Object cuboidB) {
			return (int) (((Cuboid) cuboidA).volume() - ((Cuboid) cuboidB).volume());
		}
		
	}
	
	public static class SortByArea implements Comparator<Object> {
		
		SortByArea() {
			
		}
		
		public int compare(Object cuboidA, Object cuboidB) {
			return (int) (((Cuboid) cuboidA).area() - ((Cuboid) cuboidB).area());
		}
	}
}