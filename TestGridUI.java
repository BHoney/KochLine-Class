package edu.cofc.csci221.ui;

public class TestGridUI {
	public static void main (String[] args)
	{	
		
		//Here's our 2x2 Grid
			GridUI superGrid = new GridUI();
			
				Point pointA = new Point(200, 0);
				Point pointB  = new Point (200, 400);
				//Line lineA = new Line(pointA, pointB);
				Line lineA = new Line(null, null);
				lineA.setStart(pointA);
				lineA.setEnd(pointB);
				
				Point pointC = new Point(0, 200 );
				Point pointD = new Point(400, 200);
				Line lineB = new Line(pointC, pointD);
				superGrid.addLine(lineA);
				superGrid.addLine(lineB);
			
		//Heres our next 4x4 Grid
			GridUI megaGrid = new GridUI();
				
				megaGrid.addLine(lineA);
				megaGrid.addLine(lineB);
				Point polaris = new Point(pointA);
				polaris.setX(100);
				polaris.setY(0);
				Point vega = new Point(pointB);
				vega.setX(100);
				vega.setY(400);
				Line lineC = new Line(polaris, vega);
				megaGrid.addLine(lineC);
				
				Point genericA = new Point();
				genericA.setX(300);
				genericA.setY(0);
				Point genericB = new Point();
				genericB.setX(300);
				genericB.setY(400);
				Line lineD = new Line(genericA, genericB);
				megaGrid.addLine(lineD);
				
				Point mrM = new Point(0, 100);
				Point mrL = new Point(400, 100);
				Line lineE = new Line(mrM, mrL);
				megaGrid.addLine(lineE);
				
				Point tenpenny = new Point(0, 300);
				Point towers = new Point(400, 300);
				Line lineF = new Line(tenpenny, towers);
				megaGrid.addLine(lineF);
				
		
		//Heres our final 8x8 Grid		
			GridUI ultraGrid = new GridUI();
				ultraGrid.addLine(lineA);
				ultraGrid.addLine(lineB);
				ultraGrid.addLine(lineC);
				ultraGrid.addLine(lineD);
				ultraGrid.addLine(lineE);
				ultraGrid.addLine(lineF);
				
				Point king = new Point(0, 50);
				Point queen = new Point(400, 50);
				Line royalty = new Line(king, queen);
				ultraGrid.addLine(royalty);
				
				Point fivel = new Point (0, 150);
				Point goesWest = new Point (400, 150);
				Line goodMovie = new Line (fivel, goesWest);
				ultraGrid.addLine(goodMovie);
				
				Point another = new Point(0,250);
				Point pointtoadd = new Point(400, 250);
				Line anotherLine = new Line(another, pointtoadd);
				ultraGrid.addLine(anotherLine);
				
				Point fFinal = new Point (0, 350);
				Point sankyaku = new Point(400, 350);
				Line lastHorizon = new Line(fFinal, sankyaku);
				ultraGrid.addLine(lastHorizon);
				
				Point downSpike = new Point(50, 0);
				Point upSpike = new Point(50, 400);
				Line vertSmash = new Line(downSpike, upSpike);
				ultraGrid.addLine(vertSmash);
				
				Point nextPoint = new Point(150, 0);
				Point followPoint = new Point(150, 400);
				Line helpLine = new Line (nextPoint, followPoint);
				ultraGrid.addLine(helpLine);
				
				Point alpha = new Point(250, 0);
				Point beta = new Point(250, 400);
				Line maggieLine = new Line(alpha, beta);
				ultraGrid.addLine(maggieLine);
				
				Point tuturu = new Point(350, 0);
				Point tori = new Point(350, 400);
				Line weBeatTori = new Line(tuturu, tori);
				ultraGrid.addLine(weBeatTori);
				
				
		}
}
