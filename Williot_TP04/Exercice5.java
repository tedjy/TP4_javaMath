import java.lang.Math;

public class Exercice5 {
    public static double f(double x)
    {
        return x*x -1;
    }
    public static double fprime(double x)
    {
        return 2*x;
    }
    public static void main(String[] args) 
    {
        double e = 0.00001;
        double u = 0;
        double x = 2;
        double v = 0;
        u = x;
        v = x - f(x) / fprime(x);
        while (Math.abs(v-u) > e)
        {
            u = v;
            v = v - f(v) / fprime(v);
        }

        System.out.println("La solution de cette fonction est " + v);
    }
}
