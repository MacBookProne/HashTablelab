package hashtablelab;


/**
 *
 * @author justinodea
 */

class Node {

   
    // public double; // data item
    public int value;
    public Node leftChild; // this node's left child
    public Node rightChild; // this node's right child
    
    
    //constructor
    public Node(int input){
        value = input;
    }
}

    /*public void displayNode() // display ourself
    {
        System.out.print('{');
        
        System.out.print(", ");
        // System.out.print(dData);
      
        System.out.print("} ");
    }
 // end class Node
*/