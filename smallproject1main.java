
import java.util.Scanner;

public class smallproject1 {
	  
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("give the lengths of Triangle");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		Triangle tr = new Triangle(a,b,c);
		
		 System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c
	              + "\nArea is : " + tr.getArea()
	              + "\nPerimeter is: " + tr.getPerimeter() + "\n");
		
		System.out.println("give the width and length of a Rectangle");
		double width = scan.nextDouble();
		double length = scan.nextDouble();
		Rectangle rec = new Rectangle(width,length);
				
		 System.out.println("Rectangle width: " + width + " and length: " + length
			       + "\nArea is : " + rec.getArea()
			       + "\nPerimeter is: " + rec.getPerimeter() + "\n");
		            
		 scan.close();
	    }
	}


