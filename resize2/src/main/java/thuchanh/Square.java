package thuchanh;

import Resize2.Colorable;
import Resize2.Resize;

public class Square extends Shape implements Colorable, Resize {
    private double edge =0;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(String color, boolean filled, double edge) {
        super(color, filled);
        this.edge = edge;
    }
    public double getArea(){
        return this.edge*this.edge;
    }
    public String howToColor(){
       return "colored all four side";
    }
    public double resize(double pt){
        return getArea()*pt;

    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

}
