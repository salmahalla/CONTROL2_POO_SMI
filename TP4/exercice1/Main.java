package TP2.exercice1;

public class Main {

    public static void main(String[] args) {
        Pile pile = new Pile();
        
        try{
            for(int i=0; i<args.length ;i++){
                pile.empile(args[i]);
            }
        }
        catch(PilePleine e){
        }
        
        try {
            for(;;) System.out.print(pile.depile()+" ");
            }
        catch(PileVide e) { 
            System.out.println();
        } 
        
}
}
    
