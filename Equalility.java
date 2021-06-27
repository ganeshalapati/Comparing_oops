
public class Equalility {
	static int x1=1;
	static int x2=2;
	static int y1=3;
	static int y2=4;
	
	static int x3=1;
	static int x4=2;
	static int y3=3;
	static int y4=4;
	
    int line1,line2;
		
	public static void equality() {
		
	      double line1 = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
	      
	      double line2 = Math.sqrt((Math.pow(x4 - x3, 2)) + (Math.pow(y4 - y3, 2)));
	      
	      if (line1 == line2) {
	      System.out.println("lines are equal");
	      }
	      else
	       System.out.println("lines are not  equal");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		equality();

	}

}}
