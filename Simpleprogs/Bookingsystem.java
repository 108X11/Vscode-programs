import java.util.ArrayList;
import java.util.Scanner;

class BookingSystem {
  private ArrayList<String> bookingsystem = new ArrayList<>();
  Scanner scanner = new Scanner(System.in);

  public void Addbook(String book_name) {

    book_name = scanner.nextLine();

    while (!book_name.equals("exit")) {
      bookingsystem.add(book_name);
      book_name = scanner.nextLine();
    }
  }

  public void Removebook(String book_name) {
    if (bookingsystem.contains(book_name)) {
      bookingsystem.remove(book_name);
      System.out.println("The book named " + book_name + " is successfully removed!");
    } else {
      System.out.println("The book named " + book_name + " is not found!");
    }
  }

  public void Borrowbook(String book_name) {
    if (bookingsystem.contains(book_name)) {
      bookingsystem.remove(book_name);
      System.out.println("The book named " + book_name + " is found!");
      System.out.println("You can borrow the book!");
    } else {
      System.out.println("The book named " + book_name + " is not found!");
    }
  }

  public void Showlist() {
    System.out.println("Book list: ");
    for (String booklist : bookingsystem) {
      System.out.println("-" + booklist);
    }
  }

  public void closeScanner() {
    scanner.close();
  }
}

public class Bookingsystem {
  public static void main(String[] args) {
    BookingSystem bookingSystem = new BookingSystem();
    Scanner scan = new Scanner(System.in);

    while (true) {
      System.out.println("What do you want to do? ");
      System.out.println("1. Add a book");
      System.out.println("2. Remove a book");
      System.out.println("3. Borrow a book");
      System.out.println("4. Show list of book");
      System.out.println("5. Exit the program");
      System.out.print("Enter a choice: ");
      char choice = scan.next().charAt(0);
      scan.nextLine();

      switch (choice) {
        case '1':
          System.out.println("Add all book you want to add / type exit you're done");
          System.out.println("Enter a book: ");
          String booktoAdd = scan.nextLine();
          bookingSystem.Addbook(booktoAdd);
          break;
        case '2':
          System.out.println("Enter a book: ");
          String booktoRemove = scan.nextLine();
          bookingSystem.Removebook(booktoRemove);
          break;
        case '3':
          System.out.println("Enter a book: ");
          String booktoBorrow = scan.nextLine();
          bookingSystem.Borrowbook(booktoBorrow);
          break;
        case '4':
          bookingSystem.Showlist();
          break;
        case '5':
          System.out.println("Program Finished!!!");
          bookingSystem.closeScanner();
          System.exit(0);
          break;
        default:
          System.out.println("Invalid keyword!!");
          break;
      }
    }
  }
}
