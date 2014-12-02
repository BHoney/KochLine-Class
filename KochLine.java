/**
 * @author Robert Moore
 * @Date 23 Novemeber 2014
 * Class used to generate all data used to draw a KochLine for our fractal UI
 * Version .05
 */
package edu.cofc.csci221.ui;

public class KochLine extends Line {
	
	//Variables
		private Point p1; //Our start point
		private Point p2;
		private Point p3; //p2, 3, and 4 will be determined via algorithm
		private Point p4;
		private Point p5; //Our End Point

		
	//Constructor
		public KochLine(Point start, Point end)
		{
			super(start, end); //Assigns the start and end points to our line super class
			p1 = new Point(start.getX(), start.getY());
			p5 = new Point(end.getX(), end.getY());
			computeFractal();
				
		}

	//Methods
		/**
		 * A method used to compute the values for fractal points 2, 3, and 4.
		 * These points will then be assigned for use in creating the actual Koch line.
		 * 
		 */
		public void computeFractal()
		{
		//Set x1, y1, x5, and y5
		int x1 = p1.getX();
		int y1 = p1.getY();
		
		int x5 = p5.getX();
		int y5 = p5.getY();
		
		//Generate xi and yi
		int xi = x5 - x1;
		int yi = y5 - y1;

		//Calculate Point 2
		int x2 = x1 + xi/3;
		int y2 = y1 + yi/3;
		p2 = new Point (x2, y2);
		
		//Calculate Point 3
		double x3 = ((x1+x5)/2) + Math.sqrt(3.0)*(y1-y5)/6;
		double y3 = ((y1 + y5)/2) + Math.sqrt(3.0)*(x5-x1)/6;

		p3 = new Point((int)x3, (int)y3);
		
		//Point 4
		int x4 =  x1 + (2*xi)/3;
		int y4 = y1 + (2*yi)/3;
		p4 = new Point(x4, y4);

		
		
		}
	
	/**
	 * Generate a Line A, creating a new KochLine which will then create new points and sequences
	 * @return KochLine
	 */
	public KochLine getLineA()
	{
		KochLine lineA = new KochLine(p1, p2);
		return lineA;
	}
	
	/**
	 * Generate a Line B, creating a new KochLine which will then create new points and sequences
	 * @return KochLine
	 */
	public KochLine getLineB()
	{
		KochLine lineB = new KochLine(p2, p3);
		return lineB;
	}
	
	/**
	 *  Generate Line C, which will create new points and lines for use
	 * @return KochLine
	 */
	public KochLine getLineC()
	{
		KochLine lineC = new KochLine(p3, p4);
		return lineC;
	}
	
	/**
	 * Generate Line D, which will create new points and lines for use
	 * @return KochLine
	 */
	public KochLine getLineD()
	{
		KochLine lineD = new KochLine(p4, p5);
		return lineD;
	}
	
	/**
	 * Checks the validity of the Koch Line
	 * Uses Line's .isValid() method to return a boolean
	 * @return
	 */
	public Boolean isKochLineValid()
	{
		Boolean lineA = getLineA().isValid();
		Boolean lineB = getLineB().isValid();
		Boolean lineC = getLineC().isValid();
		Boolean lineD = getLineD().isValid();
		Boolean valid = true;
		
		if(lineA!= true)
		{
			valid = false;
		}
		
		if(lineB!= true)
		{
			valid = false;
		}
		
		if(lineC!= true)
		{
			valid = false;
		}
		
		if(lineD!= true)
		{
			valid = false;
		}
		
		return valid;
		
	}
	
}
