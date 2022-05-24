package MyPackage;

public class Circle {

    private double radius;

    public Circle(double r) {
        if(r<0){
            r = 0;
        }
        
        this.radius = r;
    }

    //INSTANCE METHODS
    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        double r = this.radius;

        double area = (r * r * Math.PI);

        return area;
    }


}
