public abstract class Book {
    protected String isbn;
    protected String title;
    protected String author;
    protected String publisher;
    protected int year;
    protected int numberOfPages;
    private int currentPageNumber;
    
    public Book(String title, String author, String pub, int yr, int numPages) {
        this.title = title;
        this.author = author;
        this.publisher = pub;
        this.year = yr;
        this.numberOfPages = numPages;
    }
    public void turnPageForward() {
        if(this.currentPageNumber < numberOfPages) {
            this.currentPageNumber++;
        }
    }
    public void turnPageBackward() {
        if(this.currentPageNumber > 1) {
            this.currentPageNumber--;
        }
    }
    public int nowAtPage() {
        return this.currentPageNumber;
    }
    public String getTitle() {
        return this.title;
    }
}