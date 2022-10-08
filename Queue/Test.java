
public class Test{
    public static void main(String[] args) {
        Queue<Downloads> q = new Queue<>(5);
        q.enqueue(new Downloads(".docx", "SOUP Rubrics"));
        q.enqueue(new Downloads(".mp4", "Arnis"));
        q.enqueue(new Downloads(".xlsx", "Ratio Analysis"));
        q.enqueue(new Downloads(".pdf", "THY3 ppt"));
        q.enqueue(new Downloads(".ppt", "Database"));
        System.out.println(q.front());
        System.out.println(q.isFull());

        System.out.println(q.dequeue());
        q.dequeue();

        System.out.println(q.front());

        q.clear();
        System.out.println(q.isEmpty());
        q.dequeue();
    }
}