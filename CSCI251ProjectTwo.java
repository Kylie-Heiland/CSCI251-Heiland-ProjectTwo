/**
 * CSCI463ProjectTwo: Use MyStack and MyQueue to write a project that check if a sentence is palindrom
 * 
 * Kylie Heiland
 * 10/7/22
 */
import java.util.Scanner;

public class CSCI251ProjectTwo
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        String sentence;
        String again;
        do{
            System.out.println("Enter a sentence, I will tell you if it is a palindrome: ");
            sentence = input.nextLine();
            if(isPalindrome(sentence))
                System.out.println("\"" + sentence + "\" is a palindrome!");
            else
                System.out.println("\"" + sentence + "\" is not a palindrome!");
            System.out.println("Do you want another test (\"YES\" or \"NO\"): ");
            again = input.nextLine();
        }while(again.equalsIgnoreCase("YES"));
        
    }
    
    /**
     * isPalindrom returns true if the given String is a palindrom
     * @
     */
    public static boolean isPalindrome(String sentence)
    {
        // declare a MyStack s
        MyStack s = new MyStack();
        // declare a MyQueue q
        MyQueue q = new MyQueue();
       
        char c; //A temporary holding place for uppercase characters.
        
        for(int i = 0; i < sentence.length(); i++)
        {
           if(Character.isLetter(sentence.charAt(i)))
           { //If ith character in sentence is a letter
              c = Character.toUpperCase(sentence.charAt(i)); //Converts the character to uppercase.
                                                             //System.out.println(c); //Used to make sure that the above line worked correctly!
              s.push(c); //Pushes the uppercase character into s.
              q.push(c); //Pushes the uppercase character into q.
           }
        }
       /* 
        //This was all used to test and make sure that all of the functions in MyQueue and MyStack worked
        //accordingly!
        System.out.println("The length of the s is: " + s.size()); 
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println("The length of the s is: " + s.size());
        
        System.out.println("The length of the q is: " + q.size());
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.pop();
        }
        System.out.println("The length of the q is: " + q.size()); */
        
       if(!s.isEmpty() && !q.isEmpty()) //Checks and makes sure that there is at least one letter in the list/queue, since it is only looking to test if a sentence is 
                                       //a palindrome, not a string of numbers or special characters.
       {
        while(!s.isEmpty())
        {
            if(q.peek() != s.peek()) //If the front of the queue and the top of stack do not have the same character, it is NOT a palindrome.
            {
                return false;
            }
            s.pop(); //Removes the top of the stack.
            q.pop(); //Dequeues the front item of the queue.
       }
        return true;
        }
        System.out.println("The sentence does not have any letters in it...");
        return false; //Since the sentence was supposed to have letters, and it does not, it automatically fails the palindrome test.
    }
    
   
}

/* OUTPUT
 * 
Enter a sentence, I will tell you if it is a palindrome: 
ha@nn@ah
"ha@nn@ah" is a palindrome!
Do you want another test ("YES" or "NO"): 
YES
Enter a sentence, I will tell you if it is a palindrome: 
ha@nn@ah is a palindrome, because this program only looks at letters, not special characters.
"ha@nn@ah is a palindrome, because this program only looks at letters, not special characters." is not a palindrome!
Do you want another test ("YES" or "NO"): 
yes
Enter a sentence, I will tell you if it is a palindrome: 
Taylor Swift is one of the best artists to ever exist!
"Taylor Swift is one of the best artists to ever exist!" is not a palindrome!
Do you want another test ("YES" or "NO"): 
YES
Enter a sentence, I will tell you if it is a palindrome: 
Was it a car or a cat I saw?
"Was it a car or a cat I saw?" is a palindrome!
Do you want another test ("YES" or "NO"): 
yes
Enter a sentence, I will tell you if it is a palindrome: 
1101
The sentence does not have any letters in it...
"1101" is not a palindrome!
Do you want another test ("YES" or "NO"): 
yes
Enter a sentence, I will tell you if it is a palindrome: 
radar
"radar" is a palindrome!
Do you want another test ("YES" or "NO"): 
no
 */