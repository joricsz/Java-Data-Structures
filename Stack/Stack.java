
public class Stack{
    int top;
    int[] container;
    int size;

    public Stack(int size){
        this.size = size;
        this.container = new int[size];
        this.top = -1;
    }

    public void push(int num){
        if(checkStatus()) return;
        
        top++;
        container[top] = num;
    }

    public int pop(){
        int removedElem = container[top];
        top--;
        return removedElem;
    }

    public void displayStack(){
        for(int i=0; i<top+1; i++){
            System.out.print(container[i] + " ");
        }
        System.out.println();
    }

    public void clear(){
        top = -1;
    }

    public boolean isEmpty(){
        if(top == -1) return true;
        return false;
    }

    public int peek(){
        return container[top];
    }

    public boolean isFull(){
        if(top==size-1){
            return true;
        }
        return false;
    }

    public boolean checkStatus(){
        if(isFull()){
         System.out.println("Stack is already full...");
         return true;
        }
        return false;
    }
}