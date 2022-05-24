package MyPackage;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double w, double l) {
        w = (w<0) ? 0 : w;
        l = (l<0) ? 0 : l;

        this.width = w;
        this.length = l;
    }

    //METHODS (Public)

    public double getWidth(){
        return this.width;
    }

    public double getLength(){
        return this.length;
    }

    public double getArea(){
        return getWidth() * getLength();
    }


}
