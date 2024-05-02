import java.util.Scanner;
public class Exercice2
{        
     public static void main(String[] args)
    {
        int valide = 1;
        while (valide == 1) 
        {
        try
        {
            Scanner input = new Scanner(System.in);
            System.out.print("entrez un nombre a : ");
            double a = input.nextDouble();
            System.out.print("entrez un nombre b : ");
            double b = input.nextDouble();
            double formule;
        if(a != 0) {
                System.out.println("resultat ax+b = " +(-b/a));
            } else {
                System.out.println("Erreur ! veuillez entrer d'autres nombre");
            }
        } catch (Exception e)
        {
            System.err.println("Erreur ! veuillez entrer d'autres nombre");
        }
        }
        
    }
}