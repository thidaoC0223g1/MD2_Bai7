package hinhhoc;

import java.util.Arrays;
import java.util.Comparator;

public class TestSoSanh {
    public static void main(String[] args) {
        HinhTron [] c = new HinhTron[3];
        c[0]=new HinhTron();
        c[1]=new HinhTron("red",false, 5.6);
        c[2]=new HinhTron(4.3);
        System.out.println("truoc khi sap xep");
        for(HinhTron x :c){
            System.out.println(x);
        }
        Comparator a= new BoSoSanh();
        Arrays.sort(c,a);
        System.out.println("sau khi sap xep");
        for(HinhTron x:c){
            System.out.println(x);
        }

    }
}
