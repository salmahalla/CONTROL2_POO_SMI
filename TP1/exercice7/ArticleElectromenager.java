package TP1.exercice7;
 
public class ArticleElectromenager extends Article implements ProduitSusceptibleVendueEnSolde {
    // Attributs :
    double voltage;
    String marque;
    int stock;

    // Constructeurs :
    public ArticleElectromenager() {
    }

    public ArticleElectromenager(double voltage, String marque, double prixAchat, double prixVente, String nom, String fournisseur) {
        super(prixAchat, prixVente, nom, fournisseur);
        this.voltage = voltage;
        this.marque = marque;
        stock = 0;
    }

    // Implementation des methodes de l'interface ProduitSusceptibleVendueEnSolde :
    @Override
    public void LancerSolde(double pourcentage) {
        prixVente -= prixVente * pourcentage / 100;
    }

    @Override
    public void TerminerSolde(double pourcentage) {
        prixVente += prixVente * pourcentage / 100;
    }
    
    // Redefinition de la methode d'affichage :
    @Override
    public String toString(){
        return super.toString() +
               "], Marque : [" + marque +
               "], Voltage : [" + voltage +
               "]."; 
    } 
}
