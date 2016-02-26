package hashtable_lab;

/**
 *
 * @author justinodea
 */
public class HashBackend {

    public Node[] ArrayHash;  // initializes an array of node 
    public Node HNode; // initalizes a node 
    public Node Hydro = new Node(0); //takes in an integer because its zero

    public HashBackend(int maxSize) {
        ArrayHash = new Node[maxSize]; //creates a node called HNode 
    } //ends HashBackend()

    public void insert(Node n) { //new method 

        int hash = n.value % ArrayHash.length; //calls hash index

        if (ArrayHash[hash] == null) {
            Node x = new Node(n.value); //makes new node 
            IBT(hash, x);
        } else {
            IBT(hash, n);
        }// end else 
    }//end insert()

    public void IBT(int root, Node insert) {
        if (ArrayHash[root] == null) {
            ArrayHash[root] = insert;
        } // end null 

        if (ArrayHash[root].value == insert.value) { //has value inserts value 
            ArrayHash[root] = insert;

        } else {
            if (ArrayHash[root].value > insert.value) {
                if (ArrayHash[root].leftChild == null) {
                    ArrayHash[root].leftChild = insert;
                } else {
                    boolean done = false; //if there is no right child adds to left 
                    Node traversal = ArrayHash[root].leftChild;
                    while (!done) {
                        if (insert.value < traversal.value) {
                            if (traversal.leftChild == null) {
                                traversal.leftChild = insert;
                                done = true;
                            } else {
                                traversal = traversal.leftChild;
                            }
                        } else if (insert.value > traversal.value) {
                            if (traversal.rightChild == null) {
                                traversal.rightChild = insert;
                                done = true;
                            } else {
                                traversal = traversal.rightChild;
                            }

                        }

                    }

                }//ends left else 
            }//ends left if

            if (ArrayHash[root].value < insert.value) {
                if (ArrayHash[root].rightChild == null) {
                    ArrayHash[root].rightChild = insert;
                } else {
                    boolean done = false;
                    Node traversal = ArrayHash[root].rightChild;
                    while (!done) {
                        if (insert.value < traversal.value) {
                            if (traversal.leftChild == null) {
                                traversal.leftChild = insert;
                                done = true;
                            } else {
                                traversal = traversal.leftChild;
                            }
                        } else if (insert.value > traversal.value) {
                            if (traversal.rightChild == null) {
                                traversal.rightChild = insert;
                                done = true;
                            } else {
                                traversal = traversal.rightChild;

                            }

                        }
                    }
                }//ends right else 
            } //ends right if 

        }//ends left else
    } // End insertBinarytree()
    public boolean find(int i )// command for menu to find a node in the tree :)
    {
        int hash = 1 % ArrayHash.length; 
        if(hash >= ArrayHash.length)
        {
            System.out.println("Error. Hash value is " + hash + "maxium length is" + ArrayHash.length);
        }
        return FindNode(ArrayHash[hash], i); 
    }//end find()
    
    public boolean FindNode(Node NodeValue, int i){
        if(NodeValue !=null){
            if(NodeValue.value == i){
                System.out.println(i + " was found!");
                return true; 
            }
            else//searching the whole tree 
            {
            if (NodeValue.value > i){
                return FindNode(NodeValue.leftChild, i); 
            }
            else
            {
                return FindNode (NodeValue.rightChild, i); 
            }// end else 2 
                
            
            }//end else 1 
            }//end if 
        System.out.println(i + " was not found.");
        return false; 
    }// end FindNode()
    
    public void inOrder(Node x)//inOrder Traversal 
    {
        if (x != null){
            inOrder(x.leftChild); 
            System.out.println(x.value +" ");
            inOrder(x.rightChild); 
        }//end if 
        
    }//end inOrder()
    
    
    
public void show_HTable(){
    for(int i =0; i < ArrayHash.length; i++){
        System.out.println(i + ": ");
        inOrder(ArrayHash[i]); 
        System.out.println();
        
    }//end for 
    
}// end show()
//public delete 

}//end class HashBackend 
    

