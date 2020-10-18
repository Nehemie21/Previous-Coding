/**
 * 
 */

import javax.swing.JOptionPane;

/**
 * @author Nehemie
 *
 */
public class RectangleJava {

	
	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	    	Rectangle cordin1 = new Rectangle();
	        Rectangle cordin2 = new Rectangle();
	       
	        Rectangle cordin3= new Rectangle();
	        Rectangle cordin4 = new Rectangle();
	       
	        Rectangle cordin5 = new Rectangle();
	        Rectangle cordin6 = new Rectangle();
	       
	        Rectangle area = new Rectangle();
	        Rectangle area2 = new Rectangle();
	        Rectangle area3 = new Rectangle();
	       
	        Rectangle length = new Rectangle();
	        Rectangle width = new Rectangle();
	       
	        Rectangle length2 = new Rectangle();
	        Rectangle width2 = new Rectangle();
	       
	        Rectangle length3 = new Rectangle();
	        Rectangle width3 = new Rectangle();
	       
	        float largerArea = 0;
	        float largerLength = 0;
	        float largerWidth = 0;
	       
	        String dimension = " ";
	       
	        float pair1XLarge = 0;
	        float pair1XSmall = 0;
	        float pair1YLarge = 0;
	        float pair1YSmall = 0;
	       
	        float pair2XLarge = 0;
	        float pair2XSmall = 0;
	        float pair2YLarge = 0;
	        float pair2YSmall = 0;
	       
	        float pair3XLarge = 0;
	        float pair3XSmall = 0;
	        float pair3YLarge = 0;
	        float pair3YSmall = 0;
	       
	        boolean ifCordin1 = false;
	        boolean ifCordin2 = false;
	       
	        boolean ifCordin3 = false;
	        boolean ifCordin4 = false;
	       
	        boolean ifCordin5 = false;
	        boolean ifCordin6 = false;
	       
	        Rectangle intersectionLength1 = new Rectangle();
	        Rectangle intersectionLength2 = new Rectangle();
	        Rectangle intersectionLength3 = new Rectangle();
	       
	        Rectangle intersectionWidth1 = new Rectangle();
	        Rectangle intersectionWidth2 = new Rectangle();
	        Rectangle intersectionWidth3 = new Rectangle();
	       
	        Rectangle intersectionArea1 = new Rectangle();
	        Rectangle intersectionArea2 = new Rectangle();
	        Rectangle intersectionArea3 = new Rectangle();
	       
	       
	       
	        //Rectangle #1
	        float x1 = Float.parseFloat(JOptionPane.showInputDialog("What is point x1: "));
	        float y1 = Float.parseFloat(JOptionPane.showInputDialog("What is point y1: "));
	       
	        float x2 = Float.parseFloat(JOptionPane.showInputDialog("What is point x2: "));
	        float y2 = Float.parseFloat(JOptionPane.showInputDialog("What is point y2: "));
	       
	        while(x1 == x2){
	            x1 = Float.parseFloat(JOptionPane.showInputDialog("What is point x1: "));
	            x2 = Float.parseFloat(JOptionPane.showInputDialog("What is point x2: "));
	        }
	       
	        while(y1 == y2){
	           
	            y1 = Float.parseFloat(JOptionPane.showInputDialog("What is point y1: "));
	            y2 = Float.parseFloat(JOptionPane.showInputDialog("What is point y2: "));
	        }
	       
	        cordin1.setPoint(x1, y1);
	        cordin2.setPoint(x2, y2);
	       
	     
	      if(cordin1.point1.getPointx1() > cordin2.point1.getPointx1())
	      {
	         pair1XLarge = cordin1.point1.getPointx1();
	         pair1XSmall = cordin2.point1.getPointx1();
	      }
	      else if(cordin2.point1.getPointx1() > cordin1.point1.getPointx1())
	      {
	              pair1XLarge = cordin2.point1.getPointx1();
	              pair1XSmall = cordin1.point1.getPointx1();
	      }
	      else
	      {
	         pair1XLarge = cordin1.point1.getPointx1();
	         pair1XSmall = cordin1.point1.getPointx1();
	      }
	     
