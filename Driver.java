package hashtablelab;

/**
 *
 * @author justinodea
 */
public class Driver { //pass apropraite tree object 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hash myHashTable = new Hash(7);
        for(int i = 0; i<15; i++){
            int a=(int)(Math.random()*100);
            System.out.print( a+" ");
            myHashTable.insert(a);
            
        }
        myHashTable.print();
    }
     
    
}


//ignore this class 
