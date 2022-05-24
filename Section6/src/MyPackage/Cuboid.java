package MyPackage;

public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double w, double l,double h) {
        super(w, l);

        h = (h<0) ? 0 : h;

        this.height = h;
    }

    public double getHeight(){
        return this.height;
    }

    public double getVolume(){
        return this.getArea() * getHeight();
    }
}
