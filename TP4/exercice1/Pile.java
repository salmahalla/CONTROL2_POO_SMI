package TP2.exercice1;

public class Pile{
    private final static int TAILLE = 10;
    private final Object [] pile;
    private int pos;
       
    public Pile(){ 
        pile=new Object[TAILLE];
        pos=0; 
    }
    
    public void empile(Object o) throws PilePleine{
        try{
            pile[pos]=o;
            pos++;
        }
        catch(ArrayIndexOutOfBoundsException e){
            throw new PilePleine("Pile pleine");
        }
    }
    
    public Object depile() throws PileVide{
        try{
            Object o = pile[pos-1];
            pos--;
        return o;
        }
        catch(ArrayIndexOutOfBoundsException e){
            throw new PileVide("Pile vide");
        }
    }

}
