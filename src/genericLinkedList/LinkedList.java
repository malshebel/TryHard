
package genericLinkedList;



    
    
    
public class LinkedList<T> {
    
   SLLNode <T> head ,last;
   int size;
   
    
    
     public LinkedList() {
        this.head = null;
        this.last = null;
        this.size = size;
    }
     
     
     public boolean isEmpty(){
         
         return head == null;
     }
     
     public void listsize(){
         
         System.err.println("List Size : "+ size);
     }
     
     public void InsertAtFront(T Data){
         
         if(isEmpty()){
           head = last = new SLLNode<T>(Data , head);
         }
         else{
             head = new SLLNode<T>(Data , head);
         }
         size++;
     }
     
     public void InsertAtBack(T Data){
         if(isEmpty()){
             head = last = new SLLNode<T>(Data);
         }else{
             last.next = new SLLNode<T>(Data);
             last = last.next;   
         }
         size++;
     }
     
     public void RemoveFromFront(){
         if(isEmpty()){
             
             System.out.println("Srry cant Remove from Empty Liast");
             return;
         }
         else if(head == last){    
            head = last = null;
         }else{    
             head = head.next;
         }
         size--;
     }
     
     public void RemoveFremLast(){
         SLLNode <T>current = head;
         if(isEmpty()){
             
             head = last = null;
         }else if(head == last){
             
             head = last = null;
         }else{
             while(current.next!= last)
                current= current.next;
             
             last = current;
             current.next = null;
         }
         
     }
     
     
     public void Display(){
         SLLNode<T> current = head;
         if(isEmpty()){
             
             System.out.println("Srry Empty list");
         }else if(head == last){
             
             System.out.println("there's only one Element in List : " + current.Data);
             
         }else{
             
             while(current != null){
                 
                 System.out.print("   "+current.Data);
                 //System.out.println("  "+ current.Data);
                 current= current.next;
             }
         }
     }
     
     
     public boolean isInList(T x){
         SLLNode <T>current = head;
         while(current !=null){
         
             if(current.Data == x){
                 //System.out.println("the elment in the list");
                 return true;
             }else
                 current = current.next;
         }
         //System.out.println("there's no element in the list called : "+ x);
         return false;
         /*if(current.Data != x)
            System.out.println(" there's no elment in the list called "+ x );
         return; */
     }
     
     public void AddNodeAfter(T x  , T val){
         
         
         if(head.Data == x){
             
             head = new SLLNode<T>(val , head);
             
         }else if(head == last){
             
             head.next = new SLLNode<T>(val , null);
             
         }else if(isInList(x)){
             SLLNode <T>current = head;
             while(current.Data != x){
                 current = current.next;
             }
             current.next = new SLLNode<T>(val , current.next);
             if (current == last){
                 
                 last = current.next;
                 
             }else
                 System.out.println("Srry The value "+x+" is not included in the list");
         }
         size++;}
     



//issue HERE.
     public void AddNodeBefore(T x , T val){
         SLLNode <T>current = head;
         if(isInList(x)){
             System.out.println("The value");
             
                 while(current!=null){
                     current = current.next;
             
                     if(current.next.Data == x){
                         current.next = new SLLNode<T>(val , current.next);
                         System.out.println("step2");
                         break; 
                     }
                 }
             if(current.next == last){
                 
                 head = new SLLNode<T>(val, last);
                 
             }
     }
     }
     
     
    
    /* SLLNode head;

    public LinkedList(SLLNode head) {
        this.head = null;
    }
    
    public boolean isEmpty(){
       return(head == null);
    }
    
    public void addAtFront(SLLNode newNode){
        
        
        newNode.setNext(head);
        head = newNode;
        
    }
    
    public void DeleteAtFront(){
        
        head.getNext().setNext(head);
        
        
    }
    
    
    public void Display(){
        
        SLLNode curr = head;
        while(curr !=null){
            System.out.println("LinkedList.Display() : ");
            System.out.println(curr.getData());
            curr = curr.getNext();
            
        }
        
    }
    
    
    */
}

    
    

