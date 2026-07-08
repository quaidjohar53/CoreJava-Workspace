package Java_OOPs_Inheritance;

public class TestShape {
	public static void main(String[] args) {
		System.out.println("------circle------");
		Circle c = new Circle();
		
		c.setRadius(8);
		c.setColor("yellow");
		c.setBorderwWidth(2);
		
		System.out.println("radius : "+c.getRadius());
		System.out.println("color : "+c.getColor());
		System.out.println("border width : "+c.getBorderWidth());
		
		c.area();
		
		
		System.out.println("------Recatangle------");
		
		Rectangle r = new Rectangle ();
		
		r.setLength(8);
		r.setWidth(5);
		r.setColor("blue");
		r.setBorderwWidth(2);
		
		System.out.println("length : "+r.getLength());
		System.out.println("width : "+r.getWidth());
		System.out.println("color : "+ r.getColor());
		System.out.println("borderWidth : "+r.getBorderWidth());
		
		r.area();
		
		
		System.out.println("------Triangle------");
		
		Triangle t = new Triangle ();
		
		t.setBase(10);
		t.setHeight(8);
		t.setColor("green");
		t.setBorderwWidth(2);
		
		System.out.println("base : "+t.getBase());
		System.out.println("height : "+t.getHeight());
		System.out.println("color : "+ t.getColor());
		System.out.println("borderWidth : " + t.getBorderWidth());
		
		t.area();
		
	}

}
