import java.util.Collection;
import java.util.Comparator;

public class OrderNameComparable implements Comparator<Book>{

    public int compare(Book o1, Book o2){
        return o1.getBookName().compareTo(o2.getBookName());
    }
}