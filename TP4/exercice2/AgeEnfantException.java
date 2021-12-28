package TP2.exercice2;

public class AgeEnfantException extends Exception {
    // constructeur de MonException :
    public AgeEnfantException(){
    }
    
    // Redefinition de la propriété Message.
    @Override
    public String getMessage(){
        return  " ans n'est pas un âge valide !"; 
    }
}
