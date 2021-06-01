package Library;
import java.util.Scanner;
import java.time.Year;
import java.util.ArrayList;

public class BookManager {
    ArrayList<Book> createLibrary(ArrayList<Book> books) {

        books.add(new Book("Harry Potter", "J.K. Rowling", 1997));
        books.add(new Book("Game of Thrones: A Feast for Crows", "George R.R. Martin", 2005));
        books.add(new Book("David Copperfield", "Charles Dickens", 1940));
        books.add(new Book("The Stoic", "Theodor Dreiser", 1947));
        books.add(new Book("Martin Eden", "Jack London", 1909));

        printLibrary(books);

        return books;
    }

    private void deleteBook(ArrayList<Book> books) throws IncorrectIdException {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a book id to delete it: ");

        int temp = scanner.nextInt();

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if(book.id == temp) {
                books.remove(books.indexOf(book));
            }
        }

        System.out.println("The Library after delete is: ");
        printLibrary(books);
    }

    private void addBook(ArrayList<Book> books) throws IncorrectNameException, IncorrectAuthorException, IncorrectYearException  {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a book name: ");
        String bookName = scanner.nextLine();
        if(bookName.equals("") || bookName.length() < 3) {
            throw new IncorrectNameException();
        }
        System.out.println("Please enter a book author: ");
        String bookAuthor = scanner.nextLine();
        if(bookAuthor.length() < 3) {
            throw new IncorrectAuthorException();
        }
        System.out.println("Please enter a book publishing year: ");
        int bookPublishingYear = scanner.nextInt();
        int year = Year.now().getValue();
        if(bookPublishingYear < 0 || bookPublishingYear > year) {
            throw new IncorrectYearException();
        }

        books.add(books.size(), new Book(bookName, bookAuthor, bookPublishingYear));

        printLibrary(books);
    }

    void printLibrary(ArrayList<Book> books) {
        System.out.println("########## LIST OF BOOKS START ##########");
        for (int i = 0; i < books.size(); i++) {

            Book book = books.get(i);
            System.out.println("ID: " + book.id + " | "
                    + "name: " + book.getName() + " | "
                    + "author: " + book.getAuthor() + " | "
                    + "published: " + book.getYear());
        }
        System.out.println("########## LIST OF BOOKS END ##########");
    }

    private void showBookById(ArrayList<Book> books) throws IncorrectIdException {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a book id to show information about it: ");
        int temp = scanner.nextInt();
        if (temp > LibraryItem.getItemsCount() || temp < 0) {
            throw new IncorrectIdException();
        }
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (temp == book.id) {
                System.out.println("ID: " + book.id + " | " + book.getName() + " | " + book.getAuthor() + " | " + book.getYear());
                break;
            }
        }
    }

    private void showBookByName(ArrayList<Book> books) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter name of the book for show information about it: ");
        String temp = scanner.nextLine();
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getName() != null && temp.toLowerCase().equals(book.getName().toLowerCase())) {
                System.out.println("ID: " + book.id + " | " + book.getName() + " | " + book.getAuthor() + " | " + book.getYear());
                break;
            }
        }
    }

    void selectAct(ArrayList<Book> books, Menu menu) {
        String S = menu.selectMenu();
        if (S.equals("A")) {
            try {
                addBook(books);
            } catch (IncorrectNameException | IncorrectAuthorException | IncorrectYearException e) {
                e.printStackTrace();
            }
        } else if (S.equals("B")) {
            try {
                showBookById(books);
            } catch (IncorrectIdException e) {
                e.printStackTrace();
            }

        } else if (S.equals("C")) {
            showBookByName(books);
        } else if (S.equals("D")) {
            try {
                deleteBook(books);
            } catch (IncorrectIdException e) {
                e.printStackTrace();
            }
        } else {
            System.out.printf("Your input %s is wrong.", S);
        }
    }
}
