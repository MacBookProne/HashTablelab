/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtablelab;

/**
 *
 * @author justinodea
 */
public class Tree {
      Node root; // first node of tree
    // -------------------------------------------------------------

    public Tree() // constructor
    {
        root = null;
    } // no nodes in tree yet
    private void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.value + " ");
            inOrder(localRoot.rightChild);
           
        }
        
    }
    public int insert(int input){
    Node tempNode = new Node(input);
    root = tempNode;
    return 1;      
        
    }
}

