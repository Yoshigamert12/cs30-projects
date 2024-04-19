import java.lang.Math;


public class MathforCalc {
    public void perimeter(double len, double wid) {
        double per= 2*len + 2*wid;
        System.out.print(per);
       
    }

    // Surface area of a cube
    public void surfaceArea(double sid) {
        double SFA = sid*sid;
        double SFA2 = SFA * 6;
        
    }

    // Area of a circle
    public void circleArea(double rad) {
        double CA= rad*rad;
        double CA2 =CA * Math.PI;
        
    }
}


