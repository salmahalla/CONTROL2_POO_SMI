package TP1.exercice6;

import java.time.LocalDate;

public class Exercice6Main {

 public static void main(String[] args) {
    // La créeation d'un Ouvrier :
    Ouvrier e1 = new Ouvrier("M123456", "HAllA", "Salma", LocalDate.of(2000,04,07), LocalDate.of(2018,5,4));
    
    //L'affichage de l'Ouvrier :
    System.out.println(e1.toString());
    /* La sortie la suivante :
    
    Matricule : [M123456], Nom complet : [Salma HAllA], Âge : [21], Salaire : [6000.0].   
    
    **/
    
    // La créeation d'un Cadre :
    Cadre e2 = new Cadre("M123456", "HAllA", "Salma" , LocalDate.of(2000,04,07), 3);
    
    //L'affichage du Cadre :
    System.out.println(e2.toString());
    /* La sortie la suivante :
       
    Matricule : [M123456], Nom complet : [Salma HAllA], Âge : [21], Salaire : [16000.0]. 
    
    **/
    
    // La créeation d'un Associe :
    Associe e3 = new Associe("M123456", "HAllA", "Salma" , LocalDate.of(2000,04,07), 4000000, 50);
    
    //L'affichage de l'Associe :
    System.out.println(e3.toString());
    /* La sortie la suivante :
     
    Matricule : [M123456], Nom complet : [Salma HAllA], Âge : [21], Salaire : [166666.66666666666].
        
    **/
    
    }
    
}
