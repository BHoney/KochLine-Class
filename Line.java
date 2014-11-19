/**
 * @author Robert Moore
 * @since 8 October 2014
 *
 * Line class that accepts two point objects to
 * generate a line that will then be displayed
 * using GridUI 
 * 
 */

package edu.cofc.csci221.ui;

public class Line {
	
	Point start = null; //Our variables here are start
	Point end = null;   //And end
	
	/**
	* Line constructors
	* Requires two point classes
	* Precondition: "Start" and "End"
	* @param sPoint & endP - Point class types
	*/

	Line(Point sPoint, Point endP)
	{
		if (sPoint!=null && endP !=null)
		{
			start = sPoint;
			end = endP;
			//System.out.println("Success");
		}
		
	}
	/**
	 * Pulls the "start" point from the line for use
	 * Precondition: None
	 * Postcondition: Returns a start point
	 * @return Point start
	 */
	public Point getStart()
	{
		return this.start;
	}
	
	/**
	 * Pulls the end point from the line for use
	 * Precondition: None
	 * Postcondition: Returns an end point
	 * @return Point end
	 */
	public Point getEnd()
	{
		return this.end;
	}
	
	/**
	 * Changes the line's Start point
	 * Precondition: Start point
	 * Postcondition: Changes the line's Start point 
	 * @param startP
	 */
	public void setStart(Point startP)
	{
		if(startP!=null)
		{
			this.start = startP;
		}
	}
	
	/**
	 * Changes the line's end point
	 * Precondition: an end Point
	 * Postcondition: changes the line's end point
	 * @param endP
	 */
	public void setEnd(Point endP)
	{
		if(endP!=null)
		{
			this.end = endP;
		}
	}
	
	/**
	 * Checks to see if the point in question is valid for use
	 * Precondition: none
	 * Postcondition: returns a true or false value for the line
	 * @return bool true/false
	 */
	public boolean isValid()
	{
		if(start!= null && end!= null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}