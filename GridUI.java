package edu.cofc.csci221.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * @author Programming Assignment 4 - GridUI class
 * @since 30 Sept. 2014
 * 
 * Class that inherits from JFrame. This frames 
 * the panel class and supplies wrapper methods
 * 
 * DO NOT MODIFY THIS CLASS
 *
 */
@SuppressWarnings("serial")
public class GridUI extends JFrame {
	
	// private instance variables
	private GridPanel gridPanel;
	
	/**
	 * 
	 * No argument constructor that initializes 
	 * the UI and displays the grid panel to the 
	 * user.
	 * 
	 */
	public GridUI() {
		
		gridPanel = new GridPanel();
		
		JPanel contentPane = (JPanel)this.getContentPane();
		
		contentPane.setLayout( new BorderLayout() );
		
		contentPane.setBorder( BorderFactory.createEmptyBorder( GridConstants.PAD, 
															GridConstants.PAD,
															GridConstants.PAD, 
															GridConstants.PAD ) );
		
		contentPane.add( gridPanel, BorderLayout.CENTER );
		
		setSize( new Dimension( GridConstants.MAX_PANEL_WIDTH + GridConstants.FRAME_X_OFFSET, 
				                GridConstants.MAX_PANEL_HEIGHT + GridConstants.FRAME_Y_OFFSET ) );
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		setResizable( false );
		
		setTitle( "CSCI 221: Programming Assignment 4" );
		
		setVisible( true );
		
	} // end constructor
	
	/**
	 * Add a Line object to be drawn on the GridPanel.
	 *  
	 * The Line class will be developed by you. 
	 * Please see Programming Assignment 4 for
	 * Further details.
	 *  
	 * @param line - that represents a valid Line object
	 */
	public void addLine( Line line ) {
		
		gridPanel.addLine( line );
		
		gridPanel.draw();
		
		
	} // end addLine() method
	
	/**
	 * 
	 * Remove all line objects. After
	 * this operation is performed, no lines
	 * will be drawn on the GridPanel.
	 * 
	 */
	public void clear() {
		
		gridPanel.clear();
		
		gridPanel.draw();
		
	} // end clear() method

} // end GridUI class definition