	        if(cordin1.point1.getPointy1() > cordin2.point1.getPointy1())
	         {
	         pair1YLarge = cordin1.point1.getPointy1();
	         pair1YSmall = cordin2.point1.getPointy1();
	         }
	        else if(cordin2.point1.getPointy1() > cordin1.point1.getPointy1())
	        {
	              pair1YLarge = cordin2.point1.getPointy1();
	              pair1YSmall = cordin1.point1.getPointy1();
	        }
	        else
	        { pair1YLarge = cordin1.point1.getPointy1();
	              pair1YSmall = cordin1.point1.getPointy1();
	        }
	       
	       
	        System.out.println("Cordin1 X: " + cordin1.point1.getPointx1());
	        System.out.println("Cordin1 Y: " + cordin1.point1.getPointy1());
	        System.out.println("Cordin2 X: " + cordin2.point1.getPointx1());
	        System.out.println("Cordin2 Y: " + cordin2.point1.getPointy1());
	       
	        System.out.println("Pair 1 X Small: " + pair1XSmall);
	        System.out.println("Pair 1 X Large: " + pair1XLarge);
	        System.out.println("Pair 1 Y Small: " + pair1YSmall);
	        System.out.println("Pair 1 Y Large:" +  pair1YLarge);
	       
	        width.setWidth(Math.abs((cordin2.point1.getPointx1() - cordin1.point1.getPointx1())));
	        length.setLength(Math.abs((cordin2.point1.getPointy1() - cordin1.point1.getPointy1())));
	        area.CalcArea(length.getLength(), width.getWidth());
	       
	        if(width.getWidth() > length.getLength())
	        {
	            dimension = "Horiztonal";
	        }
	        else if(length.getLength() > width.getWidth())
	            {
	                dimension = "Vertical";
	            }
	        else
	                dimension = "Square ";
	               
	        System.out.println("Area 1: " + area.getCalcArea());
	        System.out.println("Length 1: " + length.getLength());
	        System.out.println("Width 1: " + width.getWidth());
	        System.out.println("The cordinates you entered resulted in a " + dimension + " Rectangle");
	       
	       
	        //Rectangle Number #2
	        float x3 = Float.parseFloat(JOptionPane.showInputDialog("What is point x1: "));
	        float y3 = Float.parseFloat(JOptionPane.showInputDialog("What is point y1: "));
	       
	        float x4 = Float.parseFloat(JOptionPane.showInputDialog("What is point x2: "));
	        float y4 = Float.parseFloat(JOptionPane.showInputDialog("What is point y2: "));
	       
	         while(x3 == x4){
	            x3 = Float.parseFloat(JOptionPane.showInputDialog("What is point x3: "));
	            x4 = Float.parseFloat(JOptionPane.showInputDialog("What is point x4: "));
	        }
	       
	        while(y3 == y4){
	           
	            y3 = Float.parseFloat(JOptionPane.showInputDialog("What is point y3: "));
	            y4 = Float.parseFloat(JOptionPane.showInputDialog("What is point y4: "));
	        }
	       
	        cordin3.setPoint(x3, y3);
	        cordin4.setPoint(x4, y4);
	       
	      if(cordin3.point1.getPointx1() > cordin4.point1.getPointx1())
	      {
	         pair2XLarge = cordin3.point1.getPointx1();
	         pair2XSmall = cordin4.point1.getPointx1();
	      }
	      else if(cordin4.point1.getPointx1() > cordin3.point1.getPointx1())
	       {
	              pair2XLarge = cordin4.point1.getPointx1();
	              pair2XSmall = cordin3.point1.getPointx1();
	       }
	       else
	      {      pair2XLarge = cordin3.point1.getPointx1();
	             pair2XSmall = cordin3.point1.getPointx1();
	      }
	     
