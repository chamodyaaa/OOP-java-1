import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<BorrowableItems> borrowableItemsList = new ArrayList<>();

    public void addLibraryItem(BorrowableItems item){
        borrowableItemsList.add(item);
    }

    public void checkoutItem(String title){
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book){
                Book book = (Book) item;
                if (book.getTitle().equals(title) && book.getAvailable()){
                    book.setAvailable(false);
                    System.out.println("checked out: "+ title);
                    return;
                }
            }
        }
        System.out.println("Book not found or already checked out: "+ title);
    }

    public void listAvailableItems() {
        System.out.println("Available items in the library:");
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.getAvailable()) {
                    book.displayInfo();
                }
            }
        }
    }
    public void displayLibraryInfo() {
        System.out.println("Total number of items in the library: " + borrowableItemsList.size());
    }
}

