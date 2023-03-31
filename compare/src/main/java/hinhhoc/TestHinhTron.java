package hinhhoc;
public class TestHinhTron{
    public static void main(String[] args) {
        HinhTron c1= new HinhTron();
        System.out.println(c1);
        c1= new HinhTron(4.2);
        System.out.println(c1);
        c1=new HinhTron("yellow", false, 5.7);
        System.out.println(c1);

    }
}
