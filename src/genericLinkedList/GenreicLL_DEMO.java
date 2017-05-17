/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericLinkedList;

/**
 *
 * @author mish-
 */
public class GenreicLL_DEMO {

    
    public static void main(String[] args) {
       
        
        LinkedList<Integer> sll_1= new LinkedList<Integer>();
        LinkedList<String> sll_2 = new LinkedList<String>();
        
        sll_1.InsertAtFront(10);
        sll_1.InsertAtBack(20);
        sll_1.Display();
        System.out.println("\n");
        
        
        ///Stringer:
        
        sll_2.InsertAtFront("mishari");
        sll_2.InsertAtFront("ahmed");
        sll_2.InsertAtFront("zaid");
        sll_2.InsertAtBack("moath");
        sll_2.Display();
        System.out.println("\n");
        
        
        
        
    }
    
}