	      if(cordin3.point1.getPointy1() > cordin4.point1.getPointy1())
	      {
	         pair2YLarge = cordin3.point1.getPointy1();
	         pair2YSmall = cordin4.point1.getPointy1();
	      }
	      else if(cordin4.point1.getPointy1() > cordin3.point1.getPointy1())
	      {
	        pair2YLarge = cordin4.point1.getPointy1();
	        pair2YSmall = cordin3.point1.getPointy1();
	      }
	       else
	      {  pair2YLarge = cordin3.point1.getPointy1();
	         pair2YSmall = cordin3.point1.getPointy1();
	      }
	     
	        System.out.println("Cordin3 X: " + cordin3.point1.getPointx1());
	        System.out.println("Cordin3 Y: " + cordin3.point1.getPointy1());
	        System.out.println("Cordin4 X: " + cordin4.point1.getPointx1());
	        System.out.println("Cordin4 Y: " + cordin4.point1.getPointy1());
	       
	        System.out.println("Pair 2 X Small: " + pair2XSmall);
	        System.out.println("Pair 2 X Large: " + pair2XLarge);
	        System.out.println("Pair 2 Y Small: " + pair2YSmall);
	        System.out.println("Pair 2 Y Large:" +  pair2YLarge);
	       
	        width2.setWidth(Math.abs((cordin3.point1.getPointx1() - cordin4.point1.getPointx1())));
	        length2.setLength(Math.abs((cordin3.point1.getPointy1() - cordin4.point1.getPointy1())));
	        area2.CalcArea(length2.getLength(), width2.getWidth());
	       
	        if(width2.getWidth() > length2.getLength())
	        {
	            dimension = "Horiztonal";
	        }
	        else if(length2.getLength() > width2.getWidth())
	          {
	                dimension = "Vertical";
	          }
	        else
	                dimension = "Square";
	       
	        System.out.println("Area 2: " + area2.getCalcArea());
	        System.out.println("Length 2: " + length2.getLength());
	        System.out.println("Width 2: " + width2.getWidth());
	        System.out.println("The cordinates you entered resulted in a " + dimension + " Rectangle");
	       
	       
	        //Rectangle Number #3
	        float x5 = Float.parseFloat(JOptionPane.showInputDialog("What is point x1: "));
	        float y5 = Float.parseFloat(JOptionPane.showInputDialog("What is point y1: "));
	       
	        float x6 = Float.parseFloat(JOptionPane.showInputDialog("What is point x2: "));
	        float y6 = Float.parseFloat(JOptionPane.showInputDialog("What is point y2: "));
	       
	        while(x5 == x6){
	            x5 = Float.parseFloat(JOptionPane.showInputDialog("What is point x5: "));
	            x6 = Float.parseFloat(JOptionPane.showInputDialog("What is point x6: "));
	        }
	       
	        while(y5 == y6){
	           
	            y5 = Float.parseFloat(JOptionPane.showInputDialog("What is point y5: "));
	            y6 = Float.parseFloat(JOptionPane.showInputDialog("What is point y6: "));
	        }
	        cordin5.setPoint(x5, y5);
	        cordin6.setPoint(x6, y6);
	       
	        if(cordin5.point1.getPointx1() > cordin6.point1.getPointx1())
	        {
	         pair3XLarge = cordin5.point1.getPointx1();
	         pair3XSmall = cordin6.point1.getPointx1();
	        }
	        else if(cordin6.point1.getPointx1() > cordin5.point1.getPointx1())
	          {
	              pair3XLarge = cordin6.point1.getPointx1();
	              pair3XSmall = cordin5.point1.getPointx1();
	          }
	        else
	        {   pair3XLarge = cordin5.point1.getPointx1();
	              pair3XSmall = cordin5.point1.getPointx1();
	        }
	       
