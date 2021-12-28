package TP1.exercice7;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pimeur extends Article implements ProduitQuiSePerime {
    // Attributs :
    LocalDate datePeremption;
    double stock;

    // Constructeurs :
    public Pimeur() {
    }

    public Pimeur(LocalDate datePeremption, double prixAchat, double prixVente, String nom, String fournisseur) {
        super(prixAchat, prixVente, nom, fournisseur);
        this.datePeremption = datePeremption;
        stock = 0;
    }

    // Implementation des methodes de l'interface ProduitQuiSePerime :
    @Override
    public LocalDate DatePeremption() {
        return LocalDate.of(datePeremption.getYear() , datePeremption.getMonth(), datePeremption.getDayOfMonth()); 
    }

    @Override
    public float JoursRestants() {
        return ChronoUnit.DAYS.between(LocalDate.now() ,datePeremption);
    }
    
    // Redefinition de la methode d'affichage :
    @Override
    public String toString(){
        return super.toString() +
               "], Date de péremption : [" + DatePeremption() +
               "]."; 
    } 

}
