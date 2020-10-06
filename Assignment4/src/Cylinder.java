import static java.lang.Math.PI;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        super();
        height=1.0;
    }
    public Cylinder(double height){
        super();
        this.height=height;
    }
    public Cylinder(double height,double radius){
        super(radius);
        this.height=height;
    }
    public Cylinder(double height,double radius,String color){
        super(radius,color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getVolume(){
        return PI*getRadius()*getRadius()*height;
    }

    @Override
    public String toString() {
        return "radius is " + getRadius()+
                ", color is " +getColor()+
        ", height is " + height +". ";
    }

    @Override
    public double getArea(){
        return 2*PI*getRadius()*(getRadius()+height);
    }
}
