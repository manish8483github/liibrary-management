import java.util.ArrayList;
import java.util.List;

public class library {

    public static void main(String[] args) {
        
        List<book>library= new ArrayList<>();

        library.add(new book("The Catcher in the Rye", "J.D. Salinger"));
        library.add(new book("To Kill a Mockingbird", "Harper Lee"));
        library.add(new book("1984", "George Orwell"));


        //display all books
        System.out.println("book in the library");
        for(book book1: library){
            System.out.println(book1);

        }

        //remove book from library


        System.out.println("removed book...");

        library.removeIf(book->book.getTitle().equals("1984"));


        //display updated list
        System.out.println("updated book list");
        for(book book2: library){

            System.out.println(book2);
        }


    }
}