


public class Exercice4 {
     public static double f(double x) 
     {

        return x*x - 1;
     }

    public static void main(String[] args) 
    {
        double e = 0.001;
         
        double a = 0.166;
        
        double b = 1.125;
        double m = 0.0;
        while ((b-a) > e) 
        {
            m = (a+b)/2;
            if (f(a) * f(m) <= 0) {
                b = m;
                
            } else {
                a = m;
                
            }
        }
        System.out.println("la solution est : " + m);
        
    }
}