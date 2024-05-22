package MODULE2.EXERCISE;


public class Rectangle {

    public int l=20;
    public int b=10;
    public static void main(String[] args) {

        Rectangle r=new Rectangle();
        System.out.println( r.Area());
        System.out.println(r.perimeter());


    }
    public int Area(){
        return l+b;
    }
    public int perimeter(){
        return 2*(l+b);
    }

}
