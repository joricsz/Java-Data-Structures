
public class Stack3{
    int top;
    int size;
    Book [] container;

    public Stack3(int size){
        top = -1;
        this.size = size;
        container = new Book[size];
    }

    public void push(Book book){
        top++;
        container[top] = book;
    }

    public void pop(){
        top--;
    }

    public Book peek(){
        return container[top];
    }

    public void displayBook(){
        System.out.println("List of Books:");
        if(top==-1)
            System.out.println("Empty...");
        for(int i=0; i<=top; i++){
            System.out.println(container[i]);
        }
    }

    public boolean isFull(){
        if(top==size-1)
            return true;
        return false;
    }

    public boolean isEmpty(){
        if(top==-1)
            return true;
        return false;
    }

    public void clear(){
        top = -1;
    }
}