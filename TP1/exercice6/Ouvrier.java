package TP1.exercice6;

import java.time.LocalDate;

public class Ouvrier extends Employe {
    // Atrributs :
    LocalDate dateEntree;
    final double SMIG = 3000;
    
    // Constructeurs :
    public Ouvrier(){
    } 

    public Ouvrier(String matricule, String nom, String prenom, LocalDate dateNaissance, LocalDate dateEntree) {
        super(matricule, nom, prenom, dateNaissance);
        this.dateEntree = dateEntree;
    }
    
    // Methodes :    
    @Override
    public double getSalaire() {
        double salaire;
        salaire = SMIG + (LocalDate.now().getYear() - dateEntree.getYear()) * 100;
        if (salaire > SMIG*2){
            return salaire;
        }
        else {
            salaire = SMIG*2 ;
        }
        return salaire;
    }
    
    @Override
    public String  toString() {
        return super.toString() + "], Salaire : [" + getSalaire() + "].";
    }
    
}