	       if(cordin5.point1.getPointy1() > cordin6.point1.getPointy1())
	      {
	         pair3YLarge = cordin5.point1.getPointy1();
	         pair3YSmall = cordin6.point1.getPointy1();
	      }
	       else if(cordin6.point1.getPointy1() > cordin5.point1.getPointy1())
	          {
	              pair3YLarge = cordin6.point1.getPointy1();
	              pair3YSmall = cordin5.point1.getPointy1();
	          }
	        else
	       {    pair3YLarge = cordin5.point1.getPointy1();
	              pair3YSmall = cordin5.point1.getPointy1();
	       }
	       
	        System.out.println("Cordin5 X: " + cordin5.point1.getPointx1());
	        System.out.println("Cordin5 Y: " + cordin5.point1.getPointy1());
	        System.out.println("Cordin6 X: " + cordin6.point1.getPointx1());
	        System.out.println("Cordin6 Y: " + cordin6.point1.getPointy1());
	       
	        System.out.println("Pair 3 X Small: " + pair3XSmall);
	        System.out.println("Pair 3 X Large: " + pair3XLarge);
	        System.out.println("Pair 3 Y Small: " + pair3YSmall);
	        System.out.println("Pair 3 Y Large:" +  pair3YLarge);
	       
	        width3.setWidth(Math.abs((cordin5.point1.getPointx1() - cordin6.point1.getPointx1())));
	        length3.setLength(Math.abs((cordin5.point1.getPointy1() - cordin6.point1.getPointy1())));
	        area3.CalcArea(length3.getLength(), width3.getWidth());
	       
	        if(width3.getWidth() > length3.getLength())
	        {
	            dimension = "Horiztonal";
	        }
	        else if(length3.getLength() > width3.getWidth())
	            {
	                dimension = "Vertical";
	            }
	        else
	                dimension = "Square";
	       
	        System.out.println("Area 3: " + area3.getCalcArea());
	        System.out.println("Length 3: " + length3.getLength());
	        System.out.println("Width 3: " + width3.getWidth());
	        System.out.println("The cordinates you entered resulted in a " + dimension + " Rectangle");
	       
	        if((area.getCalcArea() >=  area2.getCalcArea()) && (area.getCalcArea() >= area3.getCalcArea()))
	        {
	            largerArea = area.getCalcArea();
	            largerLength = length.getLength();
	            largerWidth = width.getWidth();
	         
	        }
	        else if((area2.getCalcArea() >=  area.getCalcArea()) && (area2.getCalcArea() >= area3.getCalcArea()))
	            {
	                 largerArea = area2.getCalcArea();
	                 largerLength = length2.getLength();
	                 largerWidth = width2.getWidth();
	            }
	        else if((area3.getCalcArea() >=  area2.getCalcArea()) && (area3.getCalcArea() >= area.getCalcArea()))
	                {
	                     largerArea = area3.getCalcArea();
	                     largerLength = length3.getLength();
	                     largerWidth = width3.getWidth();
	                }
	       
	        System.out.println("Rectangle with the length of "+ largerLength + "\nand with the width of " + largerWidth + "\nhas an area of " + largerArea + "\nwhich is the largest of all three rectangles");
	       
