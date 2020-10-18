/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UB
 */
public class Rectangle {
	private float calcArea;
    private float length;
    private float width;
    private Points points;
    Points point1 = new Points();
 
    public Rectangle(float calcArea, float length, float width)
    {
       
    }
   
   
    public Rectangle()
    {
       
    }

    public float getCalcArea() {
       
        return calcArea;
    }

    public void CalcArea(float length, float width){
       calcArea = length * width;
       //this.calcArea = calcArea;
    }
   
    public void setCalcArea(float area)
    {
        calcArea = area;
    }
           
    public float getLength() {
        return length;
    }

    public void setLength(float len) {
        length = len;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float wid) {
        width = wid;
    }

    public Points getPoint() {
        return points;
    }

    public void setPoint(float x, float y) {
       point1.setPointx1(x);
       point1.setPointy1(y);
       
    }
   
   
   
}