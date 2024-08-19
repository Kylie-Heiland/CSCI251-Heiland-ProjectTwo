/**
 * class MyStack: A stack class implemented by using ArrayList
 * All stack elements are stored in an ArrayList. The top element
 * has index top
 * 
 * Kylie Heiland
 * 10/7/22
 */
import java.util.ArrayList;

public class MyStack<E> extends CSCI251ProjectTwo
{
    private ArrayList<E> list; // used to store elements in stack
    private int top = 0; // the index of top element. Since the top will always be 0, it is initalized to that.
    
    /**
     * constructor construct an empty stack
     */
    public MyStack()
    {
        list = new ArrayList(); //Uses the ArrayList constructor to make an empty stack.
    }
    
    /**
     * push push a given element on the top of the stack
     */
    public void push(E item)
    {
        list.add(top, item); //Adds the character to the top of the list!
    }
    
    /**
     * isEmpty return true if the stack is empty; false otherwise
     * @return true if the stack is empty; false otherwise
     */
    public boolean isEmpty()
    {
        if(list.isEmpty())
        {
            return true;
        }
        return false;
    }
    
    /**
     * peek Return the top element
     */
    public E peek()
    {
       return list.get(top);
    }
    
    /**
     * pop Remove the top element from the stack. If the stack is empty,nothing happen
     */
    public void pop()
    {
       if(isEmpty())
       {
           return;
       }
       list.remove(top);
    }
    
    /**
     * size return the size of the stack
     * @return number of elements in stack
     */
    public int size()
    {
        return list.size();
    }
}