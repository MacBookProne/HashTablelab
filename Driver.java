package hashtablelab;

/**
 *
 * @author justinodea
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hash myHashTable = new Hash(7);
        for(int i = 0; i<15; i++){
            myHashTable.insert((int)(Math.random()*100));
        }
        myHashTable.print();
    }
     
    
}
