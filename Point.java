/**
 * Sets a point for use with the Line Class
 * The point will tell the line where to and from to draw
 * @author Robert Moore
 * @since 8 Oct 2014
 */

package edu.cofc.csci221.ui;

public class Point {
	int x = 0; // The X-axis coordinate of our point
	int y = 0; //The Y-axis coordinate of our point
	
	
	/**
	*No argument constructor that initializes Point
	*/

	public Point()
	{
	}
	
	/**
	* Constructor that pulls the data for X and Y from another point
	* @param Point - Point class 
	*/

	public Point(Point point)
	{
		if (point!=null)
		{
			if (point.getX()>=0 && point.getX()<= GridConstants.MAX_PANEL_WIDTH)
			{
				this.setX(x);
				//System.out.println("Success");
			}
			if (point.getY()>=0 && point.getY()<= GridConstants.MAX_PANEL_HEIGHT)
			{
				this.setY(y);
				//System.out.println("Success");
			}
		}
	}
	
/**
*Constructor that uses two ints to set our data for the point
*@param xinput, yinput - Int data type
*/

	public Point (int xinput, int yinput)
	{
		if (xinput>=0 && xinput <= GridConstants.MAX_PANEL_WIDTH)
		{
			x = xinput;
		//	System.out.println("Success");
		}
		
		if (yinput>=0 && yinput<= GridConstants.MAX_PANEL_HEIGHT)
		{
			y = yinput;
			//System.out.println("Success");
		}
	}
	
	/**
	 * Precondition: None
	 * Postcondition: returns x
	 * Returns the point's data for the x variable
	 * @return x - int data type
	 */
	public int getX()
	{
		
		return this.x;
	}
	
	/**
	 * Precondition: None
	 * Postcondition: returns y
	 * Returns the point data for the y variable
	 * @return y - int data type
	 */
	public int getY()
	{
		return this.y;
	}
	
	/**
	 * Precondition: setx
	 * Postcondition: this object's xha
	 * Sets the point data for the x variable
	 * @param setx
	 */
	public void setX(int setx)
	{
		if (setx >= 0 && setx <= GridConstants.MAX_PANEL_WIDTH)
		{
			System.out.print("The point is now "+setx);

			this.x = setx;
		}
	}
	
	/**
	 * Precondition: y axis value
	 * Postcondition: set's this object's y axis value
	 * Sets the point data for the y variable
	 * @param sety
	 */
	public void setY(int sety)
	{
		if (sety >= 0 && sety <= GridConstants.MAX_PANEL_HEIGHT)
		{
		//	System.out.print("The point is now "+sety);
			this.y = sety;
		}
	}
	
	/**
	 * Precondition: A pre-existing point
	 * Postcondition: sets this object's x and y values using the pre-existing point
	 * Pulls the data from an included point to set for x and y variables
	 * Used in the constructor using the Point data
	 * @param p
	 */
	public void setPoint(Point p)
	{
		if (p != null)
		{
			x = p.getX();
			y = p.getY();
		}
	}
	
	
	
}
