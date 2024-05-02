import java.util.Scanner;

public class Exercice1 
{        
     public static void main(String[] args)
    {
    int valide = 0;
    do 
    {
      System.out.print("Entrez le nombre entier : ");
    try
    {
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        // String choix = input.readLine();
        // int numero = Integer.parseInt(choix);
        System.out.println("Le numero est :"+ numero);
    } 
    catch (Exception e) 
    {
        System.err.println("Numero incorrect Veuillez saisir un nombre entier");
    } 
      
    } while (valide == 0);
    
   
  }
}