package thuchanh;

public class CircleTest {
    public static void main(String[] args) {
 //      Circle circle = new Circle();
//        System.out.println(circle);
//
       Circle circle = new Circle(  10);
//        System.out.println(circle);
//
//        circle = new Circle(3.5, "indigo", false);
//        System.out.println(circle);

        System.out.println(circle.getArea());
        System.out.println(circle.resize(0.9));
    }
}
