
public class SLLNode {


private String Data;
private SLLNode next;
private SLLNode prev;



    public SLLNode(String Data,SLLNode next,SLLNode prev){
        
        this.Data = Data;
        this.next = null;
        this.prev = null;
    }



    public void setData(String Data) {
        this.Data = Data;
    }

    public void setNext(SLLNode next) {
        this.next = next;
    }

    public void setPrev(SLLNode prev) {
        this.prev = prev;
    }

    public String getData() {
        return Data;
    }

    public SLLNode getNext() {
        return next;
    }

    public SLLNode getPrev() {
        return prev;
    }


    
}
