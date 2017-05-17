
public class SLLDemo {
    
    public static void main(String[] args) {
        
        
        LinkedList sll = new LinkedList();
        sll.InsertAtFront("ahmed");
        sll.InsertAtFront("zaid");
        sll.InsertAtFront("mishari");
        sll.InsertAtBack("moath");
        System.out.println("before Delete: ");
        sll.Display();
        
        System.out.print("\n after the AddNodeAfter : \n");
        sll.AddNodeAfter("ahmed", "Mishari");
        sll.Display();
        //some space for understand;
        
        System.out.print("\n after the DeleteFromFront : \n");
        sll.RemoveFromFront();
        sll.Display();
        System.out.print("\n after the DeleteFromLast : \n");
        sll.RemoveFremLast();
        sll.Display();
        System.out.println("\n");
       
        
        
        
}//end of the main;
}//end of the class;