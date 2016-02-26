package hashtable_lab;

/**
 *
 * @author justinodea
 */

import java.io.BufferedReader; // import statment 
import java.io.IOException; //import statement 
import java.io.InputStreamReader;//import statement 
import java.util.Scanner;//import statement 
import java.lang.Math;//import statement 


public class HashMain {

   
    public static void main(String[] args) {
   
        int size = 0; //
        int items = 0; // 
        int findKey = 0; // 
        int insertKey = 0;// 
        boolean running = true;
        
        Scanner scan = new Scanner(System.in);
   
        

            System.out.println("Enter the size of the hash table:");
            size = scan.nextInt(); // asks for the size of the hash table and stores it. 
            System.out.println("Enter the inital number of items");
            items = scan.nextInt(); // asks for the number of items and stores it to items
            HashBackend ArrayHash = new HashBackend(size);
            System.out.println("Checking for duplicate numbers...");
            for(int i=0; i < items; i++) // to create a new node with a random values to use. 
            {
              
                int randomNumber = (int) (Math.random()*20);

                while(ArrayHash.find(randomNumber)==true){
                  randomNumber = (int) (Math.random()*20);
                } // end while, this code should prevent duplicite numbers.
                
                //System.out.println(randomNumber);
                Node n = new Node(randomNumber);
                ArrayHash.insert(n);
            }
        while(running)
        {
            System.out.print("Enter first letter of ");
            System.out.print("enter, show, insert, find, or press X to escape: ");
            int choice = 0;
            try{    
            choice = getChar();}
            catch(IOException ex){
            System.out.println("An error was thrown 1" + ex.getMessage());
            }        
            switch(choice)
            {

                 case 's':
                    ArrayHash.show_HTable();
                    break;
                case 'i':
                    System.out.println("Enter the key to insert:");
                    insertKey = scan.nextInt();
                    ArrayHash.insert(new Node(insertKey)); // should add the new node to tree
                    break;
                case 'f':
                    System.out.println("Enter the key value to find:");
                     findKey = scan.nextInt();
                     ArrayHash.find(findKey);
                    break;
                case 'x':
                    running = false;
                    break;
                default:
                    System.out.print("Invalid entry/n");
            } // end switch
        } // end while  
    } // End Main
    
    public static String getString() throws IOException
    {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String s = br.readLine();
      return s;
    } // ends getString()
    public static String getText() throws IOException
    {
        String outStr = "", str = "";
        while(true)
        {
            str = getString();
            if(str.equals("$"))
                return outStr;
            outStr = outStr + str + "/n";
        } // end str while 
    } // end getText()
    
    public static char getChar() throws IOException 
    {
        String s = getString();
        return s.charAt(0);
    } // Ends getChar()
    
    public static int getInt() throws IOException
    {
        String s = getString();
        return Integer.parseInt(s);
    } // end getInt()
   
} // End Classa
