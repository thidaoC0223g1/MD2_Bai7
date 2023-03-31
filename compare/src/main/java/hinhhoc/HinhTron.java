package hinhhoc;

public class HinhTron extends HinhDang{
    private double radius;

    public HinhTron() {
        radius =1.0;
    }

    public HinhTron(double radius) {
        this.radius = radius;
    }

    public HinhTron(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPerimeter(){
        return this.radius*Math.PI*2;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
   @Override
    public String toString(){
        return "mot duong tron ban kinh "+ getRadius()+" la " + super.toString();
    }

}
