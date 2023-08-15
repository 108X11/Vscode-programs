import java.lang.Math;

public class math {

    public static void main(String[] args) {

        int val1 = -1;
        float val2 = .5f;

        System.out.println("Initial value of int  : " + val1);
        System.out.println("Initial value of int  : " + val2);

        int Abs1 = Math.abs(val1);
        float Abs2 = Math.abs(val2);

        System.out.println("Absolute value of int : " + Abs1);
        System.out.println("Absolute value of int : " + Abs2);
        System.out.println("");

        double Acos1 = Math.acos(60);
        System.out.println("acos value of Acosi : " + Acos1);
        double x = Math.PI;

        x = Math.toRadians(x);
        double Acos2 = Math.acos(x);
        System.out.println("acos value of Acosj : " + Acos2);

    }
}