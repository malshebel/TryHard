
package genericLinkedList;


public class SLLNode<T> {
   


public  T Data;
public SLLNode<T> next;


    public SLLNode(T Data) {
        this(Data,null);
    }
    public SLLNode(T Data, SLLNode<T> next) {
        this.Data = Data;
        this.next = next;
    }
}


