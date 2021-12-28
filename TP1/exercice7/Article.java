package TP1.exercice7;

public class Article {
    // Attributs :
    double prixAchat;
    double prixVente;
    String nom;
    String fournisseur;

    public String getNom() {
        return nom;
    }
    

    // Constructeurs :
    public Article() {
    }

    public Article(double prixAchat, double prixVente, String nom, String fournisseur) {
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.nom = nom;
        this.fournisseur = fournisseur;
    }
   
    // Methodes :
    public double CalculateurTauxRendement(double prixAchat, double prixVente){
        return  (prixVente - prixAchat);   
    }
    
    @Override
    public String toString(){
        return "Prix d’achat : [" + prixAchat +
               "], Prix de vente : [" + prixVente +
               "], Nom : [" + nom +
               "], Fournisseur : [" + fournisseur ;
    }
    
}
