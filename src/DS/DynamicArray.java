
package DS;

import java.util.Arrays;


public class DynamicArray<T> {
 
    Object[] Data;
    int size;

    public DynamicArray(){
        
        size=0;
        Data = new Object[size];
        
        
    }
     
    public T get(int index){
        
       return (T)Data[index];
        
    }
    
    
    public int getsize(){
        return Data.length;
    }
    
    
    
    public void insert(int element){
        ensurecapacity(size+1);
        Data[size++] = element; 
    }
    
    public void ensurecapacity(int mincapacity){
        int oldCapacity = Data.length;
        if(mincapacity > oldCapacity){
            int newCapacity = oldCapacity*2;
            if(newCapacity < mincapacity)
                newCapacity = mincapacity;
            Data = Arrays.copyOf(Data, newCapacity);
        }
        
    }//For been DynamicArray;
    
    
    
    
}
