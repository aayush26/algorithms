public class Queue{
    int front = 0;
    int rear = 0;
    
    boolean isEmpty(){
        return (front == rear);
    }
    
    void enqueue(final int[] queue, final int data, final int size){
        if(rear == size){
            System.out.println("Queue is full");
        } else {
            queue[rear] = data;
            rear++;
        }
    }
    
    int dequeue(final int[] queue, final int size){
        if(isEmpty()){
            System.out.println("Queue is empty");
        } else {
            queue[front] = null;
            front++;
            return queue[front];
        }
    }
    
    int size(){
        return (rear-frint);
    }
}
