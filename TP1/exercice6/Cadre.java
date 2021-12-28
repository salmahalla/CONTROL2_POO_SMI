package TP1.exercice6;

import java.time.LocalDate;

public class Cadre extends Employe {
    // Atrributs :
    int indice;
    
    // Constructeurs :
    public Cadre() {
    }

    public Cadre(String matricule, String nom, String prenom, LocalDate dateNaissance, int indice) {
        super(matricule, nom, prenom, dateNaissance);
        this.indice = indice;
    }
    
    // Methodes :
    @Override
    public double getSalaire() {
        double salaire ;
        salaire = switch (indice) {
            case 1 -> 12000;
            case 2 -> 14000;
            case 3 -> 16000;
            case 4 -> 18000;
            default -> 0;
        };       
        return salaire;   
    }
    
    @Override
    public String  toString() {
        return super.toString() + "], Salaire : [" + getSalaire() + "].";
    }
}
