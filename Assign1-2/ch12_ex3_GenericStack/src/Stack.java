import java.util.LinkedList;
public class Stack<E> {
    private LinkedList<E> list = new LinkedList<>();
    
    public void push(E listitem){
        list.addFirst(listitem);
    }
    public E pop(){
        return list.removeFirst();
    }
    public E peek(){
     return list.peek();
    }
    public int size(){
        return list.size();
    }
}
