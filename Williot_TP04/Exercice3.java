import java.util.Scanner;
import java.lang.Math;

public class Exercice3
{        
     public static void main(String[] args)
    {
        int valide = 1;
        while (valide == 1) 
        {
        try
        {
            Scanner input = new Scanner(System.in);
            System.out.println("entrez un nombre a : ");
            double a = input.nextDouble();
            System.out.println("entrez un nombre b : ");
            double b = input.nextDouble();
            System.out.println("entrez un nombre c : ");
            double c = input.nextDouble();
           
            double deltaForm = (b * b) - 4 * a * c;
            if (deltaForm > 0)
            {
                double x1 = -b + Math.sqrt(deltaForm) / 2 * a;
                double x2 = -b - Math.sqrt(deltaForm) / 2 * a;
                System.out.println("deux solution");
                System.out.println(x1);
                System.out.println(x2);
                
            } 
            else if (deltaForm == 0)
            {
                double x = -b / 2 * a;
                System.out.println("une solution");
                System.out.println(x);
             
            } 
            else if (deltaForm < 0)
            {
                System.out.println("pas de solution");
               
            }
 
           System.out.println(deltaForm);
            
        }
        
         catch (Exception e)
        {
            System.err.println("Erreur ! veuillez entrer d'autres nombre");
        }
    }
        
    }
}