	        //Rectangle 1 and 2
	        if((((cordin3.point1.getPointx1() >= pair1XSmall) && (cordin3.point1.getPointx1() <= pair1XLarge))) && (((cordin3.point1.getPointy1() >= pair1YSmall) && (cordin3.point1.getPointy1() <= pair1YLarge))))
	        {       ifCordin3 = true;
	       
	           if(ifCordin3 == true)
	           {
	               if(cordin4.point1.getPointy1() > pair1YLarge)
	               {
	                   intersectionLength2.setLength(Math.abs(cordin3.point1.getPointy1() - pair1YLarge));
	               }
	               else if(cordin4.point1.getPointy1() < pair1YLarge)
	               {
	                   intersectionLength2.setLength(Math.abs(cordin3.point1.getPointy1() - pair1YSmall));
	               }
	               /*else if (cordin4.point1.getPointy1() == pair1YLarge || cordin4.point1.getPointy1() == pair1YSmall )
	               {
	                   intersectionArea2.setCalcArea(area2.getCalcArea());
	               }*/

	               if(cordin4.point1.getPointx1() > pair1XLarge)
	               {
	                   intersectionWidth2.setWidth(Math.abs(cordin3.point1.getPointx1() - pair1XLarge));
	               }

	               else if(cordin4.point1.getPointx1() < pair1XLarge)
	               {
	                   intersectionWidth2.setWidth(Math.abs(cordin3.point1.getPointx1() - pair1XSmall));
	               }
	               if ((cordin4.point1.getPointx1() == pair1XLarge || cordin4.point1.getPointx1() == pair1XSmall ) || (cordin4.point1.getPointy1() == pair1YLarge || cordin4.point1.getPointy1() == pair1YSmall ))
	               {
	                   if (area2.getCalcArea() < area.getCalcArea())
	                        intersectionArea2.setCalcArea(area2.getCalcArea());
	                    else if (area.getCalcArea() < area2.getCalcArea())
	                       intersectionArea1.setCalcArea(area.getCalcArea());  
	                    else
	                        if(area.getCalcArea() == area2.getCalcArea())
	                            intersectionArea2.setCalcArea(area2.getCalcArea());
	               }
	               else
	                   intersectionArea2.CalcArea(intersectionWidth2.getWidth(), intersectionLength2.getLength());
	           }
	                //intersectionArea2.CalcArea(intersectionWidth2.getWidth(), intersectionLength2.getLength());
	               
	                System.out.println("Intersection Area for Rectangle 2 and 1 is: " + intersectionArea2.getCalcArea());
	               
	                /*if(intersectionArea2.getCalcArea() > 0)
	                {
	                   
	                }*/
	        }
	        else
	            if((((cordin4.point1.getPointx1() >= pair1XSmall && cordin4.point1.getPointx1() <= pair1XLarge))) && (((cordin4.point1.getPointy1() >= pair1YSmall && cordin4.point1.getPointy1() <= pair1YLarge))))
	            {      ifCordin4 = true;
	           
	           
	                if(ifCordin4 == true)
	                {
	                   if(cordin3.point1.getPointy1() > pair1YLarge)
	                   {
	                       intersectionLength2.setLength(Math.abs(cordin4.point1.getPointy1() - pair1YLarge));
	                   }
	                   else if(cordin3.point1.getPointy1() < pair1YLarge)
	                   {
	                       intersectionLength2.setLength(Math.abs(cordin4.point1.getPointy1() - pair1YSmall));
	                   }
	                   /*else if (cordin3.point1.getPointy1() == pair1YLarge || cordin3.point1.getPointy1() == pair1YSmall )
	                   {
	                       intersectionArea2.setCalcArea(area2.getCalcArea());
	                   }*/
	                   
	                   if(cordin3.point1.getPointx1() > pair1XLarge)
	                   {
	                       intersectionWidth2.setWidth(Math.abs(cordin4.point1.getPointx1() - pair1XLarge));
	                   }
	                   else if(cordin3.point1.getPointx1() < pair1XLarge)
	                   {
	                       intersectionWidth2.setWidth(Math.abs(cordin4.point1.getPointx1() - pair1XSmall));
	                   }
	                   
	                   if ((cordin3.point1.getPointx1() == pair1XLarge || cordin3.point1.getPointx1() == pair1XSmall ) || (cordin3.point1.getPointy1() == pair1YLarge || cordin3.point1.getPointy1() == pair1YSmall ) )
	                   {
	                       if (area2.getCalcArea() < area.getCalcArea())
	                        intersectionArea2.setCalcArea(area2.getCalcArea());
	                    else if (area.getCalcArea() < area2.getCalcArea())
	                       intersectionArea1.setCalcArea(area.getCalcArea());  
	                    else
	                        if(area.getCalcArea() == area2.getCalcArea())

	                            intersectionArea2.setCalcArea(area2.getCalcArea());
	                   }
	                   else
	                       intersectionArea2.CalcArea(intersectionWidth2.getWidth(), intersectionLength2.getLength());
	                }
	               
	                //intersectionArea2.CalcArea(intersectionWidth2.getWidth(), intersectionLength2.getLength());
	               
	                System.out.println("Intersection Area for Rectangle 2 and 1 is: " + intersectionArea2.getCalcArea());

	                /*if(intersectionArea2.getCalcArea() > 0)
	                {
	                    System.out.println("Intersection Area for Rectangle 2 and 1 is: " + intersectionArea2.getCalcArea());
	                }*/
	            }
	       
