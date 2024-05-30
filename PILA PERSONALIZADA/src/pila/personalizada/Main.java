import java.util.EmptyStackException;

public class Main {

    private static final int MAX_SIZE = 10;
    private static final Object[] stackArray = new Object[MAX_SIZE];

    
    public static boolean isEmpty() {
        int top = 0;
        return top == -1;
    }

    
    public static boolean isFull() {
        int top = 0;
        return top == MAX_SIZE - 1;
    }

   
    public static void push(Object item) {
        if (isFull()) {
            throw new StackOverflowError("La pila está llena");
        }
        int top = 0;
        stackArray[++top] = item;
    }

    
    public static Object pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int top = 0;
        return stackArray[top--];
    }

   
    public static Object peek(int top) {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top];
    }

    
    public static void printStack(int top) {
        System.out.println("Elementos de la pila:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }

    public static void main(String[] args) {
       
        push("Elemento 1");
        push("Elemento 2");
        push("Elemento 3");

        
        printStack();

        
        System.out.println("Elemento superior de la pila eliminado: " + pop());

       
        printStack();
    }

    private static void printStack() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
