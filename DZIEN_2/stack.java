package marcin.com;

import java.util.Stack;

public class Main {

    static void stack_push(Stack<Integer> stack){
        for(int i=0;i<5;i++){
            stack.push(i);
        }
    }

    static void stack_pop(Stack<Integer> stack){
        System.out.println("operacja na stosie: pop");
        for(int i=0;i<5;i++){
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    static void  stack_peek(Stack<Integer> stack){
        System.out.println("opercja na stosie: peek");
        Integer element = (Integer) stack.peek();
        System.out.println("element z góry stosu: " + element);
    }

    static void stack_search(Stack<Integer> stack, int element){
        Integer pos = (Integer) stack.search(element);
        if(pos==-1)
            System.out.println("brak elementu");
        else
            System.out.println("element na pozycji: " + pos);
    }



    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);

        stack_search(stack,2);
        stack_search(stack,0);
        stack_search(stack,7);

    }
}