	        if(ifCordin3 == true || ifCordin4 == true)
	        {    System.out.println("Rectangle 2 intersect into Rectangle 1");
	             System.out.println("Intersection Area for Rectangle 2 and 1 is: " + intersectionArea2.getCalcArea());
	        }
	       
	        //Rectangle 1 and 3
	        if((((cordin5.point1.getPointx1() >= pair1XSmall) && (cordin5.point1.getPointx1() <= pair1XLarge))) && (((cordin5.point1.getPointy1() >= pair1YSmall) && (cordin5.point1.getPointy1() <= pair1YLarge))))
	        {        ifCordin5 = true;
	       
	            if(ifCordin5 == true)
	            {
	                if(cordin5.point1.getPointy1() > pair1YLarge)
	                {
	                    intersectionLength3.setLength(Math.abs(cordin6.point1.getPointy1() - pair1YLarge));
	                }
	                else if(cordin5.point1.getPointy1() < pair1YLarge)
	                {
	                    intersectionLength3.setLength(Math.abs(cordin6.point1.getPointy1() - pair1YSmall));
	                }
	                else if (cordin5.point1.getPointy1() == pair1YLarge || cordin5.point1.getPointy1() == pair1YSmall )
	                {
	                    intersectionArea3.setCalcArea(area3.getCalcArea());
	                }

	                if(cordin5.point1.getPointx1() > pair1XLarge)
	                {
	                    intersectionWidth3.setWidth(Math.abs(cordin6.point1.getPointx1() - pair1XLarge));
	                }

	                else if(cordin5.point1.getPointx1() < pair1XLarge)
	                {
	                    intersectionWidth3.setWidth(Math.abs(cordin6.point1.getPointx1() - pair1XSmall));
	                }
	               
	                if ((cordin5.point1.getPointx1() == pair1XLarge || cordin5.point1.getPointx1() == pair1XSmall ) || (cordin5.point1.getPointy1() == pair1YLarge || cordin5.point1.getPointy1() == pair1YSmall ))
	                {
	                    if (area3.getCalcArea() < area.getCalcArea())
	                        intersectionArea3.setCalcArea(area3.getCalcArea());
	                    else if (area.getCalcArea() < area3.getCalcArea())
	                       intersectionArea1.setCalcArea(area.getCalcArea());  
	                    else
	                        if(area.getCalcArea() == area3.getCalcArea())
	                            intersectionArea3.setCalcArea(area3.getCalcArea());
	                }
	                else
	                    intersectionArea3.CalcArea(intersectionWidth3.getWidth(), intersectionLength3.getLength());
	            }
	            //System.out.println("Intersection Area for Rectangle 3 and 1 is: " + intersectionArea3.getCalcArea());
	           
	                 //intersectionArea3.CalcArea(intersectionWidth3.getWidth(), intersectionLength3.getLength());
	                /* if(intersectionArea2.getCalcArea() > 0)
	                 {
	                     System.out.println("Intersection Area for Rectangle 3 and 1 is: " + intersectionArea3.getCalcArea());
	                 }*/
	         }
	       
