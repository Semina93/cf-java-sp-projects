package gr.aueb.cf.ch6;

/**
 *
 */
public class StackApp {

    static int[] stack = new int[100];
    static int top = -1; //δείκτης που δείχνει πάντα στο τελευταίο στοιχείο της στοίβας


    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);

        int popped = pop();

        System.out.println(popped);
        System.out.println("Traversed");
        traverseStack();
    }

    public static void push (int num) {
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = num; //πρώτα θα γίνει το ++ δηλαδή πρώτα θα γίνει η πρόσθεση και μετά εφαρμόζονται τα υπόλοιπα.

    }
    public static int pop(){
        if(isEmpty()){
            System.out.println("Stack is full");
            return -1; //Θα μπορούσε να είναι και -1, οπότε δεν είναι σωστό αλλά το αφήνουμε για την ώρα. Θα λυθεί αργότερα.
        }
        return stack[top--];
    }

    public static boolean isFull() {
        return top == stack.length-1;
    }

    public static boolean isEmpty() {
        return top ==-1;
    }

    public static void traverseStack() {
        for (int i = top; i >=0;  i--) {
            System.out.print(stack[i]);
        }
    }
}
