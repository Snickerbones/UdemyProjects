package MyPackage;

public class Wall {

    double width;
    double height;

    //Default Constructor
    public Wall(){
    }

    //Loaded Constructor
    public Wall(double w, double h){

        if(w<0){
            width = 0;
        }else{ width = w;}

        if(h<0){
            height = 0;
        }else{ height = h;}
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double myWidth){
        if(myWidth<0){
            width = 0;
        }else{ width = myWidth;}
    }

    public void setHeight(double myHeight){
        if(myHeight<0){
            height = 0;
        }else{ height = myHeight;}
    }

    public double getArea(){
        return this.height * this.width;
    }

}
