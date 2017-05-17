
public class SLLNode {


public String Data;
public SLLNode next;

    public SLLNode(String Data) {
        this(Data,null);
    }
    public SLLNode(String Data, SLLNode next) {
        this.Data = Data;
        this.next = next;
    }
}
