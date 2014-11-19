package edu.cofc.csci221.ui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

/**
 * 
 * @author Programming Assignment 4 - GridPanel class
 * @since 30 Sept. 2014
 * 
 * Class that inherits from JPanel with overridden
 * paintComponent method to draw gridlines
 * 
 * DO NOT MODIFY THIS CLASS
 *
 */
@SuppressWarnings("serial")
public class GridPanel extends JPanel {
	
	// private instance variables
	private int strokeWidth = 1;
	
	private ArrayList<Line> lines = new ArrayList<Line>();
	
	/**
	 * 
	 * No argument constructor that initializes
	 * the GridPanel.
	 * 
	 */
	public GridPanel() {
		
		super();
		setBackground( Color.BLACK );
		
	} // end constructor
	
	/**
	 * 
	 * Changes the stroke width (i.e. thickness) 
	 * of the line to be drawn.
	 * 
	 * @param strokeWidth - integer data type
	 */
	public void setStroke( int strokeWidth ) {
		
		if ( strokeWidth > 1 ) {
		
			this.strokeWidth = strokeWidth;
			
		}
		
	} // end setStroke() method
	
	/**
	 * 
	 * Remove all line objects. After
	 * this operation is performed, no lines
	 * will be drawn on the GridPanel.
	 * 
	 */
	public void clear() {
		
		lines.clear();
		
	} // end clear()
	
	/**
	 * 
	 * Causes the panel to be repainted.
	 * 
	 */
	public void draw() {
		
		repaint();
		revalidate();
		
	} // end draw() method
	
	/**
	 * Add a Line object to be drawn on the GridPanel.
	 *  
	 * The Line class will be developed by you. 
	 * Please see Programming Assignment 4 for
	 * Further details.
	 *  
	 * @param line - Represents a valid Line object
	 */
	public void addLine( Line line ) {
		
		if ( !lines.contains( line ) ) {
			
			lines.add( line );
			
		} 
		
	} // end addLine() method
	
	/**
	 * 
	 * Overridden method that draws lines
	 * on panel.
	 * 
	 * @param g - Graphics object
	 */
	public void paintComponent( Graphics g ) {
		
		super.paintComponent( g );
		
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setPaint( Color.GREEN );
		g2.setStroke( new BasicStroke( strokeWidth  ) );
		
		for ( int i=0; i<lines.size(); i++ ) {
			
			Line line = lines.get( i );
			
			if ( line.isValid() ) {
			
				g2.drawLine( line.getStart().getX(), line.getStart().getY(), 
						 	 line.getEnd().getX(), line.getEnd().getY() );
			
			}
			
		}
		
	} // end paintComponent() method

} // end GridPanel class definition
