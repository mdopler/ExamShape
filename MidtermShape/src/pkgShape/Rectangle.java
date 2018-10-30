package pkgShape;

public class Rectangle extends Shape implements Comparable<Object> {

	private int iWidth;
	
	private int iLength;
	
	
	public Rectangle(int width, int length) {
		
		super();
		
		this.iWidth = width;
		
		this.iLength = length;
		
	}
	
	public int getiWidth() {
		
		return iWidth;
		
	}
	
	public void setiWidth(int width) {
		
		this.iWidth = width;
		
	}
	
	public int getiLength() {
		
		return iLength;
		
	}
	
	public void setiLength(int length) {
		
		this.iLength = length;
		
	}
	
	@Override
	public double area() {
		
		return this.iWidth * this.iLength;
		
	}

	@Override
	public double perimeter() {
		
		return this.iWidth * 2 + this.iLength * 2;
		
	}


	public int compareTo(Object rectangle) {
		
		int compareNum = 0;
		
		if (((Rectangle) rectangle).area() > this.area()) {
			
			compareNum = -1;
			
		} else if (((Rectangle) rectangle).area() == this.area()) {
			
			compareNum = 0;
			
		} else if (((Rectangle) rectangle).area() < this.area()) {
			
			compareNum = 1;
			
		}
		
		return compareNum;
	}
	
}
