
import java.util.Comparator;
public class OrderPageComparable {

    public int compare(Book o1, Book o2){
        return o1.getBookPage()-o2.getBookPage();
    }
}
