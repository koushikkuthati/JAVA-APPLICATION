package Exercise;

interface Perimeter{
    double PerimeterOfRectangle(double length,double breadth);

}

public class CalculateArea implements Perimeter {

    public static final float PI= 3.14F;


    public int  AreaOfRectangle(int length,int breadth){

        return length*breadth;

    }
    public int AreaOfSquare(int length){

        return length*length;
    }
    public float AreaOfCircle(float radius){

        return PI*radius*radius;
    }

    public double PerimeterOfRectangle(double length,double breadth){
        return 2*(length+breadth);
    }



}
