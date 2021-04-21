
  public class Triangle {
      private final double a;
      private final double b;
	  private final double c;
	  
	  public Triangle() {
	        this(1,1,1);
	    }

	   public Triangle(double a, double b, double c) {
	       this.a = a;
	       this.b = b;
	       this.c = c;
	    }
	   
	   public double getArea() {
	        double t = (a + b + c) / 2;
	        double E = Math.sqrt(t * (t - a) * (t - b) * (t - c));
	        return E;
	    }

	   
	    public double getPerimeter() {
	        double P = a + b + c;
	        return P;
	    }
}
