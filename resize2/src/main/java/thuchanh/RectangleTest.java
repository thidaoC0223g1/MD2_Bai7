package thuchanh;

public class RectangleTest {
    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);

       Rectangle rectangle = new Rectangle(2.3, 5.8);
        //System.out.println(rectangle);

//        rectangle = new Rectangle(2.5, 3.8, "orange", true);
//        System.out.println(rectangle);
        System.out.println(rectangle.getArea());

        System.out.println(rectangle.resize(0.8));
    }
}
