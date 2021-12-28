package TP1.exercice6;

import java.time.LocalDate;

public abstract class Employe {
    // Atrributs :
    String matricule;
    String nom ;
    String prenom;
    LocalDate dateNaissance;
    
    // Constructeurs :
    public Employe(){
    }
    
    public Employe (String matricule ,String nom ,String prenom ,LocalDate dateNaissance) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;   
        this.dateNaissance = dateNaissance;      
    }
    
    // Methodes :
    public abstract double getSalaire();
    
    @Override
    public String toString() {
        return "Matricule : [" + matricule 
             + "], Nom complet : [" + prenom + " " + nom 
             + "], Âge : [" + (LocalDate.now().getYear() - dateNaissance.getYear());
    }
}
