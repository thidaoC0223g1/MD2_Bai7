package thuchanh;

import Resize2.Colorable;
import Resize2.Resize;

public class ShapeTest {

    public static void main(String[] args) {
        Resize[] hinh = new Resize[3];
        hinh[0] = new Circle(5.7);
        hinh[1] = new Rectangle(2.4, 4.5);
        hinh[2] = new Square(6);

        System.out.println("dien tich truoc khi resize");
        double random = Math.random() * 100 + 1;
        int random1 = (int) random;
        for (Resize x : hinh) {
            System.out.println("x= " + x.getArea());
        }

        System.out.println("ti le resize = " + random1);
        System.out.println("dien tich sau khi resize");
        for (Resize x : hinh) {
            System.out.println("x =" + x.resize(random1));
        }

        System.out.println("hinh can to mau la hinh vuong");
        for (Resize x : hinh) {
            if (x instanceof Square) {
                Colorable c = (Square) x;
                System.out.println(c.howToColor());
            }
        }

    }
}
