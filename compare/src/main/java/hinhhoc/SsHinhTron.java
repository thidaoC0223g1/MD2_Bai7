package hinhhoc;
public class SsHinhTron extends HinhTron implements Comparable<SsHinhTron>{
    public SsHinhTron() {
    }

    public SsHinhTron(double radius) {
        super(radius);
    }

    public SsHinhTron(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(SsHinhTron x) {
        if (getRadius() > x.getRadius()) return 1;
        else if (getRadius() < x.getRadius()) return -1;
        else return 1;
    }
}
