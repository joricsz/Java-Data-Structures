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
        /*
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
        */
        /*
        Stack3 bookShelf = new Stack3(5);
        bookShelf.push(new Book(1, "Bloom into You", "Manga"));
        bookShelf.push(new Book(3, "Bloom into You: Saeki Side", "Light Novel"));
        bookShelf.push(new Book(8, "Classroom of the Elite", "Light Novel"));
        bookShelf.push(new Book(1, "I Want To Eat Your Pancreas", "Novel"));
        bookShelf.push(new Book(3, "The Detective is Already Dead", "Light Novel"));
        bookShelf.displayBook();
        //bookShelf.pop();
        //bookShelf.displayBook();
        System.out.println((bookShelf.peek()));
        System.out.println(bookShelf.isFull());
        bookShelf.clear();
        bookShelf.displayBook();
        System.out.println(bookShelf.isEmpty());
        */

        fun(5,10);
        System.out.println(box("exclamationX"));

    }

    static void fun(int n, int limit) {
        if(n <=0) {
            return;
        }
        if(n > limit) {
            return;
        }
        System.out.print(n + " ");
        fun(n+n,limit);
        System.out.print(n + " ");
   }

    static String box(String str) {
        String result = "";
        for (int i=0; i<str.length(); i++) {
            if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
              result = result + str.substring(i, i+1);
             }
            }
        return result;
        }

}