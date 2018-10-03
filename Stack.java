public class Stack{
    int top = -1;
    
    void push(final int[] stack, final int data, final int size){
        if(top == size - 1){
            System.out.println("Stack overflow");
        } else {
            top = top + 1;
            stack[top] = data;
        }
    }
    
    boolean isEmpty(){
        return (top == -1) true : false;
    }
    
    int pop(final int[] stack, final int size){
        if(isEmpty()){
            System.out.println("Stack is empty");
        } else {
            top = top - 1;
            return stack[top];
        }
    }
    
    int size(){
        return top+1;
    }
}
