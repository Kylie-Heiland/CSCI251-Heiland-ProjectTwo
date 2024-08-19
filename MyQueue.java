/**
 * class MyQueue implemented using ArrayList. The index 0 element is the front of the queue
 * The last element of the queue has index tail
 * Kylie Heiland
 * 10/7/22
 */
import java.util.ArrayList;

public class MyQueue<E> //extends CSCI251ProjectTwo
{
    private ArrayList<E> list; // hold the elements in queue
    private int tail; // index of the last element in queue
    
    /**
     * constructor construct an empty queue
     */
    public MyQueue()
    {
        list = new ArrayList(); //Constructs a new empty list using the ArrayList constructor. 
    }
    
    /**
     * isEmpty return true if the queue is empty; false otherwise
     * @return true if the queue is empty; false otherwise
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
     * size return the size of the queue
     * @return the number of elements in queue
     */
    public int size()
    {
        return list.size();
    }
    
    /**
     * peek return the front element of the queue
     * @return the front element of the queue. If the queue is empty, return null
     */
    public E peek()
    {
        if(isEmpty())
        {
            return null;
        }
        return list.get(tail); //Returns the first item in the queue.
    }
    
    /**
     * pop remove the front element of the queue
     */
    public void pop()
    {
       list.remove(tail); //Removes the front element of the queue 
       tail--; //The front of the queue is now a new element, so tail should be decremented.
    }
    
    /**
     * push push a new element to the queue
     */
    public void push(E item)
    {
        list.add(0, item); //Adds the new item to the back of the list (or the front if the list is empty).
        tail = size() - 1; //Tail is the last element of the list.
    }
}
