
public class Book{
    int volume;
    String series;
    String type;
    
    public Book(int volume, String series, String type){
        this.volume = volume;
        this.series = series;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book [series=" + series + ", type=" + type + ", volume=" + volume + "]";
    }
}