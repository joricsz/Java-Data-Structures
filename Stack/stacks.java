//import java.util.Stack;
public class Test{

    public static void main(String[] args) {
        /*
        Stack objects = new Stack();
        objects.add("Hello");
        objects.add(1);
        objects.add(true);
        System.out.println(objects);
        objects.remove(true);
        System.out.println(objects);
        //objects.clear();

        System.out.println(objects.isEmpty());
        System.out.println(objects.firstElement());
        */
        /*
        Stack stonks = new Stack(2);
        stonks.push(1);
        stonks.push(2);
        stonks.push(3);
        stonks.displayStack();
        stonks.pop();
        stonks.displayStack();
        //stonks.clear();
        System.out.println(stonks.peek());

        System.out.println(stonks.isEmpty());
        System.out.println(stonks.isFull());
        */

        Stack2 studentList = new Stack2(5);
        studentList.push(new Student(1, "Jorics", "Rica", "ISA"));
        studentList.push(new Student(1, "Jorics", "Rica", "DLWA"));
        studentList.push(new Student(1, "Jorics", "Rica", "TATLO"));
        studentList.pop();
        //studentList.displayStudents();
        studentList.clear();
        if(studentList.isFull())
            System.out.println("stack is full...");
        else    
            System.out.println("stack is not yet full...");

    }
}