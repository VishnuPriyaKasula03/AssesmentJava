package DAY4;
import java.util.Scanner;
public class Main {

		public static void main(String[] args) {
		    @SuppressWarnings("resource")
			Scanner sc= new Scanner(System.in);
			int ch = 0;
			System.out.println("1.Circle \r\n" + 
					"\r\n" + 
					"2. Square\r\n" + 
					"\r\n" + 
					"3. Rectangle\r\n" + 
					"\r\n" + 
					"Enter the shape name ");
			String sh = sc.next();
			switch(sh) {
			case "Rectangle" :
			{
				Rectangle r =  new Rectangle(sh, ch, ch);
	            r.setName("Rectangle");
	            r.setLength(10);
	            r.setBreadth(11);
	           System.out.println("Enter the Length "+r.getLength());
	           System.out.println("Enter the  Breadth "+r.getBreadth());
			   System.out.println("Area of Rectangle is "+ r.calculateArea());
				break;
			}
			case "Square" :
			{
				Square p = new Square(sh, ch);
				p.setName("Square");
				p.setSide(10);
				 System.out.println("Enter the shape "+p.getName());
				System.out.println("Area of Square is "+p.calculateArea());
				break;
			}
			case "Circle" :
			{
			    Circle c = new Circle(sh, ch);
			    c.setName("Circle");
			    c.setRadius(2);
			    System.out.println("Enter the shape "+c.getName());
			    System.out.println("Area of a circle:"+c.calculateArea());
			    break;
			}
	  }
 }
}

