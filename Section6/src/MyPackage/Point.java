package MyPackage;

import java.lang.Math;

public class Point {
    private int x;
    private int y;

    public Point(){}

    public Point(int myX, int myY){

    }

    //METHODS

    public int getX(){
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int myX){
        this.x = myX;
    }
    public void setY(int myY){
        this.y = myY;
    }

    public double distanceForm(int xA, int yA, int xB, int yB){
        return Math.sqrt( Math.pow( (xB - xA), 2) + Math.pow( (yB - yA), 2) );
    }
    //No Parameters distance
    public double distance(){
        return distanceForm(this.getX(), this.getY(), 0, 0);
    }

    public double distance(int x, int y){
        return distanceForm(this.getX(), this.getY(), x, y);
    }

    public double distance(Point p){
        return distanceForm( this.getX(), this.getY(), p.getX(), p.getY() );
    }

}
