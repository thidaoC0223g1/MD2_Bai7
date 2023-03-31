package hinhhoc;

import java.util.Arrays;

public class SsTest {
    public static void main(String[] args) {
        SsHinhTron [] duongtron = new SsHinhTron[3];
        duongtron[2]= new SsHinhTron();
        duongtron[1]=new SsHinhTron(4.2);
        duongtron[0]=new SsHinhTron("blue",true,6.7);

        System.out.println("truoc khi sap xep");
        for(SsHinhTron x: duongtron){
            System.out.println(x);
        }
        Arrays.sort(duongtron);
        System.out.println("sau khi sap xep");
        for(SsHinhTron x: duongtron){
            System.out.println(x);
        }
    }
}
