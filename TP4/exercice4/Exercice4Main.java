package TP2.exercice4;

public class Exercice4Main {

   public static void main(String[] args) {
       
       try {
            AdresseIP adresse1 = new AdresseIP(196,4,2,10);
            System.out.println( adresse1.toString());
       } catch (AdresseIPException ex) {
            System.out.println("Cette adresse contient des nombres non valides.");
       }  
       /* La sortie sera la suivante :
       
        196.4.2.10
       
       **/
       try {
            AdresseIP adresse2 = new AdresseIP(277,4,2,888);
            System.out.println( adresse2.toString());
       } catch (AdresseIPException ex) {
            System.out.println("Cette adresse contient des nombres non valides.");
       } 
       /* La sortie sera la suivante :
       
        Cette adresse contient des nombres non valides.
       
       **/
    }
    
}
