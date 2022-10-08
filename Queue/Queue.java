
public class Queue<E>{
    int front, back, size;
    E[] container;

    public Queue(int size){
        this.size = size;
        front = -1;
        back = -1;
        container = (E[]) new Object[size];
    }

    public boolean isFull(){
        if(back == size-1){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(front == -1 && back == -1){
            return true;
        }
        return false;
    }

    public void clear(){
        front = -1;
        back = -1;
    }

    public E front(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
        }
        return container[front];
    }
    
    public void enqueue(E item){
        if(isEmpty()){
            front++;
            back++;
            container[back] = item;
            return;
        }else if(isFull()){
            System.out.println("Queue is already full!");
            return;
        }
        back++;
        container[back] = item;
    }

    public E dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return null;
        }
        E item = container[front];
        front++;
        return item;
    }

}