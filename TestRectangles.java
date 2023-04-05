public class TestRectangles {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(2, 3, 4, 5);
		Rectangle r3 = new Rectangle(1.3, 4.4, 5.5, 6); //x,y,l,w
		
		System.out.println("r1 is centered at " + r1.getX() + ", " + r1.getY());
		System.out.println("r1 has width  of " + r1.getWidth());
		System.out.println("r1 has height of " + r1.getHeight()); 
		System.out.println("r2's area is " + r2.getArea());
		System.out.println("r2's perimeter is " + r2.getPerimeter());

		if (r2.contains(3,2))
			System.out.println("r2 contains point (3,2)");
		else
			System.out.println("r2 does not contain point (3,2)");

		if (r3.contains(r2)) 
			System.out.println("r3 contains r2");
		else 
			System.out.println("r3 does not contain r2");
         		
	}

}