	        else
	            if((((cordin6.point1.getPointx1() >= pair1XSmall && cordin6.point1.getPointx1() <= pair1XLarge))) && (((cordin6.point1.getPointy1() >= pair1YSmall && cordin6.point1.getPointy1() <= pair1YLarge))))
	            {      ifCordin6 = true;
	       
	            if(ifCordin6 == true)
	            {
	                if(cordin6.point1.getPointy1() > pair1YLarge)
	                {
	                    intersectionLength3.setLength(Math.abs(cordin5.point1.getPointy1() - pair1YLarge));
	                }
	                else if(cordin6.point1.getPointy1() < pair1YLarge)
	                {
	                    intersectionLength3.setLength(Math.abs(cordin5.point1.getPointy1() - pair1YSmall));
	                }
	                else if (cordin6.point1.getPointy1() == pair1YLarge || cordin6.point1.getPointy1() == pair1YSmall )
	                {
	                    intersectionArea3.setCalcArea(area3.getCalcArea());
	                }

	                if(cordin6.point1.getPointx1() > pair1XLarge)
	                {
	                    intersectionWidth3.setWidth(Math.abs(cordin5.point1.getPointx1() - pair1XLarge));
	                }

	                else if(cordin6.point1.getPointx1() < pair1XLarge)
	                {
	                    intersectionWidth3.setWidth(Math.abs(cordin5.point1.getPointx1() - pair1XSmall));
	                }
	               
	                if ((cordin6.point1.getPointx1() == pair1XLarge || cordin6.point1.getPointx1() == pair1XSmall ) || (cordin6.point1.getPointy1() == pair1YLarge || cordin6.point1.getPointy1() == pair1YSmall ))
	                {
	                    if (area3.getCalcArea() < area.getCalcArea())
	                        intersectionArea3.setCalcArea(area3.getCalcArea());
	                    else if (area.getCalcArea() < area3.getCalcArea())
	                       intersectionArea1.setCalcArea(area.getCalcArea());  
	                    else
	                        if(area.getCalcArea() == area3.getCalcArea())
	                            intersectionArea3.setCalcArea(area3.getCalcArea());
	                }
	                else
	                     intersectionArea3.CalcArea(intersectionWidth3.getWidth(), intersectionLength3.getLength());
	                }
	           
	                 //intersectionArea3.CalcArea(intersectionWidth3.getWidth(), intersectionLength3.getLength());
	                /* if(intersectionArea3.getCalcArea() > 0)
	                 {
	                     System.out.println("Intersection Area for Rectangle 3 and 1 is: " + intersectionArea3.getCalcArea());
	                 }*/
	               
	            }
	       
	       
	        if(ifCordin5 == true || ifCordin6 == true)
	        {    System.out.println("Rectangle 3 intersect into Rectangle 1");
	             System.out.println("Intersection Area for Rectangle 3 and 1 is: " + intersectionArea3.getCalcArea());
	        }
	        //Rectangle 2 and 3
	        if((((cordin5.point1.getPointx1() >= pair1XSmall) && (cordin5.point1.getPointx1() <= pair1XLarge))) && (((cordin5.point1.getPointy1() >= pair1YSmall) && (cordin5.point1.getPointy1() <= pair1YLarge))))
	        {        ifCordin5 = true;
	       
	            if(ifCordin5 == true)
	            {
	                if(cordin5.point1.getPointy1() > pair1YLarge)
	                {
	                    intersectionLength3.setLength(Math.abs(cordin6.point1.getPointy1() - pair1YLarge));
	                }
	                else if(cordin5.point1.getPointy1() < pair1YLarge)
	                {
	                    intersectionLength3.setLength(Math.abs(cordin6.point1.getPointy1() - pair1YSmall));
	                }
	                //
	                if(cordin5.point1.getPointx1() > pair1XLarge)
	                {
	                    intersectionWidth3.setWidth(Math.abs(cordin6.point1.getPointx1() - pair1XLarge));
	                }
	                else if(cordin5.point1.getPointx1() < pair1XLarge)
	                {
	                    intersectionWidth3.setWidth(Math.abs(cordin6.point1.getPointx1() - pair1XSmall));
	                }
	                //
	                if (((cordin5.point1.getPointx1() == pair2XLarge || cordin5.point1.getPointx1() == pair2XSmall ) || (cordin5.point1.getPointy1() == pair2YLarge || cordin5.point1.getPointy1() == pair2YSmall )))
	                {
	                    if (area3.getCalcArea() < area2.getCalcArea())
	                        intersectionArea3.setCalcArea(area3.getCalcArea());
	                    else if (area2.getCalcArea() < area3.getCalcArea())
	                       intersectionArea2.setCalcArea(area2.getCalcArea());  
	                    else
	                        if(area2.getCalcArea() == area3.getCalcArea())

	                            intersectionArea3.setCalcArea(area3.getCalcArea());
	                 }
	                else
	                    intersectionArea3.CalcArea(intersectionWidth3.getWidth(), intersectionLength3.getLength());
	               
	                /*if(intersectionArea2.getCalcArea() > 0)
	                 {
	                     System.out.println("Intersection Area for Rectangle 3 and 2 is: " + intersectionArea3.getCalcArea());
	                 }*/
	         }
	        else
	         if((((cordin6.point1.getPointx1() >= pair1XSmall && cordin6.point1.getPointx1() <= pair1XLarge))) && (((cordin6.point1.getPointy1() >= pair1YSmall && cordin6.point1.getPointy1() <= pair1YLarge))))
	            {      ifCordin6 = true;
	       
	            if(ifCordin6 == true)
	            {
	                if(cordin6.point1.getPointy1() > pair2YLarge)
	                {
	                    intersectionLength3.setLength(Math.abs(cordin5.point1.getPointy1() - pair2YLarge));
	                }
	                else if(cordin6.point1.getPointy1() < pair2YLarge)
	                {
	                    intersectionLength3.setLength(Math.abs(cordin5.point1.getPointy1() - pair1YSmall));
	                }
	                //
	               
	              /*  if (cordin6.point1.getPointy1() == pair2YLarge || cordin6.point1.getPointy1() == pair2YSmall )
	                {
	                    intersectionArea3.setCalcArea(area3.getCalcArea());
	                }
	                else
	                    intersectionArea3.CalcArea(intersectionWidth3.getWidth(), intersectionLength3.getLength());
	                */
	             
	                //
	                if(cordin6.point1.getPointx1() > pair2XLarge)
	                {
	                    intersectionWidth3.setWidth(Math.abs(cordin5.point1.getPointx1() - pair2XLarge));
	                }
	                else if(cordin6.point1.getPointx1() < pair2XLarge)
	                {
	                    intersectionWidth3.setWidth(Math.abs(cordin5.point1.getPointx1() - pair2XSmall));
	                }
	                //
	                if ((cordin6.point1.getPointx1() == pair2XLarge || cordin6.point1.getPointx1() == pair2XSmall ) || (cordin6.point1.getPointy1() == pair2YLarge || cordin6.point1.getPointy1() == pair2YSmall ))
	                {
	                    if (area3.getCalcArea() < area2.getCalcArea())
	                        intersectionArea3.setCalcArea(area3.getCalcArea());
	                    else if (area2.getCalcArea() < area3.getCalcArea())
	                       intersectionArea2.setCalcArea(area2.getCalcArea());  
	                    else
	                        if(area2.getCalcArea() == area3.getCalcArea())


	                            intersectionArea3.setCalcArea(area3.getCalcArea());
	                }
	                else
	                    intersectionArea3.CalcArea(intersectionWidth3.getWidth(), intersectionLength3.getLength());
	               
	                 //
	                 /*if(intersectionArea3.getCalcArea() > 0)
	                 {
	                     System.out.println("Intersection Area for Rectangle 3 and 2 is: " + intersectionArea3.getCalcArea());
	                 }*/
	            }
	       
	         if(ifCordin5 == true || ifCordin6 == true)
	         {   System.out.println("Rectangle 3 intersect into Rectangle 2");
	             System.out.println("Intersection Area for Rectangle 3 and 2 is: " + intersectionArea3.getCalcArea());
	         }
	         
	       }

	    }
	   
	   
	    }
}



