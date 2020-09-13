package DAY4;
import java.util.Scanner;
public class ShapeMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("1.Circle \r\n" + 
				"\r\n" + 
				"2. Square\r\n" + 
				"\r\n" + 
				"3. Rectangle\r\n" + 
				"\r\n" + 
				"Enter the shape name ");
		String sh = s.next();
		switch(sh) {
		case "Rectangle" :
		{
			System.out.println("Enter length and breadth:");
			int l = s.nextInt();
			int b = s.nextInt();
			Rectangle r =  new Rectangle(sh,l,b);
			System.out.println("Area of Rectangle is:"+ r.calculateArea());
			break;
		}
		case "Square" :
		{
			System.out.println("Enter the side:");
			int r = s.nextInt();
			Square p = new Square(sh,r);
			System.out.println("Area of Square is:"+p.calculateArea());
			break;
		}
		case "Circle" :
		{
		    System.out.println("Enter the radius:");
		    int a = s.nextInt();
		    Circle c = new Circle(sh,a);
		    System.out.println("Area of a circle:"+c.calculateArea());
		    break;
		}
		}

	}

}
