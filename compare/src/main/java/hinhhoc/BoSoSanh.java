package hinhhoc;

import java.util.Comparator;

public class BoSoSanh  implements Comparator<HinhTron> {
    @Override
    public  int compare( HinhTron c1, HinhTron c2){
        if(c1.getRadius()>c2.getRadius())return 1;
        else if(c1.getRadius()<c2.getRadius())return -1;
        else return 0;
    }
}
