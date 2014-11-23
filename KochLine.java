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
			p1 = super.getStart(); //Add the start point and end point to p1 and 5
			p5 = super.getEnd();
			
		}

	//Methods
		/**
		 * A method used to compute the values for fractal points 2, 3, and 4.
		 * These points will then be assigned for use in creating the actual Koch line.
		 * 
		 */
		public void computeFractal()
		{
		//Step one: Calculate two points as reference from point 1 and 5
			int x5i = (p5.getX() - p1.getX());
			int y5i = (p5.getY() - p5.getY());
			
		//Now calculate each point for our next lines
			//Calculate p2
			int x2 = p1.getX() + (x5i/3);
			int y2 = p1.getY() + (y5i/3);
			p2.setX(x2);
			p2.setY(y2);
			
			//Calculate p3
			double x3 = ((p1.getX() + p5.getX())/2)+(Math.sqrt(3)*(p1.getY()-p5.getY())/6);
			double y3 = ((p1.getY()+p5.getY())/2) + (Math.sqrt(3)*(p5.getX()-p1.getX())/6);
			p3.setX((int)x3); //Hopefully, passing the info through as integers works just fine
			p3.setY((int)y3);
			
			//Calculate p4
			int x4 = (p1.getX()+(2*x5i)/3);
			int y4 = (p1.getY()+(2*y5i)/3);
			p4.setX(x4);
			p4.setY(y4);
		}
	
	/**
	 * 
	 * @return
	 */
	public Line getLineA()
	{
		Line lineA = new Line(p1, p2);
		return lineA;
	}
	
	/**
	 * 
	 * @return
	 */
	public Line getLineB()
	{
		Line lineB = new Line(p2, p3);
		return lineB;
	}
	
	/**
	 * 
	 * @return
	 */
	public Line getLineC()
	{
		Line lineC = new Line(p3, p4);
		return lineC;
	}
	
	/**
	 * 
	 * @return
	 */
	public Line getLineD()
	{
		Line lineD = new Line(p4, p5);
		return lineD;
	}
	
	
	
}
