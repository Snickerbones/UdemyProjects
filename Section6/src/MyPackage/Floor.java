package MyPackage;

public class Floor {
    private double width;
    private double length;

    public Floor(){
        this.length = 0;
        this.width = 0;
    }

    public Floor(double w, double l){
        if(l<0){
            this.length = 0;
        }else{this.length = l;}

        if(w<0){
            this.width = 0;
        }else{this.width = w;}
    }

    public double getArea(){
        return this.length * this.width;
    }



}
