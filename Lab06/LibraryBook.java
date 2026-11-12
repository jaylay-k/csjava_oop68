import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LibraryBook extends Book implements BorrowAble {
    private int id;
    private boolean availForBorrow;
    private LocalDate dateBorrow;
    private PrintType printType;

    public LibraryBook(int id, String title, String author, String pub, int yr, int numPages, PrintType printType) {
        super(title, author, pub, yr, numPages);
        this.id = id;
        this.printType = printType;
        this.availForBorrow = true;
    }
    public void setBookAvailableFalse() {
        this.availForBorrow = false;
    }
    public void setBookAvailableTrue() {
        this.availForBorrow = true;
    }
    public boolean isAvailable() {
        return this.availForBorrow;
    }
    @Override
    public String toString() {
        return ("LibraryBook [id=" + this.id + ", title=" + this.title + ", type=" + this.printType + ", avail=" + this.availForBorrow + "]");
    }
    @Override
    public boolean checkoutItem(int yy, int mm, int dd) {
        if(printType == PrintType.PRINT && availForBorrow) {
            this.dateBorrow = LocalDate.of(yy,mm,dd);
            this.availForBorrow = false;
            return true;
        } else {
            return false;
        }
    }
    @Override
    public int returnItem(int yy, int mm, int dd) {
        LocalDate today = LocalDate.of(yy,mm,dd);
        if(availForBorrow == false) {
            long daysBetween = ChronoUnit.DAYS.between(dateBorrow,today);
            this.availForBorrow = true;
            if(daysBetween > 7) {
                return (int)daysBetween - 7;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
