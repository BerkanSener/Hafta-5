import java.util.TreeSet;

public class Main {
    public static void main(String[] args){

        TreeSet<Book> book = new TreeSet<>(new OrderNameComparable());
        book.add(new Book("Ferrarisini Satan Bilge", 232, "Robin SHARMA", 1996));
        book.add(new Book("1984", 352,"George ORWELL", 2000));
        book.add(new Book("Sefiller", 512, "Victor HUGO", 1862));
        book.add(new Book("Romeo ve Juliet", 133, "William SHAKESPEARE", 1597));

        for (Book books : book){
            System.out.println(books.getBookName() + "Kitap Serisi Toplam" + " " + books.getBookPage() + "Sayfaya Sahirtir" );
        }
    }
}