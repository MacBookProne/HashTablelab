package hashtablelab;

/**
 *
 * @author justinodea
 */
public class Hash {
    Tree[] arrayhashtable;
    
    public Hash(int size){
        arrayhashtable = new Tree[size]; // new tree with each spot in array has a tree 
        for(int i = 0; i<size; i++){
            arrayhashtable[i] = new Tree();
        }
    }
    
    public int hashFunction(int input){
        
        int location = input%arrayhashtable.length; 
        return location;
    }
    public int insert(int input){
        
    int spotInArray = hashFunction(input); //location where thing is going to go  
        arrayhashtable[spotInArray].insert(input);
        return 1; 
    
    }
    
     public int print(){
         for(int i = 0; i<arrayhashtable.length; i++){
                
          
         
        System.out.println( arrayhashtable[i].root.value);
         }
        return 1; 
        
    
    }
     
     public int find(){
         
         return 1; 
       
}
}
