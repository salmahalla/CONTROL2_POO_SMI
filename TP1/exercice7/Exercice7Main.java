package TP1.exercice7;

import java.time.LocalDate;

public class Exercice7Main {

    public static void main(String[] args) {
        
        //test1 :
        
        ArticleElectromenager aEm = new ArticleElectromenager(220, "LG", 3200, 4000, "Machine a laver", "Hamid");
        
        System.out.println(aEm.toString());
        
        aEm.LancerSolde(6);
        
        System.out.println(aEm.toString());
        
        aEm.TerminerSolde(6);
        
        System.out.println(aEm.toString());
        
        //test2 :
       
        Pimeur p = new Pimeur(LocalDate.of(2022,02,07), 10, 15, "Pomme", "Bouchaib");
         
        System.out.println(p.toString());
        System.out.println(p.JoursRestants());
    }
    
}
