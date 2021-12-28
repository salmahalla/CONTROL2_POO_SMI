package TP2.exercice2;

public class Enfant {
    // Atrributs :
    private int age;
    
    // Constructeur :
    public Enfant(){
    }
    
    // Getter :
    public int getAge() {
        return age;
    }
 
    // Setter : 
    public void setAge(int age) throws AgeEnfantException {
        this.age = age;
        if (age >= 1 && age <= 10){
            System.out.println("L'age de l'enfant est : " + age + " ans.");
        } 
        else {
            // Generer une exception de type AgeEnfantException.
            throw new AgeEnfantException();
            
        }
    }
    
}
