import java.util.HashMap;

public class Library {
    static HashMap<Integer,Book> allBooks = new HashMap<>();
    static {
        allBooks.put(1,new LibraryBook(1,"Charlotte's Web"
                     ,"EB White","abc",1952,100,PrintType.PRINT));
        allBooks.put(2,new LibraryBook(2,"Charlotte's Web"
                     ,"EB White","abc",1952,100,PrintType.ECOPY));
        allBooks.put(3,new LibraryBook(3,"The BFG"
                     ,"Roald Dahl","abc",1982,300,PrintType.PRINT));
        allBooks.put(4,new LibraryBook(4,"The Little Prince"
                     ,"Antoine de Saint-Exupéry","abc",1943,200,PrintType.ECOPY));
        allBooks.put(5,new ArchiveMaterial(5,"My Mister"
                     ,"not KBS","abc",2018,400,Status.READY));
        allBooks.put(6,new ArchiveMaterial(6,"Sword Snow Stride"
                     ,"CNTV","abc",2018,500,Status.REPAIRED));
    }
    public void printAllItems() {
        for(Book b: allBooks.values()) {
            System.out.println(b);
        }
    }
    public Book getBookById(int id) {
        return allBooks.get(id);
    }
    public boolean checkOut(Book item, int yy, int mm, int dd) {
        if(item instanceof LibraryBook B) {
            return B.checkoutItem(yy, mm, dd);
        } else {
            return false;
        }
    }
    public void checkIn(Book item, int yy, int mm, int dd) {
        if(item instanceof LibraryBook B) {
            if(B.isAvailable() == true) {
                System.out.println("The item has not been check out");
            } else {
                int daylate = B.returnItem(yy, mm, dd);
                if(daylate == 0) {
                    System.out.println("see you next time");
                } else {
                    System.out.println("Pay fine for " + daylate);
                }
            }
        }
    }
}
