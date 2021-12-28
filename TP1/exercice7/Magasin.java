package TP1.exercice7;


public class Magasin {
    // Attributs :
    Article[][] QuantiteEnStock;
    String[] ProduitsVendus;
    String[] ProduitsEnStock;
    
    // Constructeurs :
    public Magasin() {
    }

    public Magasin(Article[][] QuantiteEnStock, String[] ProduitsVendus, String[] ProduitsEnStock) {
        this.QuantiteEnStock = new Article[QuantiteEnStock.length][2];
        this.ProduitsVendus = ProduitsVendus;
        this.ProduitsEnStock = ProduitsEnStock;
    }
    
    // Methodes :
    public void VendreArticle(String nom,double qte) {
    }
    
    public void S_Approvisionner(String nom ,double qte) {
        
    }
    
    public Article ListeArticlesEnRupture(){
        
        return null; 
    }
    
    public Article ListeArticlesDisponibles(){
        
        return null; 
    }
    
    public void QuantiteEnStock(String nom){
    
    }
    
    public void EtatDuMagasin(){
    
    }
    
    public double CalculateurTauxRendement(){
        
        return 0;   
    }
}
