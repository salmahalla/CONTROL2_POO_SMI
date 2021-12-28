package TP2.exercice2;

public class Exercice2Main {

   public static void main(String[] args){
    
       Enfant e1 = new Enfant();
     
       try {
           e1.setAge(70);
        } 
       catch (AgeEnfantException ex) {
           System.out.println( e1.getAge() + ex.getMessage());
       }
       /* La sortie sera la suivante :
       
        70 ans n'est pas un âge valide !
       
       **/
       
       Enfant e2 = new Enfant();
       
        try {
           e2.setAge(7);
        } 
       catch (AgeEnfantException ex) {
           System.out.println( e2.getAge() + ex.getMessage());
       }
       /* La sortie sera la suivante :
       
        L'age de l'enfant est : 7 ans.
       
       **/
    }
    
   
}
