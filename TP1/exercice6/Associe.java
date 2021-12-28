package TP1.exercice6;

import java.time.LocalDate;

public class Associe extends Employe {
    // Atrributs :
    double beneficeNet;
    double purcentageContribution;
    final double chiffreAffaires = 20000000 ;

    // Constructeurs :
    public Associe() {
    }
    
    public Associe(String matricule, String nom, String prenom, LocalDate dateNaissance, double beneficeNet, double purcentageContribution) {
        super(matricule, nom, prenom, dateNaissance);
        this.beneficeNet = beneficeNet;
        this.purcentageContribution = purcentageContribution;
    }
    
    // Methodes :
    @Override
    public double getSalaire() {
        double salaire ;
        salaire = (beneficeNet * (purcentageContribution/100))/12 ;
        return salaire;  
    }
    
    @Override
    public String  toString() {
        return super.toString() + "], Salaire : [" + getSalaire() + "].";
    }
    
}
