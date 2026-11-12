public class ArchiveMaterial extends Book {
    private int id;
    private Status status;

    public ArchiveMaterial(int id, String title, String author, String pub, int yr, int numPages, Status status) {
        super(title, author, pub, yr, numPages);
        this.id = id;
        this.status = status;
    }
    @Override
    public String toString() {
        return ("ArchiveMaterial [id=" + this.id + ", title=" + this.title + ", status=" + this.status + ", message=" + this.status.sayHi() + "]");
    }
}
