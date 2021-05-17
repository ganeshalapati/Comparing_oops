
public class comparision {
	
	static int x1=1;
	static int x2=2;
	static int y1=3;
	static int y2=4;
	
	static int x3=1;
	static int x4=2;
	static int y3=3;
	static int y4=4;
	
    int line1,line2;
    
    public static  void comparing() {
        double line1 = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
        System.out.println("Length of first line is: " +line1);
        double line2 = Math.sqrt((Math.pow(x4 - x3, 2)) + (Math.pow(y4 - y3, 2)));
        System.out.println("Length of second line is: " +line2);

        if (line1==line2)
           System.out.println("Lines are equal");
        else if (line1 > line2)
           System.out.println("Line1 is Greater");
  		else
  			System.out.println("Line2 is Greater");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         comparing();
	}

}
