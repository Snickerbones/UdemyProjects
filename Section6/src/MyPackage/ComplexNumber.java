package MyPackage;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber() {
        real = 0;
        imaginary = 0;
    }

    public ComplexNumber(double r, double i) {
        real = r;
        imaginary = i;
    }

    //Methods
    public double getReal(){
        //System.out.println("real value: " + this.real);
        return this.real;
    }

    public double getImaginary(){
        return this.imaginary;
    }

    public void add(double r, double i){

        this.real = r + getReal();
        this.imaginary = i + getImaginary();

       /* System.out.println("This real number: " + getReal());
        System.out.println("This imaginary number: " + getImaginary());*/
    }

    public void add(ComplexNumber c){

        this.real = c.getReal() + getReal();
        this.imaginary = c.getImaginary() + getImaginary();

        /*System.out.println("This real number: " + getReal());
        System.out.println("This imaginary number: " + getImaginary());*/
    }

    public void subtract(double r, double i){
        this.real = getReal() - r;
        this.imaginary = getImaginary() - i;

        /*System.out.println("This real number: " + getReal());
        System.out.println("This imaginary number: " + getImaginary());*/
    }

    public void subtract(ComplexNumber c){
        this.real = getReal() - c.getReal();
        this.imaginary = getImaginary() - c.getImaginary();

        /*System.out.println("This real number: " + getReal());
        System.out.println("This imaginary number: " + getImaginary());*/
    }


}
