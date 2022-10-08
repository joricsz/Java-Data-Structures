
public class Downloads{
    String fileType;
    String fileTitle;

    public Downloads(String fileType, String fileTitle){
        this.fileType = fileType;
        this.fileTitle = fileTitle;
    }

    @Override
    public String toString() {
        return "File Title: " + fileTitle + ", File Type: " + fileType;
    }
}