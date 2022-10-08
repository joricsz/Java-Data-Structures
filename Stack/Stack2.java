
public class Stack2{
    int top;
    Student[] container;
    int size;

    public Stack2(int size){
        container = new Student [size];
        top = -1;
    }

    public void push(Student stud){
        top++;
        container[top] = stud;
    }

    public Student pop(){
        Student temp = container[top];
        top--;
        return temp;
    }

    public void displayStudents(){
        for(int i=0; i<top+1; i++){
            System.out.println(container[i]);
        }
    }

    public void clear(){
        top = -1;
    }

    public boolean isEmpty(){
        if(top==-1)return true;
        return false;
    }

    public boolean isFull(){
        if(top==size-1)return true;
        return false;
    }

    public Student peek(){
        return container[top];
    }

